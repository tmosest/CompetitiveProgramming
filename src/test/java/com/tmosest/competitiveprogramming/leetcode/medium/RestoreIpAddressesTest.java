package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 93. Restore IP Addresses")
class RestoreIpAddressesTest {

  @Test
  void testCaseo() {
    String[] expected = {"255.255.11.135", "255.255.111.35"};
    Assertions.assertArrayEquals(
        expected,
        RestoreIpAddresses.restoreIpAddresses("25525511135").toArray(new String[0])
    );
  }
}
