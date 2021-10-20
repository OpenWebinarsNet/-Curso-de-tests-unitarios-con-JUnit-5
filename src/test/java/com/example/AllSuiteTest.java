package com.example;

import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.example")
//@IncludeTags("database")
public class AllSuiteTest {
}
