package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("directedGraph")
@Tag("wcx")
@DisplayName("LeetCode: 1700. Number of Students Unable to Eat Lunch")
class NumberOfStudentsUnableToEatLunchTest {
    private NumberOfStudentsUnableToEatLunch numberOfStudentsUnableToEatLunch;

    @BeforeEach
    void setup() {
        numberOfStudentsUnableToEatLunch = new NumberOfStudentsUnableToEatLunch();
    }

    private void test(int output, int[] students, int[] sandwiches) {
        Assertions.assertEquals(output, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    void test0() {
        test(0, new int[] { 1, 1, 0, 0 }, new int[] { 0, 1, 0, 1 });
    }
}
