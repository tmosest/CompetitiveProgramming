package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LobbyLayout {

  int blackTileCount(List<String> input) {

    Map<String, Boolean> tiles = new HashMap<>();

    for (String line : input) {
      String cord = getTileFromDirections(line);
      boolean val = !tiles.getOrDefault(cord, false);
      tiles.put(cord, val);
    }

    return (int) tiles.values()
        .stream()
        .filter(bol -> bol)
        .count();
  }

  String getTileFromDirections(String line) {
    int[] pos = {0, 0}; // -1,1 -> -2,1 -> -3,1 -> -2 -> 1

    char[] letters = line.toCharArray();
    for (int index = 0; index < letters.length; index++) {
      char letter = letters[index];
      switch (letter) {
        case 's':
          pos[1]--;
          ++index;
          letter = letters[index];
          if (letter == 'e') {
            pos[0] += 1;
          } else {
            pos[0] -= 1;
          }
          break;
        case 'n':
          pos[1]++;
          ++index;
          letter = letters[index];
          if (letter == 'e') {
            pos[0] += 1;
          } else {
            pos[0] -= 1;
          }
          break;
        case 'e':
          pos[0] += 2;
          break;
        case 'w':
          pos[0] -= 2;
          break;
        default:
          throw new IllegalArgumentException("Invalid input " + letter);
      }
    }

    return pos[0] + "," + pos[1];
  }
}
