package com.tmosest.competitiveprogramming.facebook.hackercup2019;

import java.util.Scanner;

class LeapFrogChOne {

  boolean canAlphaFrogLead(String lillyPadState) {
    // Check if the frog is already at the end.
    if (lillyPadState.charAt(lillyPadState.length() - 1) == 'A') {
      return true;
    }
    int countBs = 0;
    // Count B's
    for (char letter : lillyPadState.toCharArray()) {
      if (letter == 'B') {
        ++countBs;
      }
    }
    // Full of B's
    if (countBs == lillyPadState.length() - 1) {
      return false;
    }
    // Put in some B's
    for (int i = 1; i < lillyPadState.length(); i += 2) {
      --countBs;
      if (countBs < 0) {
        return false;
      }
    }
    return true;
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
