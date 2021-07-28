package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities util;
    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
            {"ABCDEFF", "ABCDEF"},
            {"AB88EFFG", "AB8EFG"},
            {"112233445566", "123456"},
            {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals(output, util.removePairs(input));
    }
}