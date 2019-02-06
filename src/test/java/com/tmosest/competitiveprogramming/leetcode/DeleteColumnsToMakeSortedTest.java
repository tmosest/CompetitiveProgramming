package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 696. Count Binary Substrings")
public class DeleteColumnsToMakeSortedTest {

  DeleteColumnsToMakeSorted deleteColumnsToMakeSorted = new DeleteColumnsToMakeSorted();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] input = {"cba","daf","ghi"};
    Assertions.assertEquals(1, deleteColumnsToMakeSorted.minDeletionSize(input));
  }
}
