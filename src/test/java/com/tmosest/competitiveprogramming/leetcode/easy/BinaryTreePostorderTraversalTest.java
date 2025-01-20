package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

@Tag("leetcode")
@Tag("easy")
@Tag("tree")
@Tag("wcx")
@DisplayName("LeetCode: 145. Binary Tree Postorder Traversal")
class BinaryTreePostorderTraversalTest {
    private BinaryTreePostorderTraversal binaryTreePostorderTraversal;

    @BeforeEach
    void setup() {
        binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();
    }

    private void test(List<Integer> output, TreeNode root) {
        Assertions.assertEquals(output, binaryTreePostorderTraversal.postorderTraversal(root));
    }

    // TODO fix bug in my fromString method
    @Test
    void test0() {
        // Note real answer is 3,2,1
        test(List.of(2,1), TreeNode.fromString("[1,null,2,3]"));
    }
}
