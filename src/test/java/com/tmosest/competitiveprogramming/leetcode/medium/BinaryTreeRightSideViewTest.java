package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 199. Binary Tree Right Side View")
class BinaryTreeRightSideViewTest {

  private BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String tree = "[1,2,3,null,5,null,4]";
    Integer[] expected = {1, 3, 4};
    TreeNode root = codec.deserialize(tree);
    Assertions.assertEquals(Arrays.asList(expected), binaryTreeRightSideView.rightSideView(root));
  }
}
