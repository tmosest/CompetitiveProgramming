package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1018. Binary Prefix Divisible By 5")
public class BinaryPrefixDivisibleByFiveTest {

  BinaryPrefixDivisibleByFive binaryPrefixDivisibleByFive = new BinaryPrefixDivisibleByFive();

  private void test(int[] input, Boolean[] output) {
    List<Boolean> expected = Arrays.asList(output);
    List<Boolean> actual = binaryPrefixDivisibleByFive.prefixesDivBy5(input);
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        0,1,1
    };
    Boolean[] output = {
        true,false,false
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] input = {
        1,1,1
    };
    Boolean[] output = {
        false,false,false
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] input = {
        0,1,1,1,1,1
    };
    Boolean[] output = {
        true,false,false,false,true,false
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    int[] input = {
        1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1
    };
    Boolean[] output = {
        false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,true,true,true,true,false
    };
    test(input, output);
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    int[] input = {
        1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0
    };
    Boolean[] output = {
        false,false,true,false,false,false,false,false,false,false,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,true,false,false,true,true,true,true,true,true,true,false,false,true,false,false,false,false,true,true
    };
    test(input, output);
  }
}
