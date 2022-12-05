package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SupplyStacks {

  private Pattern pattern = Pattern.compile("\\d+");
  private List<List<Character>> stacks;

  public String getStackTop(List<String> data, boolean isStackable) {
    stacks = new ArrayList<>();

    int index = 0;

    while (data.get(index).trim().length() > 0) {
      String line = data.get(index++);
      // Use the initial letter offset plus the fact that they are wrapped in [] or three blank spaces.
      for (int i = 1 ; i < line.length(); i += 4) {
        if (i / 4 >= stacks.size()) {
          stacks.add(new ArrayList<>());
        }

        char letter = line.charAt(i);
        if (Character.isLetter(letter)) {
          stacks.get(i / 4).add(letter);
        }
      }
    }

    index++;

    for (; index < data.size(); index++) {
      List<Integer> inputs = new ArrayList<>();

      Matcher m = pattern.matcher(data.get(index));

      while(m.find()) {
        inputs.add(Integer.parseInt(m.group()));
      }

      List<Character> from = stacks.get(inputs.get(1) - 1);
      List<Character> to = stacks.get(inputs.get(2) - 1);

      List<Character> temp = new ArrayList<>();

      for (int i = 0; i < inputs.get(0); i++) {
        char letter = from.get(0);
        temp.add(0, letter);
        from.remove(0);
      }

      for (int i = 0; i < temp.size(); i++) {
        int tempIndex = isStackable ? i : temp.size() - i - 1;
        to.add(0, temp.get(tempIndex));
      }
    }

    StringBuilder stringBuilder = new StringBuilder();

    for (List<Character> line : stacks) {
      if (line.size() < 1) {
        stringBuilder.append("");
        continue;
      }
      stringBuilder.append(line.get(0));
    }

    return stringBuilder.toString();
  }
}
