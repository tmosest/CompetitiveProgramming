package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("daily")
@Tag("math")
@DisplayName("LeetCode: 1432. Max Difference You Can Get From Changing an Integer")
class MaxDifferenceYouCanGetFromChangingAnIntegerTest {
    private MaxDifferenceYouCanGetFromChangingAnInteger maxDifferenceYouCanGetFromChangingAnInteger;

    @BeforeEach
    void setup() {
        maxDifferenceYouCanGetFromChangingAnInteger = new MaxDifferenceYouCanGetFromChangingAnInteger();
    }

    private void test(int output, int num) {
        Assertions.assertEquals(output, maxDifferenceYouCanGetFromChangingAnInteger.maxDiff(num));
    }

    @Test
    void test0() {
        test(888, 555);
    }

    @Test
    void test1() {
        test(8, 9);
    }

    @Test
    void test2() {
        test(820000, 123456);
    }
}
