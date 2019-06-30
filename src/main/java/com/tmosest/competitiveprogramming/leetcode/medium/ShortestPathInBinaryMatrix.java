package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class ShortestPathInBinaryMatrix {

  /**
   * Determine the shortest path from (0,0) to (n - 1, n - 1).
   *
   * @param grid The grid we are looping throug.
   * @return The minimum number of moves.
   */
  int shortestPathBinaryMatrix(int[][] grid) {
    if (grid[0][0] == 1) {
      return -1;
    }

    Set<Cell> visited = new HashSet<>();
    Queue<Cell> queue = new LinkedList<>();
    queue.add(new Cell(0, 0, 0));

    while (!queue.isEmpty()) {
      Cell cell = queue.poll();

      if (visited.contains(cell)
          || cell.row < 0
          || cell.row >= grid.length
          || cell.col < 0
          || cell.col >= grid[0].length
          || grid[cell.row][cell.col] == 1) {
        continue;
      }

      if (cell.row == grid.length - 1 && cell.col == grid[0].length - 1) {
        return cell.move + 1;
      }

      visited.add(cell);

      int move = cell.move + 1;
      queue.add(new Cell(cell.row - 1, cell.col, move));
      queue.add(new Cell(cell.row + 1, cell.col, move));
      queue.add(new Cell(cell.row, cell.col - 1, move));
      queue.add(new Cell(cell.row, cell.col + 1, move));
      queue.add(new Cell(cell.row - 1, cell.col - 1, move));
      queue.add(new Cell(cell.row - 1, cell.col + 1, move));
      queue.add(new Cell(cell.row + 1, cell.col - 1, move));
      queue.add(new Cell(cell.row + 1, cell.col + 1, move));
    }
    return -1;
  }

  private class Cell {

    int row;
    int col;
    int move;

    private Cell(int row, int col, int move) {
      this.row = row;
      this.col = col;
      this.move = move;
    }

    @Override
    public int hashCode() {
      return 5;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      }

      if (!(obj instanceof Cell)) {
        return false;
      }

      Cell other = (Cell) obj;
      return this.row == other.row && this.col == other.col;
    }
  }
}
