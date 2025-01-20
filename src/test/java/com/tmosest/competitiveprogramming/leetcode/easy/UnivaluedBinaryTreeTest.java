package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

@Tag("leetcode")
@Tag("easy")
@Tag("tree")
@Tag("wc117")
@DisplayName("LeetCode: 965. Univalued Binary Tree")
class UnivaluedBinaryTreeTest {
    private UnivaluedBinaryTree univaluedBinaryTree;

    @BeforeEach
    void setup() {
        univaluedBinaryTree = new UnivaluedBinaryTree();
    }

    private void test(boolean output, TreeNode root) {
        Assertions.assertEquals(output, univaluedBinaryTree.isUnivalTree(root));
    }

    @Test
    void test0() {
        test(true, TreeNode.fromString("[1,1,1,1,1,null,1]"));
    }

    @Test
    void test1() {
        test(false, TreeNode.fromString("[2,2,2,5,2]"));
    }
}
