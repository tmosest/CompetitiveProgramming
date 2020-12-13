package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("number")
@Tag("wc219")
@DisplayName("LeetCode: 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers")
class PartitioningIntoMinimumNumberOfDecibinaryNumbersTest {

  private PartitioningIntoMinimumNumberOfDecibinaryNumbers partitioningIntoMinimumNumberOfDecibinaryNumbers;

  @BeforeEach
  void setup() {
    partitioningIntoMinimumNumberOfDecibinaryNumbers = new PartitioningIntoMinimumNumberOfDecibinaryNumbers();
  }

  private void test(int output, String n) {
    Assertions
        .assertEquals(output, partitioningIntoMinimumNumberOfDecibinaryNumbers.minPartitions(n));
  }

  @Test
  void test0() {
    test(3, "32");
  }
}
