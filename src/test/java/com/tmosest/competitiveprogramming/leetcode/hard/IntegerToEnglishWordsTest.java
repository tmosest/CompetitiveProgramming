package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 273. Integer to English Words")
class IntegerToEnglishWordsTest {

  private IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();

  @Test
  @DisplayName("0 is Zero")
  void testCase() {
    Assertions.assertEquals("Zero", integerToEnglishWords.numberToWords(0));
  }

  @Test
  @DisplayName("1 is One")
  void testCase0() {
    Assertions.assertEquals("One", integerToEnglishWords.numberToWords(1));
  }

  @Test
  @DisplayName("2 is Two")
  void testCase1() {
    Assertions.assertEquals("Two", integerToEnglishWords.numberToWords(2));
  }

  @Test
  @DisplayName("3 is Three")
  void testCase2() {
    Assertions.assertEquals("Three", integerToEnglishWords.numberToWords(3));
  }

  @Test
  @DisplayName("4 is Four")
  void testCase3() {
    Assertions.assertEquals("Four", integerToEnglishWords.numberToWords(4));
  }

  @Test
  @DisplayName("5 is Five")
  void testCase4() {
    Assertions.assertEquals("Five", integerToEnglishWords.numberToWords(5));
  }

  @Test
  @DisplayName("6 is Six")
  void testCase5() {
    Assertions.assertEquals("Six", integerToEnglishWords.numberToWords(6));
  }

  @Test
  @DisplayName("7 is Seven")
  void testCase6() {
    Assertions.assertEquals("Seven", integerToEnglishWords.numberToWords(7));
  }

  @Test
  @DisplayName("8 is Eight")
  void testCase7() {
    Assertions.assertEquals("Eight", integerToEnglishWords.numberToWords(8));
  }

  @Test
  @DisplayName("9 is Nine")
  void testCase8() {
    Assertions.assertEquals("Nine", integerToEnglishWords.numberToWords(9));
  }

  @Test
  @DisplayName("10 is Ten")
  void testCase9() {
    Assertions.assertEquals("Ten", integerToEnglishWords.numberToWords(10));
  }

  @Test
  @DisplayName("11 is Eleven")
  void testCase10() {
    Assertions.assertEquals("Eleven", integerToEnglishWords.numberToWords(11));
  }

  @Test
  @DisplayName("12 is Eleven")
  void testCase11() {
    Assertions.assertEquals("Twelve", integerToEnglishWords.numberToWords(12));
  }

  @Test
  @DisplayName("13 is Thirteen")
  void testCase12() {
    Assertions.assertEquals("Thirteen", integerToEnglishWords.numberToWords(13));
  }

  @Test
  @DisplayName("14 is Fourteen")
  void testCase13() {
    Assertions.assertEquals("Fourteen", integerToEnglishWords.numberToWords(14));
  }

  @Test
  @DisplayName("15 is Fifteen")
  void testCase14() {
    Assertions.assertEquals("Fifteen", integerToEnglishWords.numberToWords(15));
  }

  @Test
  @DisplayName("16 is Sixteen")
  void testCase15() {
    Assertions.assertEquals("Sixteen", integerToEnglishWords.numberToWords(16));
  }

  @Test
  @DisplayName("17 is Seventeen")
  void testCase16() {
    Assertions.assertEquals("Seventeen", integerToEnglishWords.numberToWords(17));
  }

  @Test
  @DisplayName("18 is Eighteen")
  void testCase17() {
    Assertions.assertEquals("Eighteen", integerToEnglishWords.numberToWords(18));
  }

  @Test
  @DisplayName("19 is Nineteen")
  void testCase18() {
    Assertions.assertEquals("Nineteen", integerToEnglishWords.numberToWords(19));
  }

  @Test
  @DisplayName("20 is Twenty")
  void testCase19() {
    Assertions.assertEquals("Twenty", integerToEnglishWords.numberToWords(20));
  }

  @Test
  @DisplayName("21 is Twenty One")
  void testCase20() {
    Assertions.assertEquals("Twenty One", integerToEnglishWords.numberToWords(21));
  }

  @Test
  @DisplayName("21-29 test")
  void testCase21() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Twenty " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(20 + i));
    }
  }

  @Test
  @DisplayName("30 is Thirty")
  void testCase22() {
    Assertions.assertEquals("Thirty", integerToEnglishWords.numberToWords(30));
  }

  @Test
  @DisplayName("31-39 test")
  void testCase23() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Thirty " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(30 + i));
    }
  }

  @Test
  @DisplayName("40 is Forty")
  void testCase24() {
    Assertions.assertEquals("Forty", integerToEnglishWords.numberToWords(40));
  }

  @Test
  @DisplayName("41-49 test")
  void testCase25() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Forty " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(40 + i));
    }
  }

  @Test
  @DisplayName("50 is Fifty")
  void testCase26() {
    Assertions.assertEquals("Fifty", integerToEnglishWords.numberToWords(50));
  }

  @Test
  @DisplayName("41-49 test")
  void testCase27() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Fifty " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(50 + i));
    }
  }

  @Test
  @DisplayName("60 is Sixty")
  void testCase28() {
    Assertions.assertEquals("Sixty", integerToEnglishWords.numberToWords(60));
  }

  @Test
  @DisplayName("61-69 test")
  void testCase29() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Sixty " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(60 + i));
    }
  }

  @Test
  @DisplayName("70 is Seventy")
  void testCase30() {
    Assertions.assertEquals("Seventy", integerToEnglishWords.numberToWords(70));
  }

  @Test
  @DisplayName("71-79 test")
  void testCase31() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Seventy " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(70 + i));
    }
  }

  @Test
  @DisplayName("80 is Eighty")
  void testCase32() {
    Assertions.assertEquals("Eighty", integerToEnglishWords.numberToWords(80));
  }

  @Test
  @DisplayName("81-89 test")
  void testCase33() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Eighty " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(80 + i));
    }
  }

  @Test
  @DisplayName("90 is Ninety")
  void testCase34() {
    Assertions.assertEquals("Ninety", integerToEnglishWords.numberToWords(90));
  }

  @Test
  @DisplayName("41-49 test")
  void testCase35() {
    for (int i = 1; i < 9; i++) {
      Assertions.assertEquals("Ninety " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(90 + i));
    }
  }

  @Test
  @DisplayName("100 is One Hundred")
  void testCase36() {
    Assertions.assertEquals("One Hundred", integerToEnglishWords.numberToWords(100));
  }

  @Test
  @DisplayName("101-199 test")
  void testCase37() {
    for (int i = 1; i < 99; i++) {
      Assertions.assertEquals("One Hundred " + integerToEnglishWords.numberToWords(i), integerToEnglishWords.numberToWords(100 + i));
    }
  }

  @Test
  @DisplayName("200 - 999 test")
  void testCase38() {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 99; j++) {
        Assertions.assertEquals(
            integerToEnglishWords.numberToWords(i) + " Hundred " + integerToEnglishWords.numberToWords(j),
            integerToEnglishWords.numberToWords(i * 100 + j)
        );
      }
    }
  }

  @Test
  @DisplayName("1000 is One Thousand")
  void testCase39() {
    Assertions.assertEquals("One Thousand", integerToEnglishWords.numberToWords(1000));
  }

  @Test
  @DisplayName("1001 is One Thousand One")
  void testCase40() {
    Assertions.assertEquals("One Thousand One", integerToEnglishWords.numberToWords(1001));
  }

  @Test
  @DisplayName("1001-1999 Test")
  void testCase41() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 999; j++) {
        Assertions.assertEquals(
            integerToEnglishWords.numberToWords(i) + " Thousand " + integerToEnglishWords.numberToWords(j),
            integerToEnglishWords.numberToWords(i * 1000 + j)
        );
      }
    }
  }

  @Test
  @DisplayName("1,000,000 is One Million")
  void testCase42() {
    Assertions.assertEquals("One Million", integerToEnglishWords.numberToWords(1000000));
  }

  @Test
  @DisplayName("1,000,001-9,999,999 test")
  void testCase43() {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9999; j++) {
        Assertions.assertEquals(
            integerToEnglishWords.numberToWords(i) + " Million " + integerToEnglishWords.numberToWords(j),
            integerToEnglishWords.numberToWords(i * 1000000 + j)
        );
      }
    }
  }

  @Test
  @DisplayName("1,000,000,000 is One Billion")
  void testCase44() {
    Assertions.assertEquals("One Billion", integerToEnglishWords.numberToWords(1000000000));
  }
}
