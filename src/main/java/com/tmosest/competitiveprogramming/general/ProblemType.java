package com.tmosest.competitiveprogramming.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemType {

  // Difficulty levels for problems.
  public enum Difficulty {
    advent,
    easy,
    medium,
    hard,
    expert,
    unknown,
    codejam;

    /**
     * Gets the Difficulty from the Testing tags.
     * 
     * @param tag The tag from the Java Test file that has the difficulty in it.
     * @return The difficulty or unknown if not found.
     */
    public static Difficulty fromTag(String tag) {
      return Arrays.stream(Difficulty.values())
          .filter(value -> String.format("@tag(\"%s\")", value.name()).equalsIgnoreCase(tag))
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
    floydWarshalStandard,
    gameTheory,
    graph,
    greedy,
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
    dvent2020,
    advent2021,
    advent2022,
    april30Day,
    bwc23,
    bwc34,
    bwc35,
    bwc36,
    bwc37,
    bwc38,
    bwc39,
    bwc40,
    bwc41,
    bwc126,
    codeJam2022,
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
    wc200,
    wc207,
    wc208,
    wc209,
    wc210,
    wc211,
    wc212,
    wc213,
    wc214,
    wc215,
    wc216,
    wc217,
    wc218,
    wc219,
    wc220,
    wc221,
    wc222,
    wc223,
    wc224,
    wc286,
    wc300,
    wc301,
    wc302,
    wc380,
    wc381,
    wc382,
    wc383,
    wc384,
    wc385,
    wc386,
    wc387,
    wc388,
    wc389,
    wcx
  }

  /**
   * Manual testing.
   * 
   * @param args Command line args.x`x``
   */
  public static void main(String[] args) {
    System.out.println("===============Difficulty===============");
    Difficulty[] difficulties = Difficulty.values();
    Arrays.sort(difficulties);
    for (Difficulty difficulty : difficulties) {
      System.out.println(difficulty);
    }
    System.out.println("===============Sites===============");
    Site[] sites = Site.values();
    Arrays.sort(sites);
    for (Site site : sites) {
      System.out.println(site);
    }
    System.out.println("===============Topic===============");
    Types[] types = Types.values();
    Arrays.sort(types);
    for (Types type : types) {
      System.out.println(type);
    }
    System.out.println("===============Contests===============");
    List<Contests> contests = Arrays.asList(Contests.values());
    Collections.sort(contests, new Comparator<Contests>() {

      @Override
      public int compare(Contests one, Contests two) {
        one.toString().matches("[a-zA-Z]+");

        Matcher oneLetters = Pattern.compile("[a-zA-Z]+").matcher(one.toString());
        Matcher twoLetters = Pattern.compile("[a-zA-Z]+").matcher(two.toString());

        List<String> allOneMatches = new java.util.ArrayList<String>();
        while (oneLetters.find()) {
          allOneMatches.add(oneLetters.group());
        }

        List<String> allTwoMatches = new java.util.ArrayList<String>();
        while (twoLetters.find()) {
          allTwoMatches.add(twoLetters.group());
        }

        // TODO th
        if (allOneMatches.size() == allTwoMatches.size()) {
          String oneStr = one.toString();
          String twoStr = two.toString();
          for (int i = 0; i < allOneMatches.size(); i++) {
            if (!allOneMatches.get(i).equals(allTwoMatches.get(i))) {
              return one.toString().compareToIgnoreCase(two.toString());
            }
            oneStr = oneStr.replace(allOneMatches.get(i), "");
            twoStr = twoStr.replace(allTwoMatches.get(i), "");
          }

          return Integer.compare(Integer.valueOf(oneStr), Integer.valueOf(twoStr));
        }

        return one.toString().compareToIgnoreCase(two.toString());
      }
    });
    for (Contests contest : contests) {
      System.out.println(contest + ",");
    }
  }
}
