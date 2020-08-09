package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("wc170")
@DisplayName("LeetCode: 1309. Decrypt String from Alphabet to Integer Mapping")
class DecryptStringFromAlphabetToIntegerMappingTest {

  @Test
  void freqAlphabets_testCase0_isValid() {
    Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz",
        new DecryptStringFromAlphabetToIntegerMapping()
            .freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
  }
}
