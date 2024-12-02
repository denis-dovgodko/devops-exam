package com.testapp.testapp.calc;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ProgressionTest {
    private static Progression progression = null;
    private static Progression empty_progression = null;

    @BeforeAll
    static void setUp() {
        progression = new Progression(4);
        empty_progression = new Progression(0);
    }

    @org.junit.jupiter.api.Test
    void testCalcSumm() {
        assertEquals(26, progression.CalcSumm());
        assertNotEquals(0, empty_progression.CalcSumm());
    }
}