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
@Tag("wc363")
@DisplayName("LeetCode: 2860. Happy Students")
class HappyStudentsTest {
    private HappyStudents happyStudents;

    @BeforeEach
    void setup() {
        happyStudents = new HappyStudents();
    }

    private void test(int output, List<Integer> nums) {
        Assertions.assertEquals(output, happyStudents.countWays(nums));
    }

    @Test
    void test0() {
        test(2, List.of(1, 1));
    }

    @Test
    void test1() {
        test(3, List.of(6, 0, 3, 3, 6, 7, 2, 7));
    }
}
