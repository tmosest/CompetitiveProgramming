package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.leetcode.advent.BinaryBoarding.BoardingPass;
import com.tmosest.competitiveprogramming.testUtils.Advent2020TestPathsEnum;
import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("string")
@Tag("advent2020")
@DisplayName("LeetCode: Day 5. Binary Boarding")
class BinaryBoardingTest {

  private static final String SAMPLE_TEST_PATH = Advent2020TestPathsEnum.DAY_5_SAMPLE.getPath();
  private static final String REAL_TEST_PATH = Advent2020TestPathsEnum.DAY_5.getPath();

  // part 1
  @Test
  void test_seat_id() {
    Assertions.assertEquals(357, new BinaryBoarding.BoardingPass(44, 5).getSeatId());
  }

  @Test
  void test_passFromBinaryTicket() {
    BoardingPass boardingPass = BinaryBoarding.passFromBinaryTicket("BFFFBBFRRR");
    Assertions.assertEquals(70, boardingPass.getRow());
    Assertions.assertEquals(7, boardingPass.getSeat());
    Assertions.assertEquals(567, boardingPass.getSeatId());
  }

  @Test
  void test_maxSeatId_onSample() throws IOException {
    Assertions.assertEquals(820, BinaryBoarding.maxSeatId(FileReader.INSTANCE.readLines(SAMPLE_TEST_PATH)));
  }

  @Test
  void test_maxSeatId_onReal() throws IOException {
    Assertions.assertEquals(818, BinaryBoarding.maxSeatId(FileReader.INSTANCE.readLines(REAL_TEST_PATH)));
  }

  // Part 2
  @Test
  void test_missingSeats() throws IOException {
    Assertions.assertEquals(559, BinaryBoarding.findMySeat(FileReader.INSTANCE.readLines(REAL_TEST_PATH)));
  }
}
