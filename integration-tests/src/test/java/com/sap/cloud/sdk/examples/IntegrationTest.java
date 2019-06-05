package com.sap.cloud.sdk.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegrationTest {
    @Test
    public void test() {
        HelloWorld.main(new String[]{"Hello", "World"});
        HelloWorld hello = new HelloWorld();
        assertTrue(true);
    }
}
