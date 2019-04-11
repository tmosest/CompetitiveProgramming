package com.tmosest.competitiveprogramming.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Number Utility tests")
class NumUtilTest {

    @Test
    @DisplayName("First test")
    fun `gcd of 2 and 3 is 1`() {
        assertEquals(1, NumUtil.calculateGcd(2, 3))
    }

    @Test
    @DisplayName("First test")
    fun `gcd of 2 and 4 is 2`() {
        assertEquals(2, NumUtil.calculateGcd(2, 4))
    }
}