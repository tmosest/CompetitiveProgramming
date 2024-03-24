package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc381")
@DisplayName("LeetCode: 3014. Minimum Number of Pushes to Type Word I")
class MinimumNumberOfPushesToTypeWordOneTest {
    private MinimumNumberOfPushesToTypeWordOne minimumNumberOfPushesToTypeWordOne;

    @BeforeEach
    void setup() {
        minimumNumberOfPushesToTypeWordOne = new MinimumNumberOfPushesToTypeWordOne();
    }

    private void test(int output, String word) {
        Assertions.assertEquals(output, minimumNumberOfPushesToTypeWordOne.minimumPushes(word));
    }

    @Test
    void test0() {
        test(5, "abcde");
    }

    @Test
    void test1() {
        test(12, "xycdefghij");
    }
}
