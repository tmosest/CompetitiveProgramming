package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 756. Pyramid Transition Matrix")
class PyramidTransitionMatrixTest {

  private PyramidTransitionMatrix pyramidTransitionMatrix =
      new PyramidTransitionMatrix();

  @Test
  void testCas0() {
    String[] arr = {"ABD", "BCE", "DEF", "FFF"};
    Assertions.assertTrue(pyramidTransitionMatrix.pyramidTransition("ABC", Arrays.asList(arr)));
  }
}
