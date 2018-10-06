package com.tmosest.competitiveprogramming.hackerrank.woc.week1;

import java.util.Scanner;


/**
 * Given the scores for two team's scores need to
 * find a way to compute the number of final sequences.
 * A final sequence is one that results in a win for one team.
 * In volleyball a team when with 25 points if the other is below 24 but must win by two.
 * Formula for Permutation with repetition
 *    nPr
 *   -----
 *   x1!x2!...
 * n: total number of objects to select from
 * r: number of objects being selected
 * xi: number of duplicates for each item being selected
 * If A is team A's score and B is team's B score then we would be doing
 * (A+B) P (A+B) = (A + B)!
 * -------------------------
 *          A! * B!
 * But that over counts some solutions because we cannot have
 * the loosing team score after the game is over.
 * https://www.ck12.org/book/CK-12-Basic-Probability-and-Statistics-Concepts-A-Full-Course/section/2.4/
 * https://www.hackerrank.com/contests/w1/challenges/volleyball-match/problem
 * 50 points
 */
public class VolleyBallMatch {
  public static boolean debugMode = false;

  private static final long MOD = 1000000000L;

  /**
   * Lazy solution to computing (A + B)! / A!B!
   * The idea is that you can take the max of the two denominators and then divide him out.
   * Resulting in (A+B)(A+B-1)...(A+1)/B!@
   * @param teamAScore A in the above formula
   * @param teamBScore B in the above formula
   * @return (A + B)! / A!B!
   */
  public static long computeLazyPermutationWithRepetition(long teamAScore, long teamBScore) {

    if (teamAScore == 0 || teamBScore == 0) {
      return 1;
    }

    long maxScore = teamAScore;
    long minScore = teamBScore;

    if (teamBScore > teamAScore) {
      maxScore = teamBScore;
      minScore = teamAScore;
    }

    long totalScore = teamAScore + teamBScore;
    long result = totalScore;
    result %= MOD;

    for (long i = totalScore - 1; i > maxScore; i--) {
      result *= i;
      result %= MOD;
    }

    for (long d = 2; d <= minScore; d++) {
      result /= d;
      result %= MOD;
    }

    return result;
  }

  /**
   * Count the number of scores that would be considered to be non-final and needed to be removed.
   * @param teamAScore Team A's Score
   * @param teamBScore Team B's Score
   * @return The number of non-final scores
   */
  private static long countNonFinalScores(long teamAScore, long teamBScore) {
    long maxScore = teamAScore;
    long minScore = teamBScore;
    if (teamBScore > teamAScore) {
      maxScore = teamBScore;
      minScore = teamAScore;
    }
    long result = 0;
    for (long i = 0; i < minScore; i++) {
      result += computeLazyPermutationWithRepetition(maxScore - 1, i);
      result %= MOD;
    }
    return result;
  }

  /**
   * Returns the count of final sequences which is the total minus the non-final ones.
   * @param teamAScore Team A's Score
   * @param teamBScore Team B's Score
   * @return The final sequence
   */
  private static long countFinalSequences(long teamAScore, long teamBScore) {
    long numberOfSequences = 0;

    // Check if either score is too low.
    if (teamAScore < 25 && teamBScore < 25) {
      return numberOfSequences;
    }

    // check if the gap is too small or too big
    long absScoreDifference = Math.abs(teamAScore - teamBScore);
    if ((teamAScore > 25 || teamBScore > 25) && (absScoreDifference != 2)) {
      return numberOfSequences;
    }

    // First we should compute the total
    long totalNumberOfSequences = computeLazyPermutationWithRepetition(teamAScore, teamBScore);
    if (debugMode) {
      System.out.println("Total Number Of Sequences: " + totalNumberOfSequences);
    }
    // Next we need to subtract the impossible loosing scores
    long countNonFinalScores = countNonFinalScores(teamAScore, teamBScore);
    if (debugMode) {
      System.out.println("Total Non-Final Scores: " + countNonFinalScores);
    }
    totalNumberOfSequences -= countNonFinalScores;
    return totalNumberOfSequences;
  }

  /**
   * Public API for reading in the numbers and testing the problem solution.
   * @return The solution
   */
  public static long solve() {
    Scanner in = new Scanner(System.in);
    long teamAScores = in.nextLong();
    long teamBScroes = in.nextLong();
    if (debugMode) {
      System.out.println("Team A: " + teamAScores + " Team B: " + teamBScroes);
    }
    return countFinalSequences(teamAScores, teamBScroes);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
