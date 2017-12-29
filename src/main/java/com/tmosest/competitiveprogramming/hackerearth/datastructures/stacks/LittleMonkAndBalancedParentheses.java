package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class LittleMonkAndBalancedParentheses {

  public static boolean debugMode = false;

  /**
   * Function for testing. Takes in integers that represent different types of brackets.
   *
   * @return The lenght of the longest balanced sub-arra.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int brackets = in.nextInt();
    Stack<Integer> bracketStack = new Stack<Integer>();
    int maxCount = 0;
    int count = 0;
    int previousCount = 0;
    for (int b = 0; b < brackets; b++) {
      int bracket = in.nextInt();
      if (debugMode) {
        System.out.println("bracket: " + bracket);
      }
      if (bracket > 0) {
        bracketStack.push(bracket);
        if (count > 0) {
          previousCount = count;
          count = 0;
          maxCount = Math.max(previousCount, maxCount);
        }
      } else {
        if (!bracketStack.empty()) {
          int toCheck = bracketStack.peek();
          if (debugMode) {
            System.out.println("toCheck: " + toCheck);
          }
          if (toCheck == -1 * bracket) {
            bracketStack.pop();
            count += 2;
            if (bracketStack.size() == 0) {
              count += previousCount;
              previousCount = 0;
            }
            maxCount = Math.max(count, maxCount);
          } else {
            bracketStack.push(bracket);
          }
        }
      }
    }
    in.close();
    if (bracketStack.size() == 0) {
      count += previousCount;
    }
    maxCount = Math.max(maxCount, count);
    return maxCount;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
