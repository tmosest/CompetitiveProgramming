package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 222. Count Complete Tree Nodes")
class CountCompleteTreeNodesTest {

  private CountCompleteTreeNodes countCompleteTreeNodes =
      new CountCompleteTreeNodes();
  private Codec codec = new Codec();

  @Test
  void testCase0() {
    Assertions.assertEquals(6,
        countCompleteTreeNodes.countNodes(codec.deserialize("[1,2,3,4,5,6]"))
    );
  }
}
