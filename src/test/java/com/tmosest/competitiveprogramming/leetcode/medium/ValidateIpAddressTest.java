package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 468. Validate IP Address")
class ValidateIpAddressTest {

  @Test
  void testCase0() {
    Assertions.assertEquals("IPv4", ValidateIpAddress.validIpAddress("172.16.254.1"));
  }
}
