package hackerrank.implementation;

import java.util.Scanner;

public class OrganizingContainersOfBalls {

  public static boolean debugMode = false;

  private static int n;
  private static int[] containers;
  private static int[] types;

  private static boolean canOrganizeBalls() {
    boolean result = true;
    for (int i = 0; i < n; i++) {
      int j = 0;
      for (j = i; j < n; j++) {
        if (debugMode) {
          System.out.println("Indexes " + i + " : " + j);
          System.out.println("Containers and Types " + containers[i] + " : " + types[j]);
        }
        if (containers[i] == types[j]) {
          int temp = types[j];
          types[j] = types[i];
          types[i] = temp;
          break;
        }
        if (debugMode) {
          System.out.println("Check for false " + j + " : " + n);
        }
        if (j == n - 1) {
          result = false;
          break;
        }
      }
    }
    return result;
  }

  private static void printAnswers(String[] answers) {
    for (int i = 0; i < answers.length; i++)
      System.out.println(answers[i]);
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    String[] answers = new String[tests];
    for (int t = 0; t < tests; t++) {
      n = in.nextInt();
      if (debugMode) {
        System.out.println("\nTest Case: " + t);
        System.out.println("Balls and Buckets Count: " + n );
      }
      containers = new int[n];
      types = new int[n];
      for (int i = 0; i < n ; i++) {
        for (int j = 0; j < n ; j++) {
          int input = in.nextInt();
          containers[i] += input;
          types[j] += input;
        }
      }
      answers[t] = (canOrganizeBalls()) ? "Possible" : "Impossible";
    }
    in.close();
    printAnswers(answers);
    return answers;
  }

  public static void main(String[] args) {
    solve();
  }
}
