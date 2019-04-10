package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 1023. Camelcase Matching")
public class CamelcaseMatchingTest {

  CamelcaseMatching camelcaseMatching = new CamelcaseMatching();

  void verifyList(List<Boolean> expected, List<Boolean> actual) {
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] inputs = {
        "FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"
    };
    String pattern = "FB";
    Boolean[] output = {
        true,false,true,true,false
    };
    verifyList(Arrays.asList(output), camelcaseMatching.camelMatch(inputs, pattern));
  }
}
