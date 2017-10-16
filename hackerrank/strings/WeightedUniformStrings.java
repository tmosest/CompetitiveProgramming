package hackerrank.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings {

  public static boolean debugMode = false;

  private static Set<Integer> weights = new HashSet<Integer>();

  public static void calculateWeightAndAddToHash(String word) {
    int weight = 0;
    for(int i = 0; i < word.length(); i++) {
      weight += (word.charAt(i) - 'a' + 1);
    }
    weights.add(weight);
  }

  /**
   * These are strings consisting of a single character repeated.
   */
  public static void generateContiguousUniformSubstrings(String word) {
    int s = 0;
    char singleLetter = word.charAt(s);
    for (int i = 1; i <= word.length(); i++) {
      if (debugMode)
        System.out.println(word.substring(s, i));
      calculateWeightAndAddToHash(word.substring(s, i));
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
    for(int i = 0; i < tests; i++) {
      result[i] = (weights.contains(in.nextInt())) ? "Yes" : "No";
      System.out.println(result[i]);
    }
    in.close();
    return result;
  }

  public static void main(String[] args) {
    solve();
  }

}
