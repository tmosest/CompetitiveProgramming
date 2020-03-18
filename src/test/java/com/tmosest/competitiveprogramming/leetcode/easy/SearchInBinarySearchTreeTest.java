package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.medium.Codec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 700. Search in a Binary Search Tree")
class SearchInBinarySearchTreeTest {

  private Codec codec = new Codec();
  private SearchInBinarySearchTree searchInBinarySearchTree =
      new SearchInBinarySearchTree();

  @Test
  void testCase0() {
    Assertions.assertEquals(1, searchInBinarySearchTree.searchBst(codec.deserialize("[1]"), 1).val);
  }
}
