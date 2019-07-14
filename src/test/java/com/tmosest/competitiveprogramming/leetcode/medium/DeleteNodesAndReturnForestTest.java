package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1110. Delete Nodes And Return Forest")
class DeleteNodesAndReturnForestTest {

  private Codec codec = new Codec();
  private DeleteNodesAndReturnForest deleteNodesAndReturnForest = new DeleteNodesAndReturnForest();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] delete = {3,4};
    deleteNodesAndReturnForest.delNodes(codec.deserialize("[1,2,3,4,5,6,7]"), delete);
  }
}
