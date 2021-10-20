package com.example.seccion1;

import com.example.demo.service.SmartPhoneService;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CAssertAllTest {


    @Test
    void assertAllTest() {

        // Class Under Test
        // System Under Test (SUT)
        SmartPhoneService service = new SmartPhoneServiceImpl();

        Integer count = service.count();

        // aserciones

        assertAll("Comprobaciones",
                () -> assertNotNull(count),
                () -> assertTrue(count > 0),
                () -> assertEquals(3, count)
                );
    }
}
