package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 721. Accounts Merge")
class AccountsMergeTest {

  private AccountsMerge accountsMerge = new AccountsMerge();

  private static final Pattern pattern = Pattern.compile("((?<![\\\\])['\"])((?:.(?!(?<![\\\\])\\1))*.?)\\1");

  private List<List<String>> stringToList(String input) {
    List<List<String>> result = new ArrayList<>();

    List<String> lists = Arrays.asList(input.split("],"));

    lists.forEach((str) -> {
      Matcher matches = pattern.matcher(str);
      List<String> line = new ArrayList<>();
      while (matches.find()) {
        line.add(matches.group()
            .replace("'", "")
            .replace("\"", ""));
      }
      result.add(line);
    });

    return result;
  }

  void test(String input, String output) {
    Assertions.assertEquals(stringToList(output), accountsMerge.accountsMerge(stringToList(input)));
  }

  @Test
  void testCase0() {
    String input = "[[\"John\", \"johnsmith@mail.com\", \"john00@mail.com\"], "
        + "[\"John\", \"johnnybravo@mail.com\"],"
        + " [\"John\", \"johnsmith@mail.com\", \"john_newyork@mail.com\"], "
        + "[\"Mary\", \"mary@mail.com\"]]";

    String expected =
        "[[\"John\", \"johnnybravo@mail.com\"],"
            + "[\"John\", 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'], "
            + "[\"Mary\", \"mary@mail.com\"]]";

    test(input, expected);
  }

  @Test
  void testCase1() {
    String input = "[[\"David\",\"David0@m.co\",\"David1@m.co\"],"
        + "[\"David\",\"David3@m.co\",\"David4@m.co\"]"
        + ",[\"David\",\"David4@m.co\",\"David5@m.co\"],"
        + "[\"David\",\"David2@m.co\",\"David3@m.co\"],"
        + "[\"David\",\"David1@m.co\",\"David2@m.co\"]]";

    String expected =
        "[[\"David\",\"David0@m.co\",\"David1@m.co\",\"David2@m.co\",\"David3@m.co\",\"David4@m.co\",\"David5@m.co\"]]";

    test(input, expected);
  }
}
