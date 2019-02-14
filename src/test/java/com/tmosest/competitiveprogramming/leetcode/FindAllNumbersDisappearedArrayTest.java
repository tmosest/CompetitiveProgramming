package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 448. Find All Numbers Disappeared in an Array")
public class FindAllNumbersDisappearedArrayTest {

  FindAllNumbersDisappearedArray findAllNumbersDisappearedArray = new FindAllNumbersDisappearedArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4,3,2,7,8,2,3,1
    };
    Integer[] expected = {
        5,6
    };
    List<Integer> expectedList = Arrays.asList(expected);
    List<Integer> actual = findAllNumbersDisappearedArray.findDisappearedNumbers(input);

    Assertions.assertEquals(expectedList.size(), actual.size());
    Collections.sort(expectedList);
    Collections.sort(actual);
    for (int i = 0; i < expectedList.size(); i++) {
      Assertions.assertEquals(expectedList.get(i), actual.get(i));
    }
  }
}
