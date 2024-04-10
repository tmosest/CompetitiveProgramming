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
@Tag("dynamic")
@Tag("stack")
@Tag("wc364")
@DisplayName("LeetCode: 2866. Beautiful Towers II")
class BeautifulTowersTwoTest {
    private BeautifulTowersTwo beautifulTowersTwo;

    @BeforeEach
    void setup() {
        beautifulTowersTwo = new BeautifulTowersTwo();
    }

    private void test(long output, List<Integer> maxHeights) {
        Assertions.assertEquals(output, beautifulTowersTwo.maximumSumOfHeights(maxHeights));
    }

    @Test
    void test0() {
        test(13, List.of(5, 3, 4, 1, 1));
    }
}
