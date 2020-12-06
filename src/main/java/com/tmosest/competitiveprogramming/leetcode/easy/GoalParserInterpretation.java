package com.tmosest.competitiveprogramming.leetcode.easy;

class GoalParserInterpretation {

  String interpret(String command) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < command.length(); i++) {
      char letter = command.charAt(i);
      if ('G' == letter) {
        stringBuilder.append(letter);
      }
      if ('(' == letter) {
        if (command.charAt(i + 1) == ')') {
          stringBuilder.append('o');
          i++;
        } else {
          stringBuilder.append("al");
          i += 3;
        }
      }
    }

    return stringBuilder.toString();
  }
}
