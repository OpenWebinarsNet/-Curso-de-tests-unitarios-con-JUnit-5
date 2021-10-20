package com.example.seccion1;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneService;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BExceptionsTest {

    @Test
    void findOneIllegalArgumentExceptionTest() {

        SmartPhoneService service = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, () -> service.findOne(null));


    }
}
