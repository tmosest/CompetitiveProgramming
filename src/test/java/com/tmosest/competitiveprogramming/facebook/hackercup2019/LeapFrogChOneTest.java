package com.tmosest.competitiveprogramming.facebook.hackercup2019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LeapFrogChOneTest {

  private LeapFrogChOne leapFrogChOne = new LeapFrogChOne();

  @Test
  @DisplayName("A is true")
  void a_should_be_true() {
    Assertions.assertTrue(leapFrogChOne.canAlphaFrogLead("A"));
  }

  @Test
  @DisplayName("A. is false")
  void a_dot_should_be_false() {
    Assertions.assertFalse(leapFrogChOne.canAlphaFrogLead("A."));
  }

  @Test
  @DisplayName("ABB is false")
  void a_b_b_should_be_false() {
    Assertions.assertFalse(leapFrogChOne.canAlphaFrogLead("ABB"));
  }

  @Test
  @DisplayName("A.BB is true")
  void a_dot_b_b_should_be_false() {
    Assertions.assertTrue(leapFrogChOne.canAlphaFrogLead("A.BB"));
  }

  @Test
  @DisplayName("A.B..BBBB.BB is true")
  void testCase0() {
    Assertions.assertTrue(leapFrogChOne.canAlphaFrogLead("A.B..BBBB.BB"));
  }

  /*
  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertTrue(leapFrogChOne.canAlphaFrogLead("A.BBBBB.B.BB.B.BB.....BBB.BB.B..B.BBBB.B.B.BB.BB..B..BBBBBBBBBB..BB.B..B.BBB.BBB.."));
  }
  */
}
