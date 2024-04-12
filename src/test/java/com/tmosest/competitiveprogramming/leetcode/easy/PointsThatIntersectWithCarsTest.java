package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc362")
@DisplayName("LeetCode: 2848. Points That Intersect With Cars")
class PointsThatIntersectWithCarsTest {
    private PointsThatIntersectWithCars pointsThatIntersectWithCars;

    @BeforeEach
    void setup() {
        pointsThatIntersectWithCars = new PointsThatIntersectWithCars();
    }

    private void test(int output, List<List<Integer>> nums) {
        Assertions.assertEquals(output, pointsThatIntersectWithCars.numberOfPoints(nums));
    }

    @Test
    void test0() {
        test(7, List.of(List.of(3, 6), List.of(1, 5), List.of(4, 7)));
    }
}
