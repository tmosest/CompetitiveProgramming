package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("bwc126")
@DisplayName("LeetCode: 452. Minimum Number of Arrows to Burst Balloons")
class MinimumNumberOfArrowsToBurstBalloonsTest {
    private MinimumNumberOfArrowsToBurstBalloons minimumNumberOfArrowsToBurstBalloons;

    @BeforeEach
    void setup() {
        minimumNumberOfArrowsToBurstBalloons = new MinimumNumberOfArrowsToBurstBalloons();
    }

    private void test(int output, int[][] points) {
        Assertions.assertEquals(output, minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    void test0() {
        test(2, new int[][] {{10,16}, {2,8}, {1,6}, {7,12}});
    }
}
