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
@Tag("wc364")
@DisplayName("LeetCode: 2865. Beautiful Towers I")
class BeautifulTowersOneTest {
    private BeautifulTowersOne beautifulTowersOne;

    @BeforeEach
    void setup() {
        beautifulTowersOne = new BeautifulTowersOne();
    }

    private void test(long output, List<Integer> maxHeights) {
        Assertions.assertEquals(output, beautifulTowersOne.maximumSumOfHeights(maxHeights));
    }

    @Test
    void test0() {
        test(13, List.of(5, 3, 4, 1, 1));
    }
}
