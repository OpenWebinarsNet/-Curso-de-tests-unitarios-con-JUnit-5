package com.example.seccion4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class BRepeatedTest {

    @Test
    void test1() {
        System.out.println("Prueba concepto test1");
    }

    @RepeatedTest(value = 3)
    void test2() {
        System.out.println("Prueba concepto test2");
    }

    @DisplayName("Caso de test 3")
    @RepeatedTest(value = 3, name = RepeatedTest.SHORT_DISPLAY_NAME)
    void test3() {
        System.out.println("Prueba concepto test3");
    }

    @DisplayName("Caso de test 4")
    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    void test4() {
        System.out.println("Prueba concepto test3");
    }

    @DisplayName("Caso de test 4")
    @RepeatedTest(value = 3, name = "{displayName} - {currentRepetition} / {totalRepetitions}")
    void test5() {
        System.out.println("Prueba concepto test3");
    }




}
