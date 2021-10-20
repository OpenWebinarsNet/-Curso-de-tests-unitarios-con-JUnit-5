package com.example.seccion4;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("persistence")
@Tag("mysql")
public class DTagFilterTest {

    @Tag("database")
    @Test
    void test1() {
        System.out.println("Test 1 DTagFilterTest");
    }

    @Test
    void test2() {
        System.out.println("Test 2 DTagFilterTest");
    }

}
