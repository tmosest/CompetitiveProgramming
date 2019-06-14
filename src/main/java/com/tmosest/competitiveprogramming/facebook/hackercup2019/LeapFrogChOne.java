package com.tmosest.competitiveprogramming.facebook.hackercup2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class LeapFrogChOne {

  private boolean isPossible = false;
  private Set<String> states = new HashSet<>();

  boolean canAlphaFrogLead(String lillyPadState) {
    isPossible = false;
    states.clear();
    canAlphaFrogLead(lillyPadState.toCharArray());
    return isPossible;
  }

  private void canAlphaFrogLead(char[] lillyPadState) {
    if (lillyPadState[lillyPadState.length - 1] == 'A') {
      isPossible = true;
      return;
    }
    String str = new String(lillyPadState);
    if (states.contains(str)) {
      return;
    }
    states.add(str);
    List<int[]> betaMoves = betaMoves(lillyPadState);
    for (int[] betaMove : betaMoves) {
      char[] nextState = lillyPadState.clone();
      nextState[betaMove[0]] = '.';
      nextState[betaMove[1]] = 'B';
      canAlphaFrogLead(nextState);
    }
    int[] alphaMove = alphaMove(lillyPadState);
    if (alphaMove[0] != alphaMove[1]) {
      char[] nextState = lillyPadState.clone();
      nextState[alphaMove[0]] = '.';
      nextState[alphaMove[1]] = 'A';
      canAlphaFrogLead(nextState);
    }
    return;
  }

  private int[] alphaMove(char[] letters) {
    int frogIndex = 0;
    // Find alpha
    while (frogIndex < letters.length && letters[frogIndex] != 'A') {
      ++frogIndex;
    }
    int origin = frogIndex;
    // Determine where he can go to
    while (frogIndex + 1 < letters.length && letters[frogIndex + 1] == 'B') {
      ++frogIndex;
    }
    if (frogIndex + 1 >= letters.length || letters[frogIndex + 1] != '.' || letters[origin + 1] == '.') {
      frogIndex = origin - 1;
    }
    ++frogIndex;
    int[] result = {origin, frogIndex};
    return result;
  }

  private List<int[]> betaMoves(char[] letters) {
    List<int[]> result = new ArrayList<>();
    for (int i = 0; i < letters.length; i++) {
      if (letters[i] == 'B') {
        if (i > 0 && letters[i - 1] == '.') {
          int[] pos = {
              i, i - 1
          };
          result.add(pos);
        }
        if (i < letters.length - 1 && letters[i + 1] == '.') {
          int[] pos = {
              i, i + 1
          };
          result.add(pos);
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    LeapFrogChOne leapFrogChOne = new LeapFrogChOne();
    Scanner in = new Scanner(System.in);
    int test = Integer.parseInt(in.nextLine());
    // System.out.println("Number of tests: " + test);
    for (int i = 1; i <= test; i++) {
      String input = in.nextLine();
      // System.out.println(input);
      char result = leapFrogChOne.canAlphaFrogLead(input) ? 'Y' : 'N';
      System.out.println("Case #" + i + ": " + result);
    }
  }
}
