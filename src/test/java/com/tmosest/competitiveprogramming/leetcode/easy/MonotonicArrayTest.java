package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc100")
@DisplayName("LeetCode: 896. Monotonic Array")
class MonotonicArrayTest {
    private MonotonicArray monotonicArray;

    @BeforeEach
    void setup() {
        monotonicArray = new MonotonicArray();
    }

    private void test(boolean output, int[] nums) {
        Assertions.assertEquals(output, monotonicArray.isMonotonic(nums));
    }

    @Test
    void test0() {
        test(true, new int[] { 1, 2, 2, 3 });
    }

    @Test
    void test1() {
        test(true, new int[] { 6, 5, 4, 4 });
    }

    @Test
    void test2() {
        test(false, new int[] { 1, 3, 2 });
    }
}
