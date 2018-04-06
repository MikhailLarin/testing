package ru.dshcherbakov.web.tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


public class CsvTest {
    @ParameterizedTest

    @CsvFileSource(resources ="/test.csv",delimiter = ';')
    @Tag("drugoe")
    void testCsv(String first, String second, String third) throws IOException {
        assertNotNull(first);
        assertNotNull(second);
        assertNotNull(third);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        }


}








