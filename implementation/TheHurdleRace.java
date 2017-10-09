package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

  public static int countBeanNeeded(int jumpHeight, int[] fenceHeigths) {
    int beans = 0;
    Arrays.sort(fenceHeigths);
    int tallest = fenceHeigths[fenceHeigths.length - 1];
    beans = (jumpHeight < tallest) ? tallest - jumpHeight : 0;
    return beans;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int jump = in.nextInt();
    int[] heights = new int[n];
    for (int h = 0; h < n; h++) {
      heights[h] = in.nextInt();
    }
    in.close();
    System.out.println(countBeanNeeded(jump, heights));
  }

}
