package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class StringCompression {

  /**
   * Converts a word to a compressed form if it is smaller.
   *
   * @param word String to compress.
   * @return Compressed form aabccc -> a2b1c3.
   */
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
