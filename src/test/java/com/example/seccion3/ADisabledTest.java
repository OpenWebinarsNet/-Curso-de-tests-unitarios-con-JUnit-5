package com.example.seccion3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ADisabledTest {

    @Test
    //@Disabled("Until bug #12300 fix")
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Test
    @Disabled("Until feature #11900")
    void test2() {
        System.out.println("test2");
        assertTrue(true);
    }

}
