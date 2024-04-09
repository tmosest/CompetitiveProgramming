package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("greedy")
@Tag("wc366")
@DisplayName("LeetCode: 2895. Minimum Processing Time")
class MinimumProcessingTimeTest {
    private MinimumProcessingTime minimumProcessingTime;

    @BeforeEach
    void setup() {
        minimumProcessingTime = new MinimumProcessingTime();
    }

    private void test(int output, List<Integer> processorTime, List<Integer> tasks) {
        Assertions.assertEquals(output, minimumProcessingTime.minProcessingTime(processorTime, tasks));
    }

    @Test
    void test0() {
        test(16, List.of(8, 10), List.of(2, 2, 3, 1, 8, 7, 4, 5));
    }

    @Test
    void test1() {
        test(23, List.of(10, 20), List.of(2, 3, 1, 2, 5, 8, 4, 3));
    }

    @Test
    void test2() {
        test(461, List.of(121, 99), List.of(287, 315, 293, 260, 333, 362, 69, 233));
    }
}
