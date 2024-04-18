package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("stack")
@Tag("wc358")
@Tag("math")
@Tag("list")
@DisplayName("LeetCode: 2817. Minimum Absolute Difference Between Elements With Constraint")
class MinimumAbsoluteDifferenceBetweenElementsWithConstraintTest {
    private MinimumAbsoluteDifferenceBetweenElementsWithConstraint minimumAbsoluteDifferenceBetweenElementsWithConstraint;

    @BeforeEach
    void setup() {
        minimumAbsoluteDifferenceBetweenElementsWithConstraint = new MinimumAbsoluteDifferenceBetweenElementsWithConstraint();
    }

    private void test(int output, List<Integer> nums, int x) {
        Assertions.assertEquals(output,
                minimumAbsoluteDifferenceBetweenElementsWithConstraint.minAbsoluteDifference(nums, x));
    }

    @Test
    void test0() {
        test(0, List.of(4,3,2,4), 2);
    }
}
