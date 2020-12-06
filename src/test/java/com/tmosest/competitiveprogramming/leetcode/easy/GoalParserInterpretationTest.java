package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("interval")
@Tag("wc218")
@DisplayName("LeetCode: 1678. Goal Parser Interpretation")
class GoalParserInterpretationTest {

  private GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();

  @Test
  void test1() {
    Assertions.assertEquals("Goal", goalParserInterpretation.interpret("G()(al)"));
  }
}
