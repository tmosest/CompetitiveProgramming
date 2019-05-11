package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.Interval;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("interval")
@DisplayName("LeetCode: 56. Merge Intervals")
public class MergeIntervalsTest {

  MergeIntervals mergeIntervals = new MergeIntervals();

  private void testList(List<Interval> input, List<Interval> expected) {
    List<Interval> actual = mergeIntervals.merge(input);

    Assertions.assertEquals(expected.size(), actual.size());

    for (int i = 0; i < actual.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    List<Interval> input = new LinkedList<>();
    input.add(new Interval(1,3));
    input.add(new Interval(2,6));
    input.add(new Interval(8,10));
    input.add(new Interval(15, 18));

    List<Interval> expected = new LinkedList<>();
    expected.add(new Interval(1,6));
    expected.add(new Interval(8, 10));
    expected.add(new Interval(15 ,18));

    testList(input, expected);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    List<Interval> input = new LinkedList<>();
    input.add(new Interval(1,3));

    List<Interval> expected = new LinkedList<>();
    expected.add(new Interval(1,3));

    testList(input, expected);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    List<Interval> input = new LinkedList<>();
    input.add(new Interval(1,3));
    input.add(new Interval(2,6));
    input.add(new Interval(8,10));
    input.add(new Interval(15, 18));
    input.add(new Interval(1, 18));

    List<Interval> expected = new LinkedList<>();
    expected.add(new Interval(1,18));

    testList(input, expected);
  }
}
