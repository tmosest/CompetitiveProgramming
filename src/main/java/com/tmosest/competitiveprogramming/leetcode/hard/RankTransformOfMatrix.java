package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class RankTransformOfMatrix {

  private int[] parent;

  int[][] matrixRankTransform(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] answer = new int[rows][cols];

    // GROUP BY MATRIX VAL -> {X,Y}
    TreeMap<Integer, List<int[]>> map = new TreeMap<>();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int[] xy = {i, j};
        int val = matrix[i][j];
        if (map.get(val) != null) {
          map.put(val, new ArrayList<>());
        }
        map.get(val).add(xy);
      }
    }

    // INITIALIZE MIN-RANK ARRAY FOR EVERY COL/ROW
    int[] minX = new int[rows];
    int[] minY = new int[cols];

    for (Integer key : map.keySet()) {
      List<int[]> list = map.get(key);

      // SPLIT TO GROUPS USING UNION FIND FOR VALs IN SAME COL/ROW
      int len = list.size();
      parent = new int[len];
      for (int i = 0; i < len; i++) {
        parent[i] = i;
      }

      // Group the xy by col and row then union by row & by col
      Map<Integer, List<Integer>> xmap = new HashMap<>();
      Map<Integer, List<Integer>> ymap = new HashMap<>();
      for (int i = 0; i < len; i++) {
        int[] xy = list.get(i);
        int row = xy[0];
        int col = xy[1];

        if (xmap.get(row) == null) {
          xmap.put(row, new ArrayList<>());
        }
        if (ymap.get(col) == null) {
          ymap.put(col, new ArrayList<>());
        }
        xmap.get(row).add(i);
        ymap.get(col).add(i);
      }

      // union by X
      for (Integer xkey : xmap.keySet()) {
        List<Integer> tempList = xmap.get(xkey);
        for (int i = 1; i < tempList.size(); i++) {
          union(tempList.get(i - 1), tempList.get(i));
        }
      }

      // union by Y
      for (Integer ykey : ymap.keySet()) {
        List<Integer> tempList = ymap.get(ykey);
        for (int i = 1; i < tempList.size(); i++) {
          union(tempList.get(i - 1), tempList.get(i));
        }
      }

      HashMap<Integer, List<int[]>> group = new HashMap<>();
      for (int i = 0; i < len; i++) {
        int grp = find(i);
        if (group.get(grp) == null) {
          group.put(grp, new ArrayList<>());
        }
        group.get(grp).add(list.get(i));
      }

      // SET ANSWER FOR EACH GROUP
      for (Integer grpKey : group.keySet()) {
        int max = 1;
        List<int[]> sublist = group.get(grpKey);

        // FIND MAX-RANK FOR THIS GROUP
        for (int[] xy : sublist) {
          int row = xy[0];
          int col = xy[1];

          max = Math.max(max, Math.max(minX[row], minY[col]));
        }

        // UPDATE ANSWER = MAX-RANK AND SET NEW MIN-RANK FOR ROW/COL = MAX-RANK+1
        for (int[] xy : sublist) {
          int row = xy[0];
          int col = xy[1];
          answer[row][col] = max;
          minX[row] = max + 1;
          minY[col] = max + 1;
        }
      }
    }
    return answer;
  }


  // UNION FIND IMPL
  void union(int one, int two) {
    int pa = find(one);
    int pb = find(two);
    parent[pb] = pa;
  }

  int find(int one) {
    int pa = parent[one];
    if (pa != one) {
      parent[one] = find(pa);
      return parent[one];
    } else {
      return one;
    }
  }
}
