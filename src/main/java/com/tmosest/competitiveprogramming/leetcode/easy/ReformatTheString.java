package com.tmosest.competitiveprogramming.leetcode.easy;

class ReformatTheString {

  private int letterPointer;
  private int digitPointer;

  String reformat(String str) {
    int digitCount = (int) str.chars()
        .mapToObj(c -> (char) c)
        .filter(Character::isDigit)
        .count();

    int letterCount = (int) str.chars()
        .mapToObj(c -> (char) c)
        .filter(Character::isAlphabetic)
        .count();

    if (Math.abs(digitCount - letterCount) > 1) {
      return "";
    }

    StringBuilder stringBuilder = new StringBuilder();

    letterPointer = 0;
    digitPointer = 0;
    boolean shouldGetDigit = digitCount >= letterCount;

    for (int i = 0; i < str.length(); i++) {
      stringBuilder
          .append(getNext(str, shouldGetDigit));
      shouldGetDigit = !shouldGetDigit;
    }

    return stringBuilder.toString();
  }

  private char getNext(String str, boolean isDigit) {
    for (int index = (isDigit) ? digitPointer : letterPointer; index < str.length(); index++) {
      char letter = str.charAt(index);
      if (isDigit && Character.isDigit(letter)) {
        digitPointer = index + 1;
        return letter;
      } else if (!isDigit && Character.isAlphabetic(letter)) {
        letterPointer = index + 1;
        return letter;
      }
    }
    return Character.MIN_VALUE;
  }
}
