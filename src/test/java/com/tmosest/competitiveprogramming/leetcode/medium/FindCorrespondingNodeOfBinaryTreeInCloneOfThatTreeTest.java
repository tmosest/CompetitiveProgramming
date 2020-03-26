package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree")
class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeTest {

  private Codec codec = new Codec();
  private FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree findCorrespondingNodeOfBinaryTreeInCloneOfThatTree =
      new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree();

  @Test
  void testCase0() {
    TreeNode root = codec.deserialize("[7,4,3,null,null,6,19]");
    Assertions.assertEquals(3,
        findCorrespondingNodeOfBinaryTreeInCloneOfThatTree.getTargetCopy(root, root, root.right).val
    );
  }
}
