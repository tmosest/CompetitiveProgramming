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
@DisplayName("LeetCode: Day 24. Lobby Layout")
class LobbyLayoutTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_24_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_24.getPath();

  private LobbyLayout lobbyLayout;

  @BeforeEach
  void setup() {
    lobbyLayout = new LobbyLayout();
  }

  private void test(int output, List<String> input) {
    Assertions.assertEquals(output, lobbyLayout.blackTileCount(input));
  }

  @Test
  void getTileFromDirections_nwwswee_reference() {
    Assertions.assertEquals("0,0", lobbyLayout.getTileFromDirections("nwwswee"));
  }

  @Test
  void test0_blackTileCount_sampleSuccess() throws IOException {
    // incorrect
    test(10, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH));
  }

  @Test
  void test0_blackTileCount_realSuccess() throws IOException {
    // Note too low.
    test(332, FileReader.INSTANCE.readLines(REAL_TEST_PATH));
  }
}
