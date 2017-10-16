package hackerrank.implementation;

import java.util.Scanner;

public class OrganizingContainersOfBalls {

  public static boolean debugMode = false;

  private static boolean canOrganizeBalls(long[] balls) {
    boolean canSwapEven = true;
    long toCheck = balls[0];
    for (int b = 0; b < balls.length; b++) {
      if (debugMode) {
        System.out.println("Ball Count " + b + " : " + balls[b]);
      }
      if (balls[b] != toCheck) {
        canSwapEven = false;
        // break;
      }
    }
    return canSwapEven;
  }

  private static void printAnswers(String[] answers) {
    for (int i = 0; i < answers.length; i++)
      System.out.println(answers[i]);
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    String[] answers = new String[tests];
    for (int i = 0; i < tests; i++) {
      int bucketsAndBalls = in.nextInt();
      if (debugMode) {
        System.out.println("\nTest Case: " + i);
        System.out.println("Balls and Buckets Count: " + bucketsAndBalls);
      }
      long[] balls = new long[bucketsAndBalls];
      for (int n = 0; n < bucketsAndBalls * bucketsAndBalls; n++) {
        balls[n % bucketsAndBalls] += in.nextInt();
      }
      answers[i] = (canOrganizeBalls(balls)) ? "Possible" : "Impossible";
    }
    in.close();
    printAnswers(answers);
    return answers;
  }

  public static void main(String[] args) {
    solve();
  }
}
