package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.List;

class SeatingSystem {

  private static final char SEAT = 'L';
  private static final char OCCUPIED_SEAT = '#';

  static int THRESHOLD = 4;
  static int ADJACENT_DISTANCE = 1;

  private static int countLetter(String str, char letter) {
    return (int) str.chars()
        .map(character -> (char) character)
        .filter(character -> letter == character)
        .count();
  }

  int getOccupiedSeatsAfterSettles(List<String> lines) {
    SeatingState current = new SeatingState(lines);
    SeatingState next = current.getNextState();

    while (!current.equals(next)) {
      current = next;
      next = current.getNextState();
    }
    return next.getOccupiedSeats();
  }

  private static class SeatingState {

    private List<String> lines;
    private int rows;
    private int cols;

    private SeatingState(List<String> lines) {
      this.lines = new ArrayList<>(lines);
      rows = lines.size();
      cols = lines.get(0).length();
    }

    private int getOccupiedSeats() {
      return lines.stream()
          .mapToInt(line -> countLetter(line, OCCUPIED_SEAT))
          .reduce(Integer::sum)
          .orElse(0);
    }

    private SeatingState getNextState() {

      List<String> nextLines = new ArrayList<>();

      for (int i = 0; i < rows; i++) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < cols; j++) {
          char spot = getValue(i, j);
          int adjacentCount = getAdjacentCount(i, j);
          if (spot == SEAT && adjacentCount == 0) {
            stringBuilder.append(OCCUPIED_SEAT);
            continue;
          }
          if (spot == OCCUPIED_SEAT && adjacentCount >= THRESHOLD) {
            stringBuilder.append(SEAT);
            continue;
          }
          stringBuilder.append(spot);
        }
        nextLines.add(stringBuilder.toString());
      }

      return new SeatingState(nextLines);
    }

    private char getValue(int row, int col) {
      return lines.get(row).charAt(col);
    }

    private boolean isOccupied(int row, int col) {
      return OCCUPIED_SEAT == getValue(row, col);
    }

    private boolean isEmptySeat(int row, int col) {
      return SEAT == getValue(row, col);
    }

    // TODO refactor this bit.
    private int getAdjacentCount(int row, int col) {
      int count = 0;

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (row + diff >= rows || isEmptySeat(row + diff, col)) {
          break;
        }
        if (isOccupied(row + diff, col)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (col + diff >= cols || isEmptySeat(row, col + diff)) {
          break;
        }
        if (isOccupied(row, col + diff)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (row - diff < 0 || isEmptySeat(row - diff, col)) {
          break;
        }
        if (isOccupied(row - diff, col)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (col - diff < 0 || isEmptySeat(row, col - diff)) {
          break;
        }
        if (isOccupied(row, col - diff)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (row + diff >= rows || col + diff >= cols || isEmptySeat(row + diff, col + diff)) {
          break;
        }
        if (isOccupied(row + diff, col + diff)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (row - diff < 0 || col + diff >= cols || isEmptySeat(row - diff, col + diff)) {
          break;
        }
        if (isOccupied(row - diff, col + diff)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (row - diff < 0 || col - diff < 0 || isEmptySeat(row - diff, col - diff)) {
          break;
        }
        if (isOccupied(row - diff, col - diff)) {
          count++;
          break;
        }
      }

      for (int diff = 1; diff <= ADJACENT_DISTANCE; diff++) {
        if (row + diff >= rows || col - diff < 0 || isEmptySeat(row + diff, col - diff)) {
          break;
        }
        if (isOccupied(row + diff, col - diff)) {
          count++;
          break;
        }
      }

      return count;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == null || obj.getClass() != SeatingState.class) {
        return false;
      }
      return ((SeatingState) obj).getOccupiedSeats() == this.getOccupiedSeats();
    }
  }
}
