package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wcx")
@Tag("breadthFirstSearch")
@DisplayName("LeetCode: 3568. Minimum Moves to Clean the Classroom")
class MinimumMovesToCleanTheClassroomTest {
    private MinimumMovesToCleanTheClassroom minimumMovesToCleanTheClassroom;

    @BeforeEach
    void setup() {
        minimumMovesToCleanTheClassroom = new MinimumMovesToCleanTheClassroom();
    }

    private void test(int output, String[] classroom, int energy) {
        Assertions.assertEquals(output, minimumMovesToCleanTheClassroom.minMoves(classroom, energy));
    }

    @Test
    void test0() {
        test(2, new String[] {"S.", "XL"}, 2);
    }
}
