package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 728. Self Dividing Numbers")
class SelfDividingNumbersTest {
	/* Write code here. */

  SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};
    List<Integer> expected = Arrays.asList(result);
    List<Integer> actual = selfDividingNumbers.selfDividingNumbers(1,22);
    Assertions.assertEquals(expected.size(), actual.size());
    Collections.sort(expected);
    Collections.sort(actual);
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }


}
