package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.testUtils.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("advent")
@Tag("array")
@Tag("advent2020")
@DisplayName("LeetCode: Day 1. Report Repair")
class ReportRepairTest {

  private ReportRepair reportRepair;

  @BeforeEach
  void setup() {
    reportRepair = new ReportRepair();
  }

  private void test(int output, int[] arrs, int sum) {
    Assertions.assertEquals(output, reportRepair.findMultipleOfSum(arrs, sum));
  }

  @Test
  void test0() {
    test(514579, new int[] {1721,
        979,
        366,
        299,
        675,
        1456}, 2020);
  }

  @Test
  void test1() throws IOException {
    test(876459, FileReader.INSTANCE.readInts("advent_2020_day1.txt"), 2020);
  }

  @Test
  void test2() throws IOException {
    Assertions.assertEquals(116168640,
        reportRepair.findMultipleOfThreeSum(FileReader.INSTANCE.readInts("advent_2020_day1.txt"), 2020));
  }
}
