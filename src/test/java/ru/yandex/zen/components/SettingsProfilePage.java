package ru.yandex.zen.components;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.yandex.zen.TestData.*;
import static ru.yandex.zen.TestLocators.*;

public class SettingsProfilePage {

    public SettingsProfilePage authorization() {
        open("https://zen.yandex.ru/user");
        $(loginInput).setValue(login1).pressEnter();
        $(passwordInput).setValue(password1).pressEnter();
        return this;
    }

    public SettingsProfilePage openSettingsProfile() {
        $(settingsButton).click();
        return this;
    }
}
