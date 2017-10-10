package implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
  
  private static final boolean debugMode = false;

  public static int energyLeft(int[] clouds, int jumpSize) {
    int energy = 100;
    
    int i = (0 + jumpSize) % clouds.length;
    energy--;
    
    while(i != 0) {
      if(debugMode) {
        System.out.println("i: " + i + " energy: " + energy + " jumpSize");
      }
      energy--;
      if(clouds[i] == 1) energy -= 2;
      i = (i + jumpSize) % clouds.length;
    }
    
    if(clouds[0] == 1) energy -= 2;
    
    return energy;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int c[] = new int[n];
    for(int c_i=0; c_i < n; c_i++){
        c[c_i] = in.nextInt();
    }
    in.close();
    System.out.println(energyLeft(c, k));
  }
  
}
