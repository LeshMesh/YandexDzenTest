package ru.yandex.zen;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestLocators {
    public static SelenideElement
            loginInput = $("[name=login]"),
            passwordInput = $("[name=passwd]"),
            settingsButton = $(".zen-ui-button__content-wrapper"),
            saveButtonPhoto = $("#profile_page_save_avatar"),
            saveButtonName = $(".p-control-saveblock-button"),
            saveButtonSettings = $(byText("Сохранить изменения")),
            linkChangePhotoProfile = $(".profile-editor__link"),
            linkPhotoProfile = $("[name=attachment]"),
            changeButton = $(byText("Изменить")),
            displayName = $("[name=displayname]"),
            valueName = $("[value=ANOTHER]"),
            displayNameAnother = $("[name=display_name]"),
            desktopName = $("[itemprop=name]"),
            clearText = $(".Textinput-Clear"),
            boxAbout = $("[placeholder=\"Расскажите о себе\"]"),
            boxAboutDesktop = $("[itemprop=description]"),
            deactivateProfile = $(byText("Деактивировать профиль")),
            linkHideInterests = $("div .profile-deactivate__hint"),
            titleSettingsProfile = $("div .profile-editor__title");
}
