package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 911. Online Election")
class OnlineElectionTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] persons =
      {0,1,1,0,0,1,0};
    int[] tiems = 
      {0,5,10,15,20,25,30};
    OnlineElection onlineElection = new OnlineElection(persons, tiems);
    Assertions.assertEquals(0, onlineElection.search(3));
  }
}
