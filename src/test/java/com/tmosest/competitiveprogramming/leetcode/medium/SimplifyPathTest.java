package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 71. Simplify Path")
class SimplifyPathTest {
	/* Write code here. */

  SimplifyPath simplifyPath = new SimplifyPath();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("/home", simplifyPath.simplifyPath("/home/"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("/", simplifyPath.simplifyPath("/../"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals("/c", simplifyPath.simplifyPath("/a/./b/../../c/"));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertEquals("/c", simplifyPath.simplifyPath("/a/../../b/../c//.//"));
  }

  @Test
  @DisplayName("Test Case 5")
  void testCase5() {
    Assertions.assertEquals("/a/b/c", simplifyPath.simplifyPath("/a//b////c/d//././/.."));
  }


}
