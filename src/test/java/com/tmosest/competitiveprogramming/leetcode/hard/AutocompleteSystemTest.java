package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("hard")
@DisplayName("LeetCode: 642. Design Search Autocomplete System")
class AutocompleteSystemTest {
	/* Write code here. */
  private AutocompleteSystem autocompleteSystem;

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {"i love you", "island", "ironman", "i love leetcode"};
    int[] times = {5, 3, 2, 2};
    autocompleteSystem = new AutocompleteSystem(words, times);

    List<String> expected = new ArrayList<>();
    expected.add("i love you");
    expected.add("island");
    expected.add("i love leetcode");

    Assertions.assertLinesMatch(expected, autocompleteSystem.input('i'));

    expected.remove("island");
    Assertions.assertLinesMatch(expected, autocompleteSystem.input(' '));

    expected.remove("i love you");
    expected.remove("i love leetcode");

    Assertions.assertLinesMatch(expected, autocompleteSystem.input('a'));
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('#'));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] words = {"abc", "abbc", "a"};
    int[] times = {3, 3, 3};
    autocompleteSystem = new AutocompleteSystem(words, times);

    List<String> expected = new ArrayList<>();

    Assertions.assertLinesMatch(expected, autocompleteSystem.input('b'));
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('c'));
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('#'));

    expected.add("bc");
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('b'));
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('c'));

    expected.remove("bc");
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('#'));

    expected.add("a");
    expected.add("abbc");
    expected.add("abc");

    Assertions.assertLinesMatch(expected, autocompleteSystem.input('a'));

    expected.remove("a");
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('b'));

    expected.remove("abbc");
    Assertions.assertLinesMatch(expected, autocompleteSystem.input('c'));
  }


}
