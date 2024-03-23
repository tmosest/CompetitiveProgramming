package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

@Tag("leetcode")
@Tag("easy")
@Tag("list")
@Tag("wcx")
@DisplayName("LeetCode: 234. Palindrome Linked List")
class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    void setup() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    private void test(boolean output, ListNode head) {
        Assertions.assertEquals(output, palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void test0() {
        test(true, ListNode.fromString("[1,2,2,1]"));
    }

    @Test
    void test1() {
        test(false, ListNode.fromString("[1,2]"));
    }
}
