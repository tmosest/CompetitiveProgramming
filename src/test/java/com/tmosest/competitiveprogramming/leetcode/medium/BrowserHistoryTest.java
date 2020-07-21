package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("design")
@Tag("wc192")
@DisplayName("LeetCode: 1472. Design Browser History")
class BrowserHistoryTest {

  @Test
  void testCase0() {
    BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
    browserHistory.visit("google.com");
    browserHistory.visit("facebook.com");
    browserHistory.visit("youtube.com");

    Assertions.assertEquals("facebook.com", browserHistory.back(1));
    Assertions.assertEquals("google.com", browserHistory.back(1));
    Assertions.assertEquals("facebook.com", browserHistory.forward(1));

    browserHistory.visit("linkedin.com");

    Assertions.assertEquals("linkedin.com", browserHistory.forward(2));
    Assertions.assertEquals("google.com", browserHistory.back(2));
    Assertions.assertEquals("leetcode.com", browserHistory.back(7));
  }
}
