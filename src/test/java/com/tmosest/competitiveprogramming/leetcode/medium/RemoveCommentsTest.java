package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 722. Remove Comments")
class RemoveCommentsTest {
	/* Write code here. */

  RemoveComments removeComments = new RemoveComments();

  private void test(String[] input, String[] output) {
    List<String> actual = removeComments.removeComments(input);
    List<String> expected = removeComments.removeComments(output);
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] source = {
        "/*Test program */",
        "int main()",
        "{ ",
        "  // variable declaration ",
        "int a, b, letter;",
        "/* This is a test",
        "   multiline  ",
        "   comment for ",
        "   testing */", "a = b + letter;",
        "}"
    };
    String[] output = {
        "int main()","{ ","  ","int a, b, letter;","a = b + letter;","}"
    };
    test(source, output);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String[] source = {
        "a/*comment",
        "line",
        "more_comment*/b"
    };
    String[] output = {
        "ab"
    };
    test(source, output);
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    String[] source = {
        "class test{",
        "public: ",
        "   int left = 1;",
        "   /*double right = 1;*/",
        "   char letter;", "};"
    };
    String[] output = {
        "class test{",
        "public: ",
        "   int left = 1;",
        "   ",
        "   char letter;",
        "};"
    };
    test(source, output);
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    String[] source = {
        "struct Node{",
        "    /*/ declare members;/**/",
        "    int size;",
        "    /**/int val;",
        "};"
    };
    String[] output = {
        "struct Node{",
        "    ",
        "    int size;",
        "    int val;",
        "};"
    };
    test(source, output);
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    String[] source = {
        "a/*/b//*letter",
        "blank",
        "d/*/e*//f"
    };
    String[] output = {
        "ae*"
    };
    test(source, output);
  }


}
