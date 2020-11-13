package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@Tag("wc212")
@Tag("array")
@DisplayName("LeetCode: 1630. Arithmetic Subarrays")
class ArithmeticSubarraysTest {

  @Test
  void test1() {
    Assertions.assertEquals(Arrays.asList(new Boolean[] {true, false, true}),
        new ArithmeticSubarrays().checkArithmeticSubarrays(new int[] {4,6,5,9,3,7},
            new int[] {0,0,2},
            new int[] {2,3,5}));
  }
}
