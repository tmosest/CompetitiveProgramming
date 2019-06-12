package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("string")
@DisplayName("LeetCode: 988. Smallest String Starting From Leaf")
class SmallestStringStartingFromLeafTest {

  private SmallestStringStartingFromLeaf smallestStringStartingFromLeaf = new SmallestStringStartingFromLeaf();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[0,1,2,3,4,3,4]");
    Assertions.assertEquals("dba", smallestStringStartingFromLeaf.smallestFromLeaf(root));
  }
}
