package hackerrank.strings;

import java.util.Scanner;

public class WeightedUniformStrings {

  public static boolean debugMode = false;

  /**
   * These are strings consisting of a single character repeated.
   */
  public static void generateContiguousUniformSubstrings(String word) {
    int s = 0;
    char singleLetter = word.charAt(s);
    for (int i = 1; i <= word.length(); i++) {
      if(debugMode)
        System.out.println(word.substring(s, i));
      if (i < word.length()) {
        char letter = word.charAt(i);
        if (singleLetter != letter) {
          s = i;
          singleLetter = word.charAt(s);
        }
      }
    }
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    int tests = in.nextInt();
    String[] result = new String[tests];
    generateContiguousUniformSubstrings(word);
    in.close();
    return result;
  }

  public static void main(String[] args) {}

}
