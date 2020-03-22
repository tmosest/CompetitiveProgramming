package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("bwc22")
@Tag("interval")
@Tag("medium")
@DisplayName("LeetCode: 1386. Cinema Seat Allocation")
class CinemaSeatAllocationTest {

  private CinemaSeatAllocation cinemaSeatAllocation =
      new CinemaSeatAllocation();

  @Test
  void testCase0() {
    Assertions.assertEquals(4,
        cinemaSeatAllocation.maxNumberOfFamilies(
            3,
            new int[][] {
                {1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}
            }
        )
    );
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(2,
        cinemaSeatAllocation.maxNumberOfFamilies(
            2,
            new int[][] {
                {2,1},{1,8},{2,6}
            }
        )
    );
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(4,
        cinemaSeatAllocation.maxNumberOfFamilies(
            4,
            new int[][] {
                {4,3},{1,4},{4,6},{1,7}
            }
        )
    );
  }
}
