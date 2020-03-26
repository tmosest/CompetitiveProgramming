package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberOfClosedIslands {

  int closedIsland(int[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    List<List<List<Integer>>> components = new ArrayList<>();
    for (int r = 0; r < visited.length; r++) {
      for (int c = 0; c < visited[0].length; c++) {
        List<List<Integer>> component = new ArrayList<>();

        dfs(grid, visited, component, r, c);

        if (component.size() > 0) {
          components.add(component);
        }
      }
    }

    int res = 0;

    for (List<List<Integer>> component : components) {
      boolean surrounded = true;
      for (List<Integer> pos : component) {
        int row = pos.get(0);
        int col = pos.get(1);

        if (row == visited.length - 1 || col == visited[0].length - 1 || col == 0 || row == 0) {
          surrounded = false;
          break;
        }
      }

      if (surrounded) {
        ++res;
      }
    }

    return res;
  }

  void dfs(int[][] grid, boolean[][] visited, List<List<Integer>> component, int row, int col) {
    if (row >= visited.length || col >= visited[0].length || col < 0 || row < 0) {
      return;
    }
    if (visited[row][col]) {
      return;
    }
    if (grid[row][col] == 1) {
      return;
    }
    component.add(Arrays.asList(row, col));
    visited[row][col] = true;
    dfs(grid, visited, component, row, col + 1);
    dfs(grid, visited, component, row, col - 1);
    dfs(grid, visited, component, row + 1, col);
    dfs(grid, visited, component, row - 1, col);
  }
}
