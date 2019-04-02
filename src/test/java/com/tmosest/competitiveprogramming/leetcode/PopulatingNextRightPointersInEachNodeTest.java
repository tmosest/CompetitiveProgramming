package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@DisplayName("LeetCode: 116. Populating Next Right Pointers in Each Node")
public class PopulatingNextRightPointersInEachNodeTest {

  PopulatingNextRightPointersInEachNode populatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    PopulatingNextRightPointersInEachNode.Node root = new PopulatingNextRightPointersInEachNode.Node(1, null, null, null);
    root.left = new PopulatingNextRightPointersInEachNode.Node(2, null, null, null);
    root.right = new PopulatingNextRightPointersInEachNode.Node(3, null, null, null);
    root = populatingNextRightPointersInEachNode.connect(root);
    Assertions.assertEquals(root.left.next, root.right);
  }
}
