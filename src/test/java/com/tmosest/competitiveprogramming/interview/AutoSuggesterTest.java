package com.tmosest.competitiveprogramming.interview;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("interview")
@Tag("hard")
@Tag("trie")
@DisplayName("Interview: AutoSuggester")
public class AutoSuggesterTest {

  Set<String> dictionary;
  AutoSuggester autoSuggester;

  private void test(String input) {
    autoSuggester = new AutoSuggester(dictionary);
    List<String> expected = new LinkedList<>();
    for (String s : dictionary) {
      if (s.startsWith(input)) {
        expected.add(s);
      }
    }
    List<String> actual = autoSuggester.suggest(input);
    Assertions.assertEquals(expected.size(), actual.size());

    Collections.sort(expected);
    Collections.sort(actual);

    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @BeforeEach
  void setUp() {
    dictionary = new HashSet<>();
    dictionary.add("hell");
    dictionary.add("hello");
    dictionary.add("hey");
    dictionary.add("hi");
    dictionary.add("how");
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    test("h");
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    test("he");
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    test("hel");
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    test("a");
  }
}
