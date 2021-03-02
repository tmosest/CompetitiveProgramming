package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.Advent2020TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("string")
@Tag("advent2020")
@DisplayName("LeetCode: Day 19. Monster Messages")
class MonsterMessagesTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_19_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_19.getPath();

  private MonsterMessages monsterMessages;

  @BeforeEach
  void setup() {
    monsterMessages = new MonsterMessages();
  }

  private void test(long output, List<String> input) {
    Assertions.assertEquals(output, monsterMessages.numberOfStringMatchingRuleZero(input));
  }

  @Test
  void test0_numberOfStringMatchingRuleZero_sampleSuccess() throws IOException {
    test(2, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_numberOfStringMatchingRuleZero_realSuccess() throws IOException {
    test(111, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
