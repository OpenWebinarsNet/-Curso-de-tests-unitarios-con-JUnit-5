package com.example.seccion1;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneService;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("SmartPhoneService CRUD tests")
public class DDisplayNameTest {

    @Test
    @DisplayName("findOne null Illegal Argument Exception")
    void test1() {

        SmartPhoneService service = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, () -> service.findOne(null));

    }

    @Test
    @DisplayName("findOne smartphone id 1")
    void test2() {

        SmartPhoneService service = new SmartPhoneServiceImpl();

        SmartPhone result = service.findOne(1L);
        assertNotNull(result);
        assertEquals(1L, result.getId());

    }
}
