package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("design")
@Tag("wc215")
@DisplayName("LeetCode: 1656. Design an Ordered Stream")
class DesignAnOrderedStreamTest {

  @Test
  void test1() {
    DesignAnOrderedStream designAnOrderedStream = new DesignAnOrderedStream(5);
    Assertions.assertNotNull(designAnOrderedStream.insert(3, "cccccc"));
  }
}
