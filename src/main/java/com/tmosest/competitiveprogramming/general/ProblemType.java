package com.tmosest.competitiveprogramming.general;

public class ProblemType {

  // Difficulty levels for problems.
  public enum Difficulty {
    easy,
    medium,
    hard
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

  /**
   * Manual testing.
   * @param args Command line args.
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
  }
}