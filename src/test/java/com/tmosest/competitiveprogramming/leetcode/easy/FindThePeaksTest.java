package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc374")
@DisplayName("LeetCode: 2951. Find the Peaks")
class FindThePeaksTest {
    private FindThePeaks findThePeaks;

    @BeforeEach
    void setup() {
        findThePeaks = new FindThePeaks();
    }

    private void test(List<Integer> output, int[] mountain) {
        Assertions.assertEquals(output, findThePeaks.findPeaks(mountain));
    }

    @Test
    void test0() {
        test(List.of(), new int[] { 2, 4, 4 });
    }

    @Test
    void test1() {
        test(List.of(1, 3), new int[] { 1, 4, 3, 8, 5 });
    }
}
