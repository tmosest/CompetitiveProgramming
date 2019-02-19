package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 687. Longest Univalue Path")
public class LongestUnivaluePathTest {

  LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(5);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);
    Assertions.assertEquals(2, longestUnivaluePath.longestUnivaluePath(root));
  }
}
