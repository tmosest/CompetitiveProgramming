package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("sort")
@Tag("wc355")
@Tag("greedy")
@Tag("binarySearch")
@Tag("array")
@DisplayName("LeetCode: 2790. Maximum Number of Groups With Increasing Length")
class MaximumNumberOfGroupsWithIncreasingLengthTest {
    private MaximumNumberOfGroupsWithIncreasingLength maximumNumberOfGroupsWithIncreasingLength;

    @BeforeEach
    void setup() {
        maximumNumberOfGroupsWithIncreasingLength = new MaximumNumberOfGroupsWithIncreasingLength();
    }

    private void test(int output, List<Integer> usageLimits) {
        Assertions.assertEquals(output, maximumNumberOfGroupsWithIncreasingLength.maxIncreasingGroups(usageLimits));
    }

    @Test
    void test0() {
        test(3, List.of(1, 2, 5));
    }
}
