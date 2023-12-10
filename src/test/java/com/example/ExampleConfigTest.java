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
    void config_foos_should_be_equal() {

        assertEquals(myConfig.foo(), myOtherConfig.config().foo());
    }

    @Test
    void config_lists_should_be_equal() {

        assertEquals(myConfig.list(), myOtherConfig.config().list());
    }

    @Test
    void config_nested_should_be_equal() {

        assertEquals(myConfig.nested().nestedName(), myOtherConfig.config().nested().nestedName());
    }

    @Test
    void config_maps_should_be_equal() {

        assertEquals(myConfig.map(), myOtherConfig.config().map());
    }

}