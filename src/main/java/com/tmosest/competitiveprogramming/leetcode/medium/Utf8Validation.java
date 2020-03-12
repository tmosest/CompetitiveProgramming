package com.tmosest.competitiveprogramming.leetcode.medium;

class Utf8Validation {

  boolean validUtf8(int[] data) {
    int index = 0;

    while (index < data.length) {

      // First we validate and check size of upcoming characted by setting next pointer.
      int next = data[index] >> 7 == 0
          ? (index + 1) : data[index] >> 3 == 0b11110
          ? (index + 4) : data[index] >> 4 == 0b1110
          ? (index + 3) : data[index] >> 5 == 0b110
          ? (index + 2) : 0;   // Set next=0 when none of mask valid.

      // If next pointer was not moved and next pointer out of array bound -> exit.
      if (next == 0 || next > data.length) {
        return false;
      }

      index++;

      // Make sure that all bytes before next pointer match the pattern.
      while (index < next) {
        if ((data[index++] >> 6) != 0b10) {
          return false;
        }
      }
    }

    return true;
  }
}
