package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 271. Encode and Decode Strings")
class EncodeAndDecodeStringsTest {

  private EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    List<String> input = new ArrayList<>();
    input.add("hello");
    input.add("world");
    Assertions.assertEquals(input, encodeAndDecodeStrings.decode(encodeAndDecodeStrings.encode(input)));
  }
}
