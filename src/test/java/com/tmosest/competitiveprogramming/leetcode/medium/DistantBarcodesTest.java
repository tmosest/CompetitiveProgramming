package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 1054. Distant Barcodes")
class DistantBarcodesTest {

  private DistantBarcodes distantBarcodes = new DistantBarcodes();

  private void test(int[] input){
    int[] output = distantBarcodes.rearrangeBarcodes(input);
    Assertions.assertEquals(input.length, output.length);
    for (int i = 0; i < output.length - 1; i++) {
      Assertions.assertNotEquals(output[i], output[i + 1]);
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,1,1,2,2,2
    };
    test(input);
  }
}
