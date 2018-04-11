package ru.dshcherbakov.web.tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.runner.RunWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.codeborne.selenide.Selenide.open;


public class SecondTest extends CompositeAnnotations{



    @Test
    @Tag("fast")
    void test5() {

        System.out.println("Test5");

    }

    @Test
    @Tag("fast")
    void test6() {

        System.out.println("Test6");

    }

   @FastSlowMethodTest
    void test7() {
        // open("https://www.google.com");
        System.out.println("Test7");

    }

    @FastSlowMethodTest
    void test8() {
        System.out.println(System.getProperty("param_name"));
        System.out.println("Test8");

    }
}

