package ru.dshcherbakov.web.tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(FirstTest.class)
public class TestSuite {
}
