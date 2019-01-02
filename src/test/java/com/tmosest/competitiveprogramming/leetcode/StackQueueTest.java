package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("queue")
@Tag("stack")
@DisplayName("LeetCode: 232. Implement Queue using Stacks")
public class StackQueueTest {
  StackQueue stackQueue;

  @BeforeEach
  void setup() {
    stackQueue = new StackQueue();
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(stackQueue.empty());
    stackQueue.push(1);
    stackQueue.push(2);
    Assertions.assertFalse(stackQueue.empty());
    Assertions.assertEquals(1, stackQueue.peek());
    Assertions.assertEquals(1, stackQueue.pop());
    Assertions.assertEquals(2, stackQueue.pop());
    Assertions.assertTrue(stackQueue.empty());
  }
}
