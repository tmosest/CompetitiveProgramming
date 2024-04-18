package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

@Tag("leetcode")
@Tag("medium")
@Tag("stack")
@Tag("wc358")
@Tag("math")
@Tag("list")
@DisplayName("LeetCode: 2816. Double a Number Represented as a Linked List")
class DoubleNumberRepresentedAsLinkedListTest {
    private DoubleNumberRepresentedAsLinkedList doubleNumberRepresentedAsLinkedList;

    @BeforeEach
    void setup() {
        doubleNumberRepresentedAsLinkedList = new DoubleNumberRepresentedAsLinkedList();
    }

    private void test(ListNode output, ListNode head) {
        Assertions.assertEquals(output.toString(), doubleNumberRepresentedAsLinkedList.doubleIt(head).toString());
    }

    @Test
    void test0() {
        test(ListNode.fromString("[3,7,8]"), ListNode.fromString("[1,8,9]"));
    }

    @Test
    void test1() {
        test(ListNode.fromString("[1,9,9,8]"), ListNode.fromString("[9,9,9]"));
    }
}
