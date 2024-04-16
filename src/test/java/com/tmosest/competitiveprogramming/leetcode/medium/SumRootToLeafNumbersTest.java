package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;
import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("depthFirstSearch")
@Tag("tree")
@Tag("wcx")
@DisplayName("LeetCode: 129. Sum Root to Leaf Numbers")
class SumRootToLeafNumbersTest {
    private SumRootToLeafNumbers sumRootToLeafNumbers;

    @BeforeEach
    void setup() {
        sumRootToLeafNumbers = new SumRootToLeafNumbers();
    }

    private void test(int output, TreeNode root) {
        Assertions.assertEquals(output, sumRootToLeafNumbers.sumNumbers(root));
    }

    @Test
    void test0() {
        test(25, TreeNode.fromString("[1,2,3]"));
    }

    @Test
    void test1() {
        test(1026, TreeNode.fromString("[4,9,0,5,1]"));
    }
}
