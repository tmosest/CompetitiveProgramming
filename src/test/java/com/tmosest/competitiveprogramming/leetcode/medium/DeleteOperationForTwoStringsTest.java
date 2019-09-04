package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 583. Delete Operation for Two Strings")
class DeleteOperationForTwoStringsTest {

  private DeleteOperationForTwoStrings deleteOperationForTwoStrings = new DeleteOperationForTwoStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(2, deleteOperationForTwoStrings.minDistance("sea", "eat"));
  }
}
