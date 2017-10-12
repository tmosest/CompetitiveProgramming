package hackerrank.implementation;

import java.util.Scanner;

public class UtopianTree {

  public static int treeHeight(int cycles) {
    int height = 1;
    
    for(int i = 1; i <= cycles; i++) {
      if(i % 2 == 1) 
        height *= 2;
      else
        height += 1;
    }
    
    return height;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        System.out.println(treeHeight(n));
    }
    in.close();
  }
  
}
