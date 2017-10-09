package implementation;

import java.util.Scanner;

public class DesignerPdfViewer {

  public static int highligherArea(int[] letterHeights, String word) {
    int area = word.length();
    
    int maxHeight = 1;
    
    for(int i = 0; i < word.length(); i++) {
      int c = word.charAt(i) - 'a';
      maxHeight = (letterHeights[c] > maxHeight) ? letterHeights[c] : maxHeight; 
    }
    
    return area * maxHeight;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] h = new int[26];
    for(int h_i=0; h_i < 26; h_i++){
        h[h_i] = in.nextInt();
    }
    String word = in.next();
    in.close();
    System.out.println(highligherArea(h, word));
  }

}
