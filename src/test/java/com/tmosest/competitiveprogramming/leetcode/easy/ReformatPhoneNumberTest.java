package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc220")
@DisplayName("LeetCode: 1694. Reformat Phone Number")
class ReformatPhoneNumberTest {

  private ReformatPhoneNumber reformatPhoneNumber;

  @BeforeEach
  void setup() {
    reformatPhoneNumber = new ReformatPhoneNumber();
  }

  private void test(String output, String number) {
    Assertions.assertEquals(output, reformatPhoneNumber.reformatNumber(number));
  }

  @Test
  void test0() {
    test("123-456", "1-23-45 6");
  }
}
