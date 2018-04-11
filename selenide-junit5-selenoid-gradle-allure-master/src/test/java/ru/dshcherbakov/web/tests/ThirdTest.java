package ru.dshcherbakov.web.tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeClassNamePatterns;

@IncludeClassNamePatterns
@Tag("slow")
public class ThirdTest extends CompositeAnnotations {

    @Test
    @Tag("slow")
    void test9() {

        System.out.println("Test9");

    }

    @Test
    @Tag("slow")
    void test10() {

        System.out.println("Test10");

    }

    @SlowSlowMethodTest
    void test11() {

        System.out.println("Test11");

    }

    @SlowSlowMethodTest
    void test12() {

        System.out.println("Test12");

    }
}

