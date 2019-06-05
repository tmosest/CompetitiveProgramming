package com.tmosest.competitiveprogramming.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Algorithms -> Strings -> Sherlock and the Valid String ProblemType: Medium Score: 35 pts Sherlock
 * considers a strings to be valid if either of the following conditions are satisfied: All
 * characters in have the same exact frequency (i.e., occur the same number of times). Deleting
 * exactly character from will result in all its characters having the same frequency. Constraints:
 * 1 <= |s| <= 10^5, string contains only lowercase letters Output: YES or NO. Sample Input 0:
 * aabbcd Sample Output 0: NO link: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem.
 *
 * @author tmosest (Tyler Owen Moses)
 */
public class SherlockAndTheValidString {

  /**
   * private static final int alphabetSize how many different characters can be in the word.
   */
  private static final int alphabetSize = 26;
  /**
   * private static final char first character in the alphabet.
   */
  private static final char firstLetter = 'a';
  /**
   * public static boolean debugMode for debugging.
   */
  public static boolean debugMode = false;

  /**
   * Function to get the index of a character in comparison to the first letter.
   *
   * @param letter character to find index of in the alphabet.
   * @return return the index as an integer.
   */
  private static int getIndex(char letter) {
    return (int) (letter - firstLetter);
  }

  /**
   * Function to count the number of different characters in the string.
   *
   * @param string String to get letter counts for.
   * @return integer array of the letter counts.
   */
  private static int[] countLetters(String string) {
    // Create an array of 26 letter counts;
    int[] letterCounts = new int[alphabetSize];
    // Get Letter Counts
    for (int i = 0; i < string.length(); i++) {
      // Get index and increment value
      letterCounts[getIndex(string.charAt(i))]++;
      if (debugMode) {
        System.out
            .println("Count for " + string.charAt(i) + " is " + letterCounts[getIndex(
                string.charAt(i))]);
      }
    }
    return letterCounts;
  }

  /**
   * Find the most common count of letters.
   *
   * @param letterCounts array of integers representing the letter counts.
   * @return an integer that is the most common count of letters.
   */
  private static int findMostCommonCount(int[] letterCounts) {
    // Sort counts to find most common
    Arrays.sort(letterCounts);
    int index = 0;
    // Find first non zero index
    while (letterCounts[index] == 0) {
      index++;
    }
    // Get the party started
    int mostFrequent = letterCounts[index];
    int largestCount = 1;
    int lookingFor = letterCounts[index];
    int count = 1;
    // Loop through and find most common
    for (index++; index < letterCounts.length; index++) {
      if (debugMode) {
        System.out
            .println("Looking at count: " + letterCounts[index] + " comparing to " + lookingFor);
      }
      if (letterCounts[index] == lookingFor) {
        ++count;
      } else {
        if (debugMode) {
          System.out.println("New Count Found! " + letterCounts[index] + " with count of " + count
              + " as compared to largest count of " + largestCount);
        }
        if (count >= largestCount) {
          mostFrequent = letterCounts[index - 1];
          largestCount = count;
          if (debugMode) {
            System.out.println(
                "New Largest most frequent is " + mostFrequent + " with count " + largestCount);
          }
        }
        count = 1;
        lookingFor = letterCounts[index];
      }
    }
    if (count >= largestCount) {
      mostFrequent = letterCounts[index - 1];
      largestCount = count;
      if (debugMode) {
        System.out.println(
            "New Largest most frequent is " + mostFrequent + " with count " + largestCount);
      }
    }
    return mostFrequent;
  }

  /**
   * Function to determine if the letter counts will match what we need.
   *
   * @param letterCounts integer array of letter counts.
   * @param mostCommonCount integer representing most common count of letters.
   * @return boolean of is a valid Sherlock string or not.
   */
  private static boolean checkFrequencies(int[] letterCounts, int mostCommonCount) {
    boolean result = true;
    boolean hasDeleted = false;
    // Loop through counts
    for (int i = 0; i < letterCounts.length; i++) {
      // Compare letter count to most common count
      if (letterCounts[i] != 0 && letterCounts[i] != mostCommonCount) {
        // If letter count is different and one we can delete one character.
        if (letterCounts[i] == 1) {
          // If we have already deleted then it isn't valid
          if (hasDeleted) {
            result = false;
            break;
          } else {
            // Other wise we delete one character
            hasDeleted = true;
          }
        } else {
          // If it is greater than one
          // If count is smaller than we are done
          if (letterCounts[i] < mostCommonCount) {
            result = false;
            break;
          } else {
            // If it is larger maybe we can delete one to fit it.
            // If too large we are done
            if (letterCounts[i] > mostCommonCount + 1) {
              result = false;
              break;
            }
            // Otherwise we can delete one character maybe
            // If we have already deleted then it isn't valid
            if (hasDeleted) {
              result = false;
              break;
            } else {
              // Other wise we delete one character
              hasDeleted = true;
            }
          }
        }
      }
    }
    return result;
  }

  /**
   * Function to make all the calls needed to check if a string is valid or not. Gets the most
   * common count and then compares it to the letter counts.
   *
   * @param string String the input to check.
   * @return boolean determining if it meets the criteria in the class comments.
   */
  private static boolean isValidString(String string) {
    int[] letterCounts = countLetters(string);
    int mostCommonCount = findMostCommonCount(letterCounts);
    if (debugMode) {
      System.out.println("Most Common Count: " + mostCommonCount);
    }
    return checkFrequencies(letterCounts, mostCommonCount);
  }

  /**
   * Wrapper function for main for Unit Testing.
   *
   * @return String of YES or NO for valid or invalid input.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    in.close();

    if (debugMode) {
      System.out.println("Input String: " + input);
    }

    return (isValidString(input)) ? "YES" : "NO";
  }

  /**
   * Main Function.
   *
   * @param args string array needed for Java main functions.
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }

}
