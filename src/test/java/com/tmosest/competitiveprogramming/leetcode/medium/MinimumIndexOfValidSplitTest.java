package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("sort")
@Tag("wc354")
@Tag("set")
@Tag("array")
@DisplayName("LeetCode: 2780. Minimum Index of a Valid Split")
class MinimumIndexOfValidSplitTest {
    private MinimumIndexOfValidSplit minimumIndexOfValidSplit;

    @BeforeEach
    void setup() {
        minimumIndexOfValidSplit = new MinimumIndexOfValidSplit();
    }

    private void test(int output, List<Integer> nums) {
        Assertions.assertEquals(output, minimumIndexOfValidSplit.minimumIndex(nums));
    }

    @Test
    void test0() {
        test(2, List.of(1, 2, 2, 2));
    }

    @Test
    void test1() {
        test(4, List.of(2, 1, 3, 1, 1, 1, 7, 1, 2, 1));
    }
}
