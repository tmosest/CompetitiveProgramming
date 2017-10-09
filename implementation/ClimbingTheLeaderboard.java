package implementation;

import java.util.Scanner;

public class ClimbingTheLeaderboard {
  
  private static final boolean debugMode = false;

  public static int[] determineRanks(int[] scoreBoard, int[] scores) {
    int[] ranks = new int[scores.length];
    
    int i = 0;
    int rank = 1;
    int ScoreToBeat = scoreBoard[0];
    boolean isLoser = false;
    for(int s = scores.length - 1; s >= 0; s--) {
      
      int score = scores[s];
      for (; i < scoreBoard.length; i++) {
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
          System.out.println("absolute looser");
        isLoser = true;
      }
      if(debugMode) {
        System.out.println("final rank: " + rank);
      }
      ranks[s] = (isLoser) ? rank + 1 : rank;
    }
    
    return ranks;
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
