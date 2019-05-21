package com.tmosest.competitiveprogramming.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Util")
@DisplayName("Class Name Util Test")
class ClassNameUtilTest {

  private ClassNameUtil classNameUtil = ClassNameUtil.instance();

  @Test
  @DisplayName("Should remove spaces and capitalize names")
  void should_remove_spaces() {
    Assertions.assertEquals("RabbitsInForest", classNameUtil.convertToClassName("Rabbits in Forest"));
  }

  @Test
  @DisplayName("Should be able to create a test class name")
  void should_append_test() {
    Assertions.assertEquals("RabbitsInForestTest", classNameUtil.createTestClassName("Rabbits in Forest"));
  }

  @Test
  @DisplayName("Should be able to convert roman numerals to numbers")
  void should_be_able_to_covert_ii_to_two() {
    Assertions.assertEquals("RemoveDuplicatesFromSortedArray2", classNameUtil.convertToClassName("Remove Duplicates from Sorted Array II"));
  }

  @Test
  @DisplayName("Only first letter should be capitalized")
  void should_only_capitalize_first_letter() {
    Assertions.assertEquals("RangeSumOfBst", classNameUtil.convertToClassName("Range Sum of BST"));
  }

  @Test
  @DisplayName("Should avoid two caps in a row")
  void should_avoid_two_caps_in_a_row() {
    Assertions.assertEquals("TestName", classNameUtil.convertToClassName("Test a Name"));
  }

  @Test
  @DisplayName("Name should not be empty if there are two single letters in a row")
  void should_not_be_empty_with_two_small_numbers() {
    Assertions.assertEquals("A", classNameUtil.convertToClassName("a"));
  }
}
