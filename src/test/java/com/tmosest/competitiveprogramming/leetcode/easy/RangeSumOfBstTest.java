package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.medium.Codec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 938. Range Sum of BST")
class RangeSumOfBstTest {

  private Codec codec = new Codec();
  private RangeSumOfBst rangeSumOfBst = new RangeSumOfBst();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(0, rangeSumOfBst.rangeSumBst(null, 0, 0));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode treeNode = codec.deserialize("[10,5,15,3,7,null,18]");
    Assertions.assertEquals(32, rangeSumOfBst.rangeSumBst(treeNode,7, 15));
  }
}
