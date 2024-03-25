package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("bitmask")
@Tag("dynamic")
@Tag("string")
@Tag("wc379")
@DisplayName("LeetCode: 3003. Maximize the Number of Partitions After Operations")
class MaximizeTheNumberOfPartitionsAfterOperationsTest {
    private MaximizeTheNumberOfPartitionsAfterOperations maximizeTheNumberOfPartitionsAfterOperations;

    @BeforeEach
    void setup() {
        maximizeTheNumberOfPartitionsAfterOperations = new MaximizeTheNumberOfPartitionsAfterOperations();
    }

    private void test(int output, String s, int k) {
        Assertions.assertEquals(output,
                maximizeTheNumberOfPartitionsAfterOperations.maxPartitionsAfterOperations(s, k));
    }

    @Test
    void test0() {
        test(3, "accca", 2);
    }
}
