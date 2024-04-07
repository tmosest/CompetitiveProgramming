package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("greedy")
@Tag("wc368")
@DisplayName("LeetCode: 2910. Minimum Number of Groups to Create a Valid Assignment")
class MinimumNumberOfGroupsToCreateValidAssignmentTest {
    private MinimumNumberOfGroupsToCreateValidAssignment minimumNumberOfGroupsToCreateValidAssignment;

    @BeforeEach
    void setup() {
        minimumNumberOfGroupsToCreateValidAssignment = new MinimumNumberOfGroupsToCreateValidAssignment();
    }

    private void test(int output, int[] balls) {
        Assertions.assertEquals(output,
                minimumNumberOfGroupsToCreateValidAssignment.minGroupsForValidAssignment(balls));
    }

    @Test
    void test0() {
        test(2, new int[] { 3, 2, 3, 2, 3 });
    }

    @Test
    void test1() {
        test(4, new int[] { 10, 10, 10, 3, 1, 1 });
    }
}
