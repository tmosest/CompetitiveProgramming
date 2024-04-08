package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc367")
@DisplayName("LeetCode: 2905. Find Indices With Index and Value Difference II")
class FindIndicesWithIndexAndValueDifferenceTwoTest {
    private FindIndicesWithIndexAndValueDifferenceTwo findIndicesWithIndexAndValueDifferenceTwo;

    @BeforeEach
    void setup() {
        findIndicesWithIndexAndValueDifferenceTwo = new FindIndicesWithIndexAndValueDifferenceTwo();
    }

    private void test(int[] output, int[] A, int d, int v) {
        Assertions.assertArrayEquals(output, findIndicesWithIndexAndValueDifferenceTwo.findIndices(A, d, v));
    }

    @Test
    void test0() {
        test(new int[] {0, 3}, new int[] {5,1,4,1}, 2, 4);
    }

    @Test
    void test1() {
        test(new int[] {0, 0}, new int[] {2,1}, 0, 0);
    }

    @Test
    void test2() {
        test(new int[] {-1, -1}, new int[] {1,2,3}, 2, 4);
    }
}
