package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.LinkedList;
import java.util.List;

class CrabCombat {

  private LinkedList<Integer> playerOne;
  private LinkedList<Integer> playerTwo;

  long scoreCrabCombatGame(List<String> input) {
    fromInputs(input);

    while (!playerOne.isEmpty() && !playerTwo.isEmpty()) {
      int one = playerOne.poll();
      int two = playerTwo.poll();

      if (one == two) {
        playerOne.add(one);
        playerTwo.add(two);
        continue;
      }

      LinkedList<Integer> current = (one > two) ? playerOne : playerTwo;
      current.add(Math.max(one, two));
      current.add(Math.min(one, two));
    }

    long total = 0;
    LinkedList<Integer> winner = playerOne.isEmpty() ? playerTwo : playerOne;
    for (int i = 1; i <= winner.size(); i++) {
      total += i * winner.get(winner.size() - i);
    }
    return total;
  }

  private void fromInputs(List<String> inputs) {
    playerOne = new LinkedList<>();
    playerTwo = new LinkedList<>();

    LinkedList<Integer> current = playerOne;
    for (String input : inputs) {
      if (input.contains("Player")) {
        continue;
      }
      if (input.isEmpty()) {
        current = playerTwo;
        continue;
      }
      current.add(Integer.valueOf(input));
    }
  }
}
