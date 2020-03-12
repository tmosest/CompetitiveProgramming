package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 423. Reconstruct Original Digits from English")
class ReconstructOriginalDigitsFromEnglishTest {

  private ReconstructOriginalDigitsFromEnglish reconstructOriginalDigitsFromEnglish =
      new ReconstructOriginalDigitsFromEnglish();

  @Test
  void testCase0() {
    Assertions
        .assertEquals("012", reconstructOriginalDigitsFromEnglish.originalDigits("owoztneoer"));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals("45", reconstructOriginalDigitsFromEnglish.originalDigits("fviefuro"));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals("00", reconstructOriginalDigitsFromEnglish.originalDigits("zerozero"));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals("0123456789", reconstructOriginalDigitsFromEnglish
        .originalDigits("zeroonetwothreefourfivesixseveneightnine"));
  }
}
