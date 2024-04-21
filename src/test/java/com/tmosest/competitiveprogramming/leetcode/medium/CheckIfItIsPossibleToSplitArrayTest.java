package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("wc357")
@Tag("dynamic")
@Tag("array")
@DisplayName("LeetCode: 2811. Check if it is Possible to Split Array")
class CheckIfItIsPossibleToSplitArrayTest {
    private CheckIfItIsPossibleToSplitArray checkIfItIsPossibleToSplitArray;

    @BeforeEach
    void setup() {
        checkIfItIsPossibleToSplitArray = new CheckIfItIsPossibleToSplitArray();
    }

    private void test(boolean output, List<Integer> nums, int m) {
        Assertions.assertEquals(output, checkIfItIsPossibleToSplitArray.canSplitArray(nums, m));
    }

    @Test
    void test0() {
        test(true, List.of(2, 2, 1), 4);
    }

    @Test
    void test1() {
        test(false, List.of(2, 1, 3), 5);
    }

    @Test
    void test2() {
        test(true, List.of(2, 3, 3, 2, 3), 6);
    }
}
