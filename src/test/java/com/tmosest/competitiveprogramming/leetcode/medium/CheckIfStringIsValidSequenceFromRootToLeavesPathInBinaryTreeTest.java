package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("april30Day")
@DisplayName("LeetCode: y. Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree")
class CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTreeTest {

  private CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree checkIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree =
      new CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree();
  private Codec codec = new Codec();

  @Test
  void testCase0() {
    Assertions.assertTrue(checkIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree.isValidSequence(
        codec.deserialize("[0,1,0,0,1,0,null,null,1,0,0]"),
        new int[] {0,1,0,1}
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertFalse(checkIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree.isValidSequence(
        codec.deserialize("[0,1,0,0,1,0,null,null,1,0,0]"),
        new int[] {0,0,1}
    ));
  }
}
