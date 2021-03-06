package com.tmosest.competitiveprogramming.general;

import java.util.Arrays;

public class ProblemType {

  // Difficulty levels for problems.
  public enum Difficulty {
    advent,
    easy,
    medium,
    hard,
    expert,
    unknown;

    /**
     * Gets the Difficulty from the Testing tags.
     * @param tag The tag from the Java Test file that has the difficulty in it.
     * @return The difficulty or unknown if not found.
     */
    public static Difficulty fromTag(String tag) {
      return Arrays.stream(Difficulty.values()).filter(value ->
          String.format("@tag(\"%s\")", value.name()).equalsIgnoreCase(tag))
          .findAny()
          .orElse(Difficulty.unknown);
    }
  }

  // The sites that the problems can come from.
  public enum Site {
    firecode,
    googleCodeJam,
    hackerrank,
    leetcode,
    interview
  }

  // The problem topics.
  public enum Types {
    array,
    binarySearch,
    binarySearchTree,
    binaryTree,
    breadthFirstSearch,
    depthFirstSearch,
    design,
    distance,
    dynamic,
    gameTheory,
    graph,
    interval,
    list,
    matrix,
    map,
    nAryTree,
    number,
    palindrome,
    point,
    regex,
    sort,
    string,
    suffixArray,
    suffixTree,
    trie
  }

  public enum Contests {
    advent2020,
    april30Day,
    bwc41,
    bwc40,
    bwc39,
    bwc38,
    bwc37,
    bwc36,
    bwc35,
    bwc34,
    bwc23,
    wc223,
    wc222,
    wc221,
    wc220,
    wc219,
    wc218,
    wc217,
    wc216,
    wc215,
    wc214,
    wc213,
    wc212,
    wc211,
    wc210,
    wc209,
    wc208,
    wc207,
    wc170,
    wc171,
    wc172,
    wc173,
    wc174,
    wc175,
    wc176,
    wc177,
    wc178,
    wc179,
    wc180,
    wc181,
    wc182,
    wc185,
    wc186,
    wc187,
    wc188,
    wc189,
    wc190,
    wc191,
    wc192,
    wc193,
    wc194,
    wc195,
    wc196,
    wc197,
    wc198,
    wc199,
    wc200
  }

  /**
   * Manual testing.
   * @param args Command line args.x`x``
   */
  public static void main(String[] args) {
    System.out.println("===============Difficulty===============");
    for (Difficulty difficulty : Difficulty.values()) {
      System.out.println(difficulty);
    }
    System.out.println("===============Sites===============");
    for (Site site : Site.values()) {
      System.out.println(site);
    }
    System.out.println("===============Topic===============");
    for (Types type : Types.values()) {
      System.out.println(type);
    }
    System.out.println("===============Contests===============");
    for (Contests contest : Contests.values()) {
      System.out.println(contest);
    }
  }
}
