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
}
