package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 881. Boats to Save People")
public class BoatsToSavePeopleTest {

  BoatsToSavePeople boatsToSavePeople = new BoatsToSavePeople();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] people = {
        1, 2
    };
    Assertions.assertEquals(1, boatsToSavePeople.numRescueBoats(people, 3));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] people = {
        3,2,2,1
    };
    Assertions.assertEquals(3, boatsToSavePeople.numRescueBoats(people, 3));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    int[] people = {
        3,5,3,4
    };
    Assertions.assertEquals(4, boatsToSavePeople.numRescueBoats(people, 4));
  }
}
