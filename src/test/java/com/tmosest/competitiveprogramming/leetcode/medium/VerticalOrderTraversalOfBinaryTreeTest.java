package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 987. Vertical Order Traversal of a Binary Tree")
class VerticalOrderTraversalOfBinaryTreeTest {

  private Codec codec = new Codec();
  private VerticalOrderTraversalOfBinaryTree verticalOrderTraversalOfBinaryTree =
      new VerticalOrderTraversalOfBinaryTree();

  @Test
  void testCase0() {
    TreeNode tree = codec.deserialize("[3,9,20,null,null,15,7]");
    Integer[][] nums = {{9},{3,15},{20},{7}};
    List<List<Integer>> expected = new ArrayList<>();

    for (Integer[] line : nums) {
      expected.add(Arrays.asList(line));
    }

    Assertions.assertEquals(expected, verticalOrderTraversalOfBinaryTree.verticalTraversal(tree));
  }
}
