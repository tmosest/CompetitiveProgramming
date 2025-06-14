package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("dynamic")
@Tag("wc453")
@Tag("string")
@DisplayName("LeetCode: 3579. Minimum Steps to Convert String with Operations")
class MinimumStepsToConvertStringWithOperationsTest {
    private MinimumStepsToConvertStringWithOperations minimumStepsToConvertStringWithOperations;

    @BeforeEach
    void setup() {
        minimumStepsToConvertStringWithOperations = new MinimumStepsToConvertStringWithOperations();
    }

    private void test(int output, String word1, String word2) {
        Assertions.assertEquals(output, minimumStepsToConvertStringWithOperations.minOperations(word1, word2));
    }

    @Test
    void test0() {
        test(4, "abcdf", "dacbe");
    }
}
