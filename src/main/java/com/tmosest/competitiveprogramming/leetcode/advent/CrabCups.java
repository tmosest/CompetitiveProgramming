package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.List;

class CrabCups {

  String crabCupsConfigClockwiseFromOneCup(String input, int move) {
    String setupAfterMoves = configAfterMoves(input, move, 0);
    int index = (setupAfterMoves.indexOf("1") + 1) % input.length();
    StringBuilder stringBuilder = new StringBuilder();
    while (stringBuilder.length() < setupAfterMoves.length() - 1) {
      stringBuilder.append(setupAfterMoves.charAt(index));
      index += 1;
      index %= input.length();
    }
    return stringBuilder.toString();
  }


  private String configAfterMoves(String input, int movesLeft, int index) {

    index %= input.length();

    if (movesLeft < 1) {
      return input;
    }

    List<Integer> nextThree = new ArrayList<>();
    for (int i = 1; i <= 3; i++) {
      int val = (index + i) % input.length();
      nextThree.add(input.charAt(val) - '0');
    }

    int destinationNumber = input.charAt(index) - '0' - 1;

    if (destinationNumber < 1) {
      destinationNumber = 9;
    }

    while (nextThree.contains(destinationNumber)) {
      destinationNumber--;
      if (destinationNumber < 1) {
        destinationNumber = 9;
      }
    }

    int destinationIndex = input.indexOf("" + destinationNumber);

    StringBuilder stringBuilder = new StringBuilder();

    int nextIndex = 0;
    for (; nextIndex <= destinationIndex; nextIndex++) {
      if (nextThree.contains(input.charAt(nextIndex) - '0')) {
        continue;
      }
      stringBuilder.append(input.charAt(nextIndex));
    }

    for (int num : nextThree) {
      stringBuilder.append(num);
    }

    for (; nextIndex < input.length(); nextIndex++) {
      if (nextThree.contains(input.charAt(nextIndex) - '0')) {
        continue;
      }
      stringBuilder.append(input.charAt(nextIndex));
    }

    String nextInput = stringBuilder.toString();

    if (nextInput.length() != input.length()) {
      throw new IllegalStateException(
          String.format("Output doesn't match input length %s != %s", nextInput, input));
    }

    return configAfterMoves(
        nextInput,
        movesLeft - 1,
        nextInput.indexOf(input.charAt(index)) + 1
    );
  }
}
