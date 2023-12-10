package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class ExampleConfigTest {

    @Inject
    MyConfig myConfig;

    @Inject
    MyOtherConfig myOtherConfig;

    @Test
    void configs_should_be_equal() {

        assertEquals(myConfig.foo(), myOtherConfig.config().foo());
        assertEquals(myConfig.list(), myOtherConfig.config().list());
        assertEquals(myConfig.nested().nestedName(), myOtherConfig.config().nested().nestedName());
        assertEquals(myConfig.map(), myOtherConfig.config().map());
    }
}