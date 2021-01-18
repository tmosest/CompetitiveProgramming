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
@Tag("matrix")
@Tag("advent2020")
@DisplayName("LeetCode: Day 3. Toboggan Trajectory")
class TobogganTrajectoryTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_3_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_3.getPath();
  private static final int[][] SLOPES = {
      {1, 1},
      {3, 1},
      {5, 1},
      {7, 1},
      {1, 2}
  };

  private TobogganTrajectory tobogganTrajectory;

  @BeforeEach
  void setup() {
    tobogganTrajectory = new TobogganTrajectory();
  }

  private void test(int output, List<String> inputs, int right, int down) {
    Assertions.assertEquals(output, tobogganTrajectory.countIntersectingTrees(inputs, right, down));
  }

  private void test2(long output, List<String> inputs, int[][] slopes) {
    Assertions.assertEquals(output, tobogganTrajectory.multiplyIntersectingTrees(inputs, slopes));
  }

  // part 1

  @Test
  void test0() throws IOException {
    test(7, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH), 3, 1);
  }

  @Test
  void test1() throws IOException {
    test(294, FileReader.INSTANCE.readLines(REAL_TEST_PATH), 3, 1);
  }

  // part 2

  @Test
  void test2() throws IOException {
    test2(336, FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH), SLOPES);
  }

  @Test
  void test3() throws IOException {
    test2(5774564250L, FileReader.INSTANCE.readLines(REAL_TEST_PATH), SLOPES);
  }
}
