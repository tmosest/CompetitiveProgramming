package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("graph")
@Tag("unionFind")
@Tag("wc373")
@DisplayName("LeetCode: 2948. Make Lexicographically Smallest Array by Swapping Elements")
class MakeLexicographicallySmallestArrayBySwappingElementsTest {
    private MakeLexicographicallySmallestArrayBySwappingElements makeLexicographicallySmallestArrayBySwappingElements;

    @BeforeEach
    void setup() {
        makeLexicographicallySmallestArrayBySwappingElements = new MakeLexicographicallySmallestArrayBySwappingElements();
    }

    private void test(int[] output, int[] nums, int limit) {
        Assertions.assertArrayEquals(output,
                makeLexicographicallySmallestArrayBySwappingElements.lexicographicallySmallestArray(nums, limit));
    }

    @Test
    void test0() {
        test(new int[] { 1, 3, 5, 8, 9 }, new int[] { 1, 5, 3, 9, 8 }, 2);
    }

    @Test
    void test1() {
        test(new int[] { 1, 6, 7, 18, 1, 2 }, new int[] { 1, 7, 6, 18, 2, 1 }, 3);
    }

    @Test
    void test2() {
        test(new int[] { 1, 7, 28, 19, 10 }, new int[] { 1, 7, 28, 19, 10 }, 3);
    }
}
