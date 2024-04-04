package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wc372")
@DisplayName("LeetCode: 2940. Find Building Where Alice and Bob Can Meet")
class FindBuildingWhereAliceAndBobCanMeetTest {
    private FindBuildingWhereAliceAndBobCanMeet findBuildingWhereAliceAndBobCanMeet;

    @BeforeEach
    void setup() {
        findBuildingWhereAliceAndBobCanMeet = new FindBuildingWhereAliceAndBobCanMeet();
    }

    private void test(int[] output, int[] heights, int[][] queries) {
        Assertions.assertArrayEquals(output, findBuildingWhereAliceAndBobCanMeet.leftmostBuildingQueries(heights, queries));
    }

    @Test
    void test0() {
        test(new int[] { 2, 5, -1, 5, 2 }, new int[] { 6, 4, 8, 5, 2, 7 },
                new int[][] { { 0, 1 }, { 0, 3 }, { 2, 4 }, { 3, 4 }, { 2, 2 } });
    }
}
