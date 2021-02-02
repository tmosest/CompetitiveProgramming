package com.tmosest.competitiveprogramming.leetcode.advent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("string")
@Tag("advent2020")
@DisplayName("LeetCode: Day 15. Rambunctious Recitation")
class RambunctiousRecitationTest {

  private static final int INDEX = 2020;
  private static final int INDEX_2 = 30000000;

  private RambunctiousRecitation rambunctiousRecitation;

  @BeforeEach
  void setup() {
    rambunctiousRecitation = new RambunctiousRecitation();
  }

  private void test(long output, String input, int index) {
    Assertions.assertEquals(output, rambunctiousRecitation.getNumberAtSpot(input, index));
  }

  @Test
  void test0_getNumberAtSpot_sampleOneSuccess() {
    test(0, "0,3,6", 10);
  }

  @Test
  void test0_getNumberAtSpot_sampleTwoSuccess() {
    test(436, "0,3,6", INDEX);
  }

  @Test
  void test0_getNumberAtSpot_sampleThreeSuccess() {
    test(1, "1,3,2", INDEX);
  }

  @Test
  void test0_getNumberAtSpot_realSuccess() {
    test(475, "6,4,12,1,20,0,16", INDEX);
  }

  @Test
  void test1_getNumberAtSpot_sampleTwoSuccess() {
    test(175594, "0,3,6", INDEX_2);
  }

  @Test
  void test1_getNumberAtSpot_realSuccess() {
    test(11261, "6,4,12,1,20,0,16", INDEX_2);
  }
}
