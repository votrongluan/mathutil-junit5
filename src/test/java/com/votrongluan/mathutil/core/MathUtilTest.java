/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.votrongluan.mathutil.core;

import static com.votrongluan.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author trong
 */
public class MathUtilTest {

    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgumentReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }

    // Bắt ngoại lệ khi đưa data cà chớn
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
    }
}
