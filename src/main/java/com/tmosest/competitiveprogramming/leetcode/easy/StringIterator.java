package com.tmosest.competitiveprogramming.leetcode.easy;

class StringIterator {

  /* Write code here. */
  private char letter;
  private int currentIndex = 0;
  private int currentCount = 0;
  private char[] letters;

  /**
   * Creates a compressed string iterator.
   *
   * @param compressedString The compressed string.
   */
  public StringIterator(String compressedString) {
    letters = compressedString.toCharArray();
    // find first letter and count
    setUpNextLetter();
  }

  private void setUpNextLetter() {
    if (currentIndex >= letters.length) {
      return;
    }
    letter = letters[currentIndex++];
    StringBuilder number = new StringBuilder();
    while (currentIndex < letters.length && Character.isDigit(letters[currentIndex])) {
      number.append(letters[currentIndex++]);
    }
    currentCount = Integer.valueOf(number.toString());
  }

  /**
   * Returns the next character or space.
   *
   * @return The next character or space.
   */
  public char next() {
    if (!hasNext()) {
      return ' ';
    }
    char result = letter;
    currentCount--;
    if (currentCount == 0) {
      setUpNextLetter();
    }
    return result;
  }

  /**
   * Returns true if there is another character.
   *
   * @return True if there is another character.
   */
  public boolean hasNext() {
    return currentCount > 0 || currentIndex < letters.length;
  }


}
