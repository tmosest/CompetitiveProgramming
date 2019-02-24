package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("997. Find the Town Judge")
public class FindTheTownJudgeTest {

  FindTheTownJudge findTheTownJudge = new FindTheTownJudge();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] trusts = {
        {1,2}
    };
    Assertions.assertEquals(2, findTheTownJudge.findJudge(2, trusts));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[][] trusts = {
        {1,3},
        {2,3}
    };
    Assertions.assertEquals(3, findTheTownJudge.findJudge(3, trusts));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[][] trusts = {
        {1,3},
        {2,3},
        {3,1}
    };
    Assertions.assertEquals(-1, findTheTownJudge.findJudge(3, trusts));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[][] trusts = {
        {1,2},
        {2,3}
    };
    Assertions.assertEquals(-1, findTheTownJudge.findJudge(3, trusts));
  }
}
