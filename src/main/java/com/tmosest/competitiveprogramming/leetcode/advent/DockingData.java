package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DockingData {

  private Map<String, String> memoryValues;

  long sumValuesInMemoryFromBitMap(List<String> lines) {
    memoryValues = new HashMap<>();
    BitMask currentMask = null;
    for (String line : lines) {
      String[] keyValue = line.split("=");
      String key = keyValue[0].trim();
      String value = keyValue[1].trim();
      switch (key) {
        case "mask":
          currentMask = new BitMask(value);
          break;
        default:
          memoryValues.put(key, currentMask.getMaskedNumber(Long.valueOf(value)));
      }
    }
    return memoryValues.values().stream()
        .map(DockingData::stringToLong)
        .reduce((one, two) -> one + two)
        .orElse(-1L);
  }

  private static long stringToLong(String numberString) {
    long value = 0;
    for (int i = numberString.length() - 1; i > -1; i--) {
      value += Math.pow(2, i) * (numberString.charAt(i) - '0');
    }
    return value;
  }

  private static String longToString(long number, int bits) {
    StringBuilder stringBuilder = new StringBuilder();
    while (number > 0) {
      stringBuilder.insert(0, number % 2);
      number /= 2;
    }
    while (stringBuilder.length() < bits) {
      stringBuilder.insert(0, "0");
    }
    while (stringBuilder.length() > bits) {
      stringBuilder.deleteCharAt(0);
    }
    return stringBuilder.toString();
  }

  private static class BitMask {
    private int bits;
    private String mask;

    private BitMask(String mask) {
      this.bits = mask.length();
      this.mask = mask;
    }

    private String getMaskedNumber(long number) {
      StringBuilder stringBuilder = new StringBuilder();
      String numberString = longToString(number, bits);
      for (int i = 0; i < bits; i++) {
        if (mask.charAt(i) != 'X') {
          stringBuilder.insert(0, mask.charAt(i));
          continue;
        }
        stringBuilder.insert(0, numberString.charAt(i));
      }
      return stringBuilder.toString();
    }
  }
}
