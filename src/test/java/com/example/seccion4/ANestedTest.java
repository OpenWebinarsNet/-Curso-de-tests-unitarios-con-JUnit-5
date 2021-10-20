package com.example.seccion4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests para servicio SmartPhone")
public class ANestedTest {

    @Test
    @DisplayName("Test1")
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Nested
    @DisplayName("operaciones recuperar datos")
    class Grupo1 {
        @Test
        @DisplayName("Find all()")
        void test2() {
            System.out.println("test2");
            assertTrue(true);
        }

        @Test
        @DisplayName("Find one()")
        void test3() {
            System.out.println("test3");
            assertTrue(true);
        }

        @Test
        @DisplayName("Find by CPU cores()")
        void test4() {
            System.out.println("test4");
            assertTrue(true);
        }

    }

    @Nested
    @DisplayName("operaciones insercion nuevos datos")
    class Grupo2 {

        @Test
        @DisplayName("Insert one")
        void test5() {
            System.out.println("test5");
            assertTrue(true);
        }

        @Test
        @DisplayName("Insert in batch")
        void test6() {
            System.out.println("test5");
            assertTrue(true);
        }
    }


}
