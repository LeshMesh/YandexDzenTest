package ru.yandex.zen;

import org.junit.jupiter.api.AfterEach;
import ru.yandex.zen.components.SettingsProfilePage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    SettingsProfilePage SettingsProfilePage = new SettingsProfilePage();

    @AfterEach
    void AfterEach() {
        closeWebDriver();
    }
}
