package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 536. Construct Binary Tree from String")
class ConstructBinaryTreeFromStringTest {

  private ConstructBinaryTreeFromString constructBinaryTreeFromString = new ConstructBinaryTreeFromString();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String expected = "[4,2,6,3,1,5,null]";
    String actual = codec.serialize(constructBinaryTreeFromString.str2tree("4(2(3)(1))(6(5))"));
    Assertions.assertEquals(expected, actual);
  }
}
