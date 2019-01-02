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
@DisplayName("LeetCode: 225. Implement Stack using Queues")
public class QueueStackTest {
  QueueStack queueStack;

  @BeforeEach
  void setup() {
    queueStack = new QueueStack();
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(queueStack.empty());
    queueStack.push(1);
    queueStack.push(2);
    Assertions.assertFalse(queueStack.empty());
    Assertions.assertEquals(2, queueStack.top());
    Assertions.assertEquals(2, queueStack.pop());
    Assertions.assertEquals(1, queueStack.pop());
    Assertions.assertTrue(queueStack.empty());
  }
}
