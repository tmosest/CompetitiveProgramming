package com.tmosest.competitiveprogramming.leetcode.hard;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("math")
@Tag("wc351")
@Tag("dynamic")
@Tag("array")
@DisplayName("LeetCode: 2751. Robot Collisions")
class RobotCollisionsTest {
    private RobotCollisions robotCollisions;

    @BeforeEach
    void setup() {
        robotCollisions = new RobotCollisions();
    }

    private void test(List<Integer> output, int[] positions, int[] healths, String directions) {
        Assertions.assertEquals(output, robotCollisions.survivedRobotsHealths(positions, healths, directions));
    }

    @Test
    void test0() {
        test(List.of(2,17,9,15,10), new int[] {5,4,3,2,1}, new int[] {2,17,9,15,10}, "RRRRR");
    }
}
