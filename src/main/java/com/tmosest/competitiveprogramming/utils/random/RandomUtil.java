package com.tmosest.competitiveprogramming.utils.random;

import java.util.List;
import java.util.Random;

public class RandomUtil {

  /**
   * Generate a random letter.
   * @param characters Characters to generate from.
   * @return A random letter.
   */
  public static Character generateRandomLetter(List<Character> characters) {
    return characters.get(RandomUtil.randInt(0, characters.size() - 1));
  }

  /**
   * Generate a random word.
   * @param characters The characters allowed in the word.
   * @param wordSize The size of the word.
   * @return A random word.
   */
  public static String generateRandomWord(List<Character> characters, int wordSize) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < wordSize; i++) {
      stringBuilder.append(generateRandomLetter(characters));
    }
    return stringBuilder.toString();
  }

  /**
   * Generate a random number between min and max.
   * @param min The min number.
   * @param max The max number.
   * @return A random number between min and max.
   */
  public static int randInt(int min, int max) {
    return new Random().nextInt(max - min + 1) + min;
  }

  public static boolean isHeads(double probability) {
    return new Random().nextDouble() <= probability;
  }
}
