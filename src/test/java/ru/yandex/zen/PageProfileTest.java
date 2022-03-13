package ru.yandex.zen;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static ru.yandex.zen.TestData.*;
import static ru.yandex.zen.TestLocators.*;

public class PageProfileTest extends TestBase {

    @Test
    void addPhotoProfileTest() {
        SettingsProfilePage.authorization()
                .openSettingsProfile();
        $(linkChangePhotoProfile).click();
        $(linkPhotoProfile).uploadFromClasspath(pathPhotoProfile);
        $(saveButtonPhoto).click();
    }

    @Test
    void changeNameProfileTest() {
        SettingsProfilePage.authorization()
                .openSettingsProfile();
        $(changeButton).click();
        $(displayName).click();
        $(valueName).click();
        $(clearText).click();
        $(displayNameAnother).setValue(nameProfileChange);
        $(saveButtonName).click();
        $(desktopName).shouldHave(Condition.text(nameProfileChange));
    }

    @Test
    void addAboutTest() {
        SettingsProfilePage.authorization()
                .openSettingsProfile();
        $(boxAbout).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        $(boxAbout).append(textBoxAbout);
        $(saveButtonSettings).click();
        $(boxAboutDesktop).shouldHave(Condition.text(textBoxAbout));
    }

    @Test
    void deactivateProfileInterestsTest() {
        SettingsProfilePage.authorization()
                .openSettingsProfile();
        $(deactivateProfile).click();
        $$("div .zen-ui-radio__box").first().click();
        $(linkHideInterests).click();
        $(titleSettingsProfile).shouldHave(Condition.text(textTitleSettingsProfile));
    }

    @Test
    void deactivateProfileLikeTest() {
        SettingsProfilePage.authorization()
                .openSettingsProfile();
        $(deactivateProfile).click();
        $$("div .zen-ui-radio__box").get(1).click();
        $(linkHideInterests).click();
        $(titleSettingsProfile).shouldHave(Condition.text(textTitleSettingsProfile));
    }
}
