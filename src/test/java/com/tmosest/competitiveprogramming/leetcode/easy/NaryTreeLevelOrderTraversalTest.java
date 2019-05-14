package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.Node;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("nAryTree")
@Tag("binarySearch")
@DisplayName("LeetCode: 429. N-ary Tree Level Order Traversal")
class NaryTreeLevelOrderTraversalTest {
	/* Write code here. */

  NaryTreeLevelOrderTraversal naryTreeLevelOrderTraversal = new NaryTreeLevelOrderTraversal();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    List<Node> children = new ArrayList<>();
    List<Node> moreChildren = new ArrayList<>();
    moreChildren.add(new Node(5, null));
    moreChildren.add(new Node(6, null));
    children.add(new Node(3, moreChildren));
    children.add(new Node(2, null));
    children.add(new Node(4, null));
    Node root = new Node(1, children);

    List<List<Integer>> expected =  new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    row.add(1);
    expected.add(row);
    row = new ArrayList<>();
    row.add(3);
    row.add(2);
    row.add(4);
    expected.add(row);
    row = new ArrayList<>();
    row.add(5);
    row.add(6);
    expected.add(row);

    List<List<Integer>> actual = naryTreeLevelOrderTraversal.levelOrder(root);
    Assertions.assertEquals(expected.size(), actual.size());

    for (int i = 0; i < expected.size(); i++) {
      row = expected.get(i);
      List<Integer> aRow = actual.get(i);
      Assertions.assertEquals(row.size(), aRow.size());
      for (int r = 0; r < row.size(); r++) {
        Assertions.assertEquals(row.get(r), aRow.get(r));
      }
    }
  }


}
