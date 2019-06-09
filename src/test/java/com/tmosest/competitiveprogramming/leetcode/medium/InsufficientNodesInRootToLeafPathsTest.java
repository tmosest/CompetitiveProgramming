package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 5084. Insufficient Nodes in Root to Leaf Paths")
class InsufficientNodesInRootToLeafPathsTest {

  private InsufficientNodesInRootToLeafPaths insufficientNodesInRootToLeafPaths = new InsufficientNodesInRootToLeafPaths();
  private Codec codec = new Codec();

  private void test(String input, int limit, String output) {
    TreeNode root = codec.deserialize(input);
    TreeNode expected = codec.deserialize(output);
    TreeNode actual = insufficientNodesInRootToLeafPaths.sufficientSubset(root, limit);
    Assertions.assertTrue(expected.equals(actual));
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    test(
        "[1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14]",
        1,
        "[1,2,3,4,null,null,7,8,9,null,14]"
    );
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    test(
        "[5,4,8,11,null,17,4,7,1,null,null,5,3]",
        22,
        "[5,4,8,11,null,17,4,7,null,null,null,5]"
    );
  }
}
