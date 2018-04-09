package ru.dshcherbakov.web.tests;



import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class FirstTest extends CompositeAnnotations {


    @Test
    @Tag("fast")
    void test1() {

        System.out.println("FirstTest");
        System.out.println("FirstTest");

    }


    @Test
    @Tag("fast")
    void test2() {

        System.out.println("SecondTest");

    }

    @FastSlowMethodTest
    void test3() {

        System.out.println("ThirdTest");

    }

    @FastSlowMethodTest
    void test4() {

        System.out.println("Test4");

    }
}
