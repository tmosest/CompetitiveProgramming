package implementation;

import java.util.Scanner;

public class ClimbingTheLeaderboard {
  
  private static final boolean debugMode = false;
  
  public static int determineRank(int[] scoreBoard, int score) {
    int rank = 1;
    int ScoreToBeat = scoreBoard[0];
    
    for (int i = 0; i < scoreBoard.length; i++) {
      if(debugMode) {
        System.out.println("ScoreToBeat: " + ScoreToBeat + " score: " + score);
      }
      if (score >= ScoreToBeat) {
        break;
      } else if (ScoreToBeat != scoreBoard[i]) {
        ++rank;
        ScoreToBeat = scoreBoard[i];
      }
      if(debugMode) {
        System.out.println("rank: " + rank);
      }
    }
    if(score < scoreBoard[scoreBoard.length - 1]) {
      if(debugMode) 
        System.out.println("absolute looser: " + rank);
      ++rank;
    }
    if(debugMode) {
      System.out.println("final rank: " + rank);
    }
    return rank;
  }

  public static int[] determineRanks(int[] scoreBoard, int[] scores) {
    for(int i = 0; i < scores.length; i++) {
      scores[i] = determineRank(scoreBoard, scores[i]);
    }
    return scores;
  }
  
  public static void printRanks(int[] ranks) {
    for (int i = 0; i < ranks.length; i++) {
      System.out.println(ranks[i]);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] scores = new int[n];
    for (int scores_i = 0; scores_i < n; scores_i++) {
      scores[scores_i] = in.nextInt();
    }
    int m = in.nextInt();
    int[] alice = new int[m];
    for (int alice_i = 0; alice_i < m; alice_i++) {
      alice[alice_i] = in.nextInt();
    }
    in.close();
    alice = determineRanks(scores, alice);
    printRanks(alice);
  }

}
