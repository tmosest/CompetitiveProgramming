package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.List;

class CrabCups {

  String crabCupsConfigClockwiseFromOneCup(String input, int move) {
    CrabCupsState setupAfterMoves = configAfterMoves(input, move, 9);
    int index = (setupAfterMoves.board.indexOf(1) + 1) % setupAfterMoves.maxNumber;
    StringBuilder stringBuilder = new StringBuilder();
    while (stringBuilder.length() < setupAfterMoves.board.size() - 1) {
      stringBuilder.append(setupAfterMoves.board.get(index));
      index += 1;
      index %= input.length();
    }
    return stringBuilder.toString();
  }

  long multTwoCupsAfterCupMarkedOne(String input, int moves) {
    CrabCupsState setupAfterMoves = configAfterMoves(input, moves, 1000000);
    int firstIndex = (setupAfterMoves.board.indexOf(1) + 1) % setupAfterMoves.maxNumber;
    int secondIndex = (setupAfterMoves.board.indexOf(1) + 2) % setupAfterMoves.maxNumber;
    long first = (long) setupAfterMoves.board.get(firstIndex);
    long second = (long) setupAfterMoves.board.get(secondIndex);
    return first * second;
  }


  private CrabCupsState configAfterMoves(String input, int totalMoves, int max) {
    CrabCupsState state = CrabCupsState.fromString(input, max);
    while (state.moveNumber != totalMoves) {
      state = state.nextState();
    }
    return state;
  }

  private static class CrabCupsState {
    private List<Integer> board;
    private int maxNumber;
    private int moveNumber;
    private int currentIndex = 0;

    private CrabCupsState(List<Integer> board, int maxNumber, int moveNumber, int currentIndex) {
      this.board = new ArrayList<>(board);
      this.maxNumber = maxNumber;
      this.moveNumber = moveNumber;
      this.currentIndex = currentIndex;
    }

    private static CrabCupsState fromString(String fromString, int maxNumber) {
      List<Integer> board = new ArrayList<>();
      for (char letter: fromString.toCharArray()) {
        board.add(letter - '0');
      }
      if (board.size() != maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
          if (board.contains(i)) {
            continue;
          }
          board.add(i);
        }
      }
      return new CrabCupsState(board, maxNumber, 0, 0);
    }

    private CrabCupsState nextState() {

      List<Integer> nextThree = new ArrayList<>();
      for (int i = 1; i <= 3; i++) {
        int val = (currentIndex + i) % maxNumber;
        nextThree.add(board.get(val));
      }

      int destinationNumber = board.get(currentIndex) - 1;

      if (destinationNumber < 1) {
        destinationNumber = maxNumber;
      }

      while (nextThree.contains(destinationNumber)) {
        destinationNumber--;
        if (destinationNumber < 1) {
          destinationNumber = maxNumber;
        }
      }

      int destinationIndex = board.indexOf(destinationNumber);

      List<Integer> nextBoard = new ArrayList<>();
      int index = 0;

      for (; index <= destinationIndex; index++) {
        int val = board.get(index);
        if (nextThree.contains(val)) {
          continue;
        }
        nextBoard.add(val);
      }

      for (int num : nextThree) {
        nextBoard.add(num);
      }

      for (; index < maxNumber; index++) {
        int val = board.get(index);
        if (nextThree.contains(val)) {
          continue;
        }
        nextBoard.add(val);
      }

      if (nextBoard.size() != board.size()) {
        throw new IllegalStateException(
            String.format("Output doesn't match input length %s != %s",
                nextBoard.size(), board.size()));
      }

      return new CrabCupsState(
          nextBoard,
          maxNumber,
          moveNumber + 1,
          (nextBoard.indexOf(board.get(currentIndex)) + 1) % maxNumber
      );
    }
  }
}
