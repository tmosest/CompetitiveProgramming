package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  public static boolean debugMode = false;

  private static class Triplet {
    int[] values;

    public Triplet(int first, int second, int third) {
      values = new int[3];
      values[0] = first;
      values[1] = second;
      values[2] = third;
      Arrays.sort(values);
    }

    public int hashCode() {
      return values[0] ^ values[1] ^ values[2];
    }

    public boolean equals(Object obj) {
      if (!(obj instanceof Triplet)) {
        return false;
      }
      Triplet other = (Triplet) obj;
      return values[0] == other.values[0]
          && values[1] == other.values[1]
          && values[2] == other.values[2];
    }

    public String toString() {
      return "a: " + values[0] + " b: " + values[1] + " c: " + values[2];
    }
  }

  private static boolean binarySearch(int[] numbers, int target, int first, int second) {
    int low = 0;
    int high = numbers.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int val = numbers[mid];
      if (val < target) {
        low = mid + 1;
      } else if (val > target) {
        high = mid - 1;
      } else {
        return mid != first && mid != second;
      }
    }

    return false;
  }

  /**
   * Function to compute the 3 sum solutions.
   * @param nums Array of integers.
   * @return A List of solutions.
   */
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new LinkedList<>();
    int length = nums.length;
    if (length < 3) {
      return  result;
    }
    Arrays.sort(nums);
    Set<Triplet> set = new HashSet<>();
    for (int i = 0; i < length - 1; i++) {
      for (int j = i + 1; j < length; j++) {
        int diff = -1 * (nums[j] + nums[i]);
        if (binarySearch(nums, diff, i, j)) {
          Triplet triplet = new Triplet(nums[i], nums[j], diff);
          if (debugMode) {
            System.out.println(triplet.toString());
          }
          if (!set.contains(triplet)) {
            if (debugMode) {
              System.out.println("adding: " + triplet.toString());
            }
            set.add(triplet);
            result.add(Arrays.asList(diff, nums[j], nums[i]));
          }
        }
      }
    }
    return result;
  }
}
