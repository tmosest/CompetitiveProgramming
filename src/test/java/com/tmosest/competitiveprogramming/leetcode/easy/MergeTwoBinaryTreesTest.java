package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.medium.Codec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 617. Merge Two Binary Trees")
class MergeTwoBinaryTreesTest {

  private Codec codec = new Codec();
  private MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode rootOne = codec.deserialize("[1,2]");
    TreeNode rootTwo = codec.deserialize("[2,null,3]");

    TreeNode expected = new TreeNode(3);
    expected.left = rootOne.left;
    expected.right = rootTwo.right;

    TreeNode actual = mergeTwoBinaryTrees.mergeTrees(rootOne, rootTwo);
    Assertions.assertTrue(expected.equals(actual));
  }


}
