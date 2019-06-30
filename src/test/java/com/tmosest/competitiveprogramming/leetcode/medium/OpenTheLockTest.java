package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 752. Open the Lock")
class OpenTheLockTest {

  private OpenTheLock openTheLock = new OpenTheLock();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] deadends = {
        "0201","0101","0102","1212","2002"
    };
    String target = "0202";
    Assertions.assertEquals(6, openTheLock.openLock(deadends, target));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] deadends = {
      "8888"
    };
    String target = "0009";
    Assertions.assertEquals(1, openTheLock.openLock(deadends, target));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] deadends = {
        "0000"
    };
    String target = "8888";
    Assertions.assertEquals(-1, openTheLock.openLock(deadends, target));
  }
}
