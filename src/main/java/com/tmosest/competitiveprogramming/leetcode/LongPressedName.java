package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

class LongPressedName {

  /**
   * Determines if the typed string could be the name with letter held.
   * @param name The name we are checking for.
   * @param typed The typed string we are looking at.
   * @return True if the typed string could be the name.
   */
  boolean isLongPressedName(String name, String typed) {
    List<LetterGroup> nameGroup = convertToLetterGroup(name);
    List<LetterGroup> typedGroup = convertToLetterGroup(typed);
    if (nameGroup.size() != typedGroup.size()) {
      return false;
    }
    for (int i = 0; i < nameGroup.size(); i++) {
      if (nameGroup.get(i).letter != typedGroup.get(i).letter
          || nameGroup.get(i).count > typedGroup.get(i).count
          ) {
        return false;
      }
    }
    return true;
  }

  private List<LetterGroup> convertToLetterGroup(String word) {
    List<LetterGroup> result = new ArrayList<>();
    int count = 1;
    char prev = word.charAt(0);

    for (int i = 1; i < word.length(); i++) {
      char curr = word.charAt(i);
      if (curr != prev) {
        LetterGroup letterGroup = new LetterGroup(prev, count);
        result.add(letterGroup);
        count = 0;
        prev = curr;
      }
      ++count;
    }

    LetterGroup letterGroup = new LetterGroup(prev, count);
    result.add(letterGroup);

    return result;
  }

  private class LetterGroup {
    int count;
    char letter;

    LetterGroup(char letter, int count) {
      this.count = count;
      this.letter = letter;
    }
  }
}
