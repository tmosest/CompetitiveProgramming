package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.datastructures.implementations.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 117. Populating Next Right Pointers in Each Node II")
class PopulatingNextRightPointersInEachNodeTwoTest {

  private PopulatingNextRightPointersInEachNodeTwo populatingNextRightPointersInEachNodeTwo =
      new PopulatingNextRightPointersInEachNodeTwo();

  @Test
  void testCase0() {
    populatingNextRightPointersInEachNodeTwo.connect(new Node());
  }
}
