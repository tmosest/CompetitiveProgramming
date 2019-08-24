package com.tmosest.competitiveprogramming.utils.string;

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
    Assertions.assertEquals("RemoveDuplicatesFromSortedArrayTwo", classNameUtil.convertToClassName("Remove Duplicates from Sorted Array II"));
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

  @Test
  @DisplayName("Name should handle negative numbers as well")
  void should_only_contain_letters() {
    Assertions.assertEquals("ConvertToBaseNegativeTwo", classNameUtil.convertToClassName("Convert to Base -2"));
  }

  @Test
  @DisplayName("Name should handle negative numbers as well")
  void should_be_able_to_handle_multi_word_numbers() {
    Assertions.assertEquals("ConvertToBaseTwentyTwo", classNameUtil.convertToClassName("Convert to Base XXII"));
  }

  @Test
  @DisplayName("Should remove new line characters")
  void should_remove_new_line_characters() {
    Assertions.assertEquals("ShortestWordDistanceTwo", classNameUtil.convertToClassName("Shortest Word Distance II\n"));
  }

  @Test
  @DisplayName("Should remove hyphens line characters")
  void should_remove_underscores() {
    Assertions.assertEquals("NthTribonacciNumber", classNameUtil.convertToClassName("N-th Tribonacci Number"));
  }
}
