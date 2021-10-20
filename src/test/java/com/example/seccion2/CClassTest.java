package com.example.seccion2;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CClassTest {


    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");

    }

    @Order(2)
    @Test
    void hola() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Order(1)
    @Test
    void adios() {
        System.out.println("test2");
        assertTrue(true);
    }


}
