package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1108. Defanging an IP Address")
class DefangingAnIpAddressTest {

  private DefangingAnIpAddress defangingAnIpAddress = new DefangingAnIpAddress();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals( "1[.]1[.]1[.]1", defangingAnIpAddress.defangIPaddr("1.1.1.1"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals( "255[.]100[.]50[.]0", defangingAnIpAddress.defangIPaddr("255.100.50.0"));
  }
}
