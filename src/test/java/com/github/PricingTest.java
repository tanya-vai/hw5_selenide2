package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PricingTest {

    @BeforeAll
    static void configure() {
        Configuration.headless = true;
    }

    @Test
    void checkThatPricingPageIsOpened() {
        open("https://github.com/");

        $$("ul li").findBy(text("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("div h1").shouldHave(text("Choose the plan that’s right for you."));

    }
}
