package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 865. Smallest Subtree with all the Deepest Nodes")
class SmallestSubtreeWithAllTheDeepestNodesTest {

  private Codec codec = new Codec();
  private SmallestSubtreeWithAllTheDeepestNodes smallestSubtreeWithAllTheDeepestNodes = new SmallestSubtreeWithAllTheDeepestNodes();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("[2,7,4]",
        codec.serialize(smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(
            codec.deserialize("[3,5,1,6,2,0,8,null,null,7,4]")
        ))
    );
  }
}
