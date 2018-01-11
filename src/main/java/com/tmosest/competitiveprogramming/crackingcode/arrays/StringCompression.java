package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class StringCompression {

  public static String compresses(String word) {
    StringBuilder sb = new StringBuilder();
    int count = 1;
    char previousLetter = word.charAt(0);
    for (int i = 1; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (letter == previousLetter) {
        ++count;
      } else {
        sb.append(previousLetter);
        sb.append(count);
        count = 1;
        previousLetter = letter;
      }
    }
    sb.append(previousLetter);
    sb.append(count);
    String compressed = sb.toString();
    return (word.length() < compressed.length()) ? word : compressed;
  }
}
