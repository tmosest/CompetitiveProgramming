package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("easy")
@DisplayName("LeetCode: 54. Spiral Matrix")
public class PairsOfSongsWithTotalDurationsDivisibleBySixtyTest {

  PairsOfSongsWithTotalDurationsDivisibleBySixty pairsOfSongsWithTotalDurationsDivisibleBySixty
      = new PairsOfSongsWithTotalDurationsDivisibleBySixty();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        30,20,150,100,40
    };
    Assertions.assertEquals(3, pairsOfSongsWithTotalDurationsDivisibleBySixty.numPairsDivisibleBy60(input));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        60,60,60
    };
    Assertions.assertEquals(3, pairsOfSongsWithTotalDurationsDivisibleBySixty.numPairsDivisibleBy60(input));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        418,204,77,278,239,457,284,263,372,279,476,416,360,18
    };
    Assertions.assertEquals(1, pairsOfSongsWithTotalDurationsDivisibleBySixty.numPairsDivisibleBy60(input));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        269, 230, 318, 468, 171, 158, 350, 60, 287, 27, 11, 384, 332, 267, 412, 478, 280, 303, 242,
        378, 129, 131, 164, 467, 345, 146, 264, 332, 276, 479, 284, 433, 117, 197, 430, 203, 100,
        280, 145, 287, 91, 157, 5, 475, 288, 146, 370, 199, 81, 428, 278, 2, 400, 23, 470, 242, 411,
        470, 330, 144, 189, 204, 62, 318, 475, 24, 457, 83, 204, 322, 250, 478, 186, 467, 350, 171,
        119, 245, 399, 112, 252, 201, 324, 317, 293, 44, 295, 14, 379, 382, 137, 280, 265, 78, 38,
        323, 347, 499, 238, 110, 18, 224, 473, 289, 198, 106, 256, 279, 275, 349, 210, 498, 201,
        175, 472, 461, 116, 144, 9, 221, 473
    };
    Assertions.assertEquals(105, pairsOfSongsWithTotalDurationsDivisibleBySixty.numPairsDivisibleBy60(input));
  }
}
