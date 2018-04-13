package ru.mlarin.screenshot;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TakeScrenshoot {
    @Test
    void Test() {
        Configuration.reportsFolder = "src/test/resources";

        open("https://www.google.ru/");
        screenshot("myscreen");

    }
}
