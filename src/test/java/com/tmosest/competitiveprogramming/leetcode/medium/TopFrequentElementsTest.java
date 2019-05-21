package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 347. Top K Frequent Elements")
class TopFrequentElementsTest {
	/* Write code here. */

  TopFrequentElements topFrequentElements = new TopFrequentElements();

  private void test(int[] input, Integer[] expectedArr) {
    List<Integer> actual = topFrequentElements.topKFrequent(input, expectedArr.length);
    List<Integer> expected = Arrays.asList(expectedArr);
    Assertions.assertEquals(actual.size(), expected.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,1,1,2,2,3
    };
    Integer[] expected = {
        1,2
    };
    test(input, expected);
  }


}
