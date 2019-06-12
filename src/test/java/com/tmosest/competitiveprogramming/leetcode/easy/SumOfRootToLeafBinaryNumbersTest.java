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
@DisplayName("LeetCode: 1022. Sum of Root To Leaf Binary Numbers")
class SumOfRootToLeafBinaryNumbersTest {

  private SumOfRootToLeafBinaryNumbers sumOfRootToLeafBinaryNumbers = new SumOfRootToLeafBinaryNumbers();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[1,0,1,0,1,0,1]");
    Assertions.assertEquals(22, sumOfRootToLeafBinaryNumbers.sumRootToLeaf(root));
  }
}
