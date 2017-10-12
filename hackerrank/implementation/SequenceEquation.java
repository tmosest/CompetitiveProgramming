package hackerrank.implementation;

import java.util.Scanner;

public class SequenceEquation {
  
  private static final boolean debugMode = false;

  public static int findPofP(int[] sequence, int p) {
    int result = 0;
    for(int i = 0; i < sequence.length; i++) {
      if(debugMode) {
        System.out.println("i: " + " sequence[i] - 1: " + (sequence[i] - 1) 
            + " sequence[sequence[i]]: " 
            + sequence[sequence[i] - 1]);
      }
      if(sequence[sequence[i] - 1] == p) {
        result = i + 1;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] sequence = new int[n];
    for(int i = 0; i < n; i++) {
      sequence[i] = in.nextInt();
    }
    in.close();
    for(int i = 1; i <= n; i++) {
      System.out.println(findPofP(sequence, i));
    }
  }

}
