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
  void convertToClassName_withSpaces_shouldRemoveSpaces() throws IllegalArgumentException {
    Assertions
        .assertEquals("RabbitsInForest", classNameUtil.convertToClassName("Rabbits in Forest"));
  }

  @Test
  @DisplayName("Should be able to create a test class name")
  void createTestClassName_givenClassName_shouldAppendTest() throws IllegalArgumentException {
    Assertions.assertEquals("RabbitsInForestTest",
        classNameUtil.createTestClassName("Rabbits in Forest"));
  }

  @Test
  @DisplayName("Should be able to convert roman numerals to numbers")
  void convertToClassName_givenARomanNumeral_shouldConvertNumberToWords()
      throws IllegalArgumentException {
    Assertions.assertEquals("RemoveDuplicatesFromSortedArrayTwo",
        classNameUtil.convertToClassName("Remove Duplicates from Sorted Array II"));
  }

  @Test
  @DisplayName("Only first letter should be capitalized")
  void convertToClassName_givenWordWithSpaces_shouldCapitalizeFirstLetterInEachNewWord()
      throws IllegalArgumentException {
    Assertions.assertEquals("RangeSumOfBst", classNameUtil.convertToClassName("Range Sum of BST"));
  }

  @Test
  @DisplayName("Should avoid two caps in a row")
  void convertToClassName_givenTwoCapsInARow_ShouldRemoveTheSingleLetterWord()
      throws IllegalArgumentException {
    Assertions.assertEquals("TestName", classNameUtil.convertToClassName("Test a Name"));
  }

  @Test
  @DisplayName("Name should not be empty if there are two single letters in a row")
  void convertToClassName_givenASingleLetter_shouldNotBeEmpty() throws IllegalArgumentException {
    Assertions.assertEquals("A", classNameUtil.convertToClassName("a"));
  }

  @Test
  @DisplayName("Name should handle negative numbers as well")
  void convertToClassName_givenANegative_ShouldRemoveNegative() throws IllegalArgumentException {
    Assertions.assertEquals("ConvertToBaseNegativeTwo",
        classNameUtil.convertToClassName("Convert to Base -2"));
  }

  @Test
  @DisplayName("Should remove new line characters")
  void convertToClassName_givenANewLineCharacter_shouldRemoveIt() throws IllegalArgumentException {
    Assertions.assertEquals("ShortestWordDistanceTwo",
        classNameUtil.convertToClassName("Shortest Word Distance II\n"));
  }

  @Test
  @DisplayName("Should remove hyphens line characters")
  void convertToClassName_givenHyphens_covertsToUnderScores() throws IllegalArgumentException {
    Assertions.assertEquals("NthTribonacciNumber",
        classNameUtil.convertToClassName("N-th Tribonacci Number"));
  }

  @Test
  @DisplayName("Should change % to percent")
  void convertToClassName_givenPercentSign_shouldConvertToPercent()
      throws IllegalArgumentException {
    Assertions.assertEquals("ElementAppearingMoreThanTwentyFivePercentInSortedArray",
        classNameUtil.convertToClassName("Element Appearing More Than 25% In Sorted Array"));
  }

  @Test
  @DisplayName("Should change % to percent")
  void convertToClassName_illegalCharacter_shouldConverThrowError() {
    try {
      classNameUtil.convertToClassName("!@#%$@$#*@(*#@(!)#)@!(#)!@");
      Assertions.assertTrue(false);
    } catch (IllegalArgumentException e) {
      Assertions.assertTrue(true);
    }
  }
}
