package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc381")
@Tag("time_O(N)")
@Tag("space_O(1)")
@DisplayName("LeetCode: 3016. Minimum Number of Pushes to Type Word II")
class MinimumNumberOfPushesToTypeWordTwoTest {
    private MinimumNumberOfPushesToTypeWordTwo minimumNumberOfPushesToTypeWordTwo;

    @BeforeEach
    void setup() {
        minimumNumberOfPushesToTypeWordTwo = new MinimumNumberOfPushesToTypeWordTwo();
    }

    private void test(int output, String word) {
        Assertions.assertEquals(output, minimumNumberOfPushesToTypeWordTwo.minimumPushes(word));
    }

    @Test
    void test0() {
        test(5, "abcde");
    }

    @Test
    void test1() {
        test(12, "xyzxyzxyzxyz");
    }

    @Test
    void test2() {
        test(24, "aabbccddeeffgghhiiiiii");
    }
}
