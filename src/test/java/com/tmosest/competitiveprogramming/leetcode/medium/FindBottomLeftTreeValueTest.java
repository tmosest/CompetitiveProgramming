package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 513. Find Bottom Left Tree Value")
class FindBottomLeftTreeValueTest {

  private Codec codec = new Codec();
  private FindBottomLeftTreeValue findBottomLeftTreeValue = new FindBottomLeftTreeValue();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        1,
        findBottomLeftTreeValue.findBottomLeftValue(codec.deserialize("[2,1,3]"))
    );
  }
}
