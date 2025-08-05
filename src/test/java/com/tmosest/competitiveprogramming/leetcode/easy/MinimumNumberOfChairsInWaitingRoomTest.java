package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 3168. Minimum Number of Chairs in a Waiting Room")
@Tag("wc400")
class MinimumNumberOfChairsInWaitingRoomTest {
    private MinimumNumberOfChairsInWaitingRoom minimumNumberOfChairsInWaitingRoom;

    @BeforeEach
    void setup() {
        minimumNumberOfChairsInWaitingRoom = new MinimumNumberOfChairsInWaitingRoom();
    }

    private void test(int output, String s) {
        Assertions.assertEquals(output, minimumNumberOfChairsInWaitingRoom.minimumChairs(s));
    }
    /*
     * Example 1
     * Input: s = "EEEEEEE"
     * Output: 7
     * null
     */

    @Test
    void test1() {
        test(7, "EEEEEEE");
    }
    /*
     * Example 2
     * Input: s = "ELELEEL"
     * Output: 2
     * null
     */

    @Test
    void test2() {
        test(2, "ELELEEL");
    }
    /*
     * Example 3
     * Input: s = "ELEELEELLL"
     * Output: 3
     * null
     */

    @Test
    void test3() {
        test(3, "ELEELEELLL");
    }
}
