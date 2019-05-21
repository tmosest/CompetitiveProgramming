package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("array")
@DisplayName("LeetCode: 811. Subdomain Visit Count")
class SubdomainVisitCountTest {
	/* Write code here. */

  SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();

  @Test
  @DisplayName("Tast Case 0")
  void testCase0() {
    List<String> expected = new ArrayList<>();
    expected.add("9001 discuss.leetcode.com");
    expected.add("9001 leetcode.com");
    expected.add("9001 com");

    String[] input = {"9001 discuss.leetcode.com"};
    List<String> actual = subdomainVisitCount.subdomainVisits(input);
    Collections.sort(expected);
    Collections.sort(actual);

    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }


}
