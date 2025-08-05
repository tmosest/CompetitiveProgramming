package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3169. Count Days Without Meetings")
@Tag("wc400")
class CountDaysWithoutMeetingsTest {
    private CountDaysWithoutMeetings countDaysWithoutMeetings;

    @BeforeEach
    void setup() {
        countDaysWithoutMeetings = new CountDaysWithoutMeetings();
    }

    private void test(int output, int days, int[][] meetings) {
        Assertions.assertEquals(output, countDaysWithoutMeetings.countDays(days, meetings));
    }
    /*
     * Example 1
     * Input: days = 10, meetings = [[5,7],[1,3],[9,10]]
     * Output: 2
     * null
     */

    @Test
    void test1() {
        test(2, 10, new int[][] { { 5, 7 }, { 1, 3 }, { 9, 10 } });
    }
    /*
     * Example 2
     * Input: days = 5, meetings = [[2,4],[1,3]]
     * Output: 1
     * null
     */

    @Test
    void test2() {
        test(1, 5, new int[][] { { 2, 4 }, { 1, 3 } });
    }
    /*
     * Example 3
     * Input: days = 6, meetings = [[1,6]]
     * Output: 0
     * null
     */

    @Test
    void test3() {
        test(0, 6, new int[][] { { 1, 6 } });
    }
}
