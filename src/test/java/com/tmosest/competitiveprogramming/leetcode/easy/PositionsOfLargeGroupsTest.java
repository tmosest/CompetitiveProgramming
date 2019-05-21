package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 830. Positions of Large Groups")
class PositionsOfLargeGroupsTest {
	/* Write code here. */

  PositionsOfLargeGroups positionsOfLargeGroups = new PositionsOfLargeGroups();

  void test(List<List<Integer>> expected, List<List<Integer>> actual) {
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      List<Integer> eRow = expected.get(i);
      List<Integer> aRow = actual.get(i);
      Assertions.assertEquals(eRow.size(), aRow.size());
      for (int j = 0; j < eRow.size(); j++) {
        Assertions.assertEquals(eRow.get(j), aRow.get(j));
      }
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    row.add(3);
    row.add(6);
    expected.add(row);

    List<List<Integer>> actual = positionsOfLargeGroups.largeGroupPositions("abbxxxxzzy");
    test(expected, actual);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    row.add(3);
    row.add(5);
    expected.add(row);
    row = new ArrayList<>();
    row.add(6);
    row.add(9);
    expected.add(row);
    row = new ArrayList<>();
    row.add(12);
    row.add(14);
    expected.add(row);

    List<List<Integer>> actual = positionsOfLargeGroups.largeGroupPositions("abcdddeeeeaabbbcd");
    test(expected, actual);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    row.add(0);
    row.add(2);
    expected.add(row);

    List<List<Integer>> actual = positionsOfLargeGroups.largeGroupPositions("aaa");
    test(expected, actual);
  }


}
