package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 751. IP to CIDR")
class IpToCidrTest {
	/* Write code here. */

  IpToCidr ipToCidr = new IpToCidr();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] expectedArray = {"255.0.0.7/32","255.0.0.8/29","255.0.0.16/32"};
    List<String> actual = ipToCidr.ipToCidr("255.0.0.7", 10);
    List<String> expected = Arrays.asList(expectedArray);

    Assertions.assertEquals(actual.size(), expected.size());
    Collections.sort(actual);
    Collections.sort(expected);
    for (int i = 0; i < actual.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }


}
