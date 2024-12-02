package com.testapp.testapp.calc;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgressionTest {
    private static Progression progression = null;
    private static Progression empty_progression = null;

    @BeforeAll
    static void setUp() {
        progression = new Progression(4);
        empty_progression = new Progression(0);
    }

    @org.junit.jupiter.api.Test
    void testNotNullCalcSumm() {
        assertEquals(26, progression.CalcSumm());
    }
    @org.junit.jupiter.api.Test
    void testNullCalcSumm() {
        assertEquals(0, empty_progression.CalcSumm());
    }

}