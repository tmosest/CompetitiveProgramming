package com.tmosest.competitiveprogramming.leetcode.easy;

class ValidWordAbbreviation {
  /* Write code here. */

  private boolean debugMode = false;

  /**
   * Function to determine if a string if a valid abbreviation or not.
   *
   * @param word The word.
   * @param abbr The abbreviation.
   * @return True if it is a valid abbreviation.
   */
  public boolean validWordAbbreviation(String word, String abbr) {
    if (word == null && abbr == null) {
      return true;
    }

    if (word == null || abbr == null || (abbr.isEmpty() && !word.isEmpty())) {
      return false;
    }

    char[] wordArray = word.toCharArray();
    char[] abbrArray = abbr.toCharArray();
    int wordIndex = 0;
    int abbrIndex = 0;
    int loopTimes;

    while (abbrIndex < abbrArray.length) {
      char abbrLetter = abbrArray[abbrIndex];
      if (debugMode) {
        System.out.println("abbrLetter: " + abbrLetter);
      }
      if (Character.isDigit(abbrLetter)) {
        loopTimes = 0;
        if (loopTimes == 0 && abbrLetter == '0') {
          return false;
        }
        loopTimes += (abbrLetter - '0');
        if (abbrIndex + 1 < abbrArray.length) {
          abbrLetter = abbrArray[++abbrIndex];
          while (Character.isDigit(abbrLetter)) {
            loopTimes *= 10;
            loopTimes += (abbrLetter - '0');
            if (abbrIndex + 1 < abbrArray.length) {
              abbrLetter = abbrArray[++abbrIndex];
            } else {
              abbrLetter = 'a';
            }
            if (debugMode) {
              System.out.println("loopTimes: " + loopTimes);
            }
          }
        } else {
          abbrIndex++;
        }
        wordIndex += loopTimes;
      } else {
        if (debugMode) {
          System.out.println("wordIndex: " + wordIndex);
          System.out.println("wordArray[wordIndex]: " + wordArray[wordIndex]);
        }
        if (wordIndex >= wordArray.length || abbrLetter != wordArray[wordIndex]) {
          return false;
        }
        ++wordIndex;
        ++abbrIndex;
      }
    }

    if (wordIndex != wordArray.length) {
      return false;
    }

    return true;
  }


}
