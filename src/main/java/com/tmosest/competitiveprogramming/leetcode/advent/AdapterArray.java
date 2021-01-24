package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AdapterArray {

  int getCellPhoneAdapterValue(List<Integer> numbers) {
    return new VoltageChain(numbers).phoneVoltage;
  }

  long getMultOfOneCellGapsAndThreeCellGaps(List<Integer> numbers) {
    VoltageChain voltageChain = new VoltageChain(numbers);
    return voltageChain.countNumberOfGapSize(1) * voltageChain.countNumberOfGapSize(3);
  }

  long getValidChainsCount(List<Integer> numbers) {
    return new VoltageChain(numbers).validChainCount;
  }

  private static class VoltageChain {

    private Map<Integer, Integer> adaptersMap;
    private List<Integer> exhaustiveChain;
    private int phoneVoltage;
    private int desiredChainLength;
    private long validChainCount;

    private VoltageChain(List<Integer> numbers) {
      validChainCount = 0;
      adaptersMap = new HashMap<>();
      for (int number : numbers) {
        int count = adaptersMap.getOrDefault(number, 0) + 1;
        adaptersMap.put(number, count);
      }
      phoneVoltage = numbers.stream().reduce(Math::max).orElse(0) + 3;
      desiredChainLength = numbers.size();
      countValidChains();
      setupVoltageChain(0, adaptersMap, new ArrayList<>());
    }

    private static boolean containsVoltage(Map<Integer, Integer> map, int val) {
      return map.getOrDefault(val, 0) > 0;
    }

    private void setupVoltageChain(int currentVoltage, Map<Integer, Integer> adaptersMap,
        List<Integer> chain) {

      if (chain.size() > desiredChainLength) {
        return;
      }

      if (chain.size() == desiredChainLength && isValidVoltageChain(currentVoltage, phoneVoltage)) {
        exhaustiveChain = new ArrayList<>(chain);
      }

      for (int diff = 1; diff <= 3; diff++) {
        int nextVoltage = currentVoltage + diff;
        if (containsVoltage(adaptersMap, nextVoltage) && !chain.contains(nextVoltage)) {
          List<Integer> diffChain = new ArrayList<>(chain);
          diffChain.add(nextVoltage);
          Map<Integer, Integer> diffMap = new HashMap<>(adaptersMap);
          diffMap.put(currentVoltage + diff, diffMap.get(nextVoltage) - 1);
          setupVoltageChain(nextVoltage, diffMap, diffChain);
          return;
        }
      }
    }

    private void countValidChains() {
      Map<Integer, Long> chainCounts = new HashMap<>();
      chainCounts.put(phoneVoltage, 0L);

      for (int volt = phoneVoltage - 1; volt >= 0; volt--) {
        if (containsVoltage(adaptersMap, volt) || volt == 0) {
          long count = 0;
          if (isValidVoltageChain(volt, phoneVoltage)) {
            count++;
          }
          for (int diff = 1; diff <= 3; diff++) {
            int nextVoltage = volt + diff;
            long nextCount = chainCounts.getOrDefault(nextVoltage, 0L);
            count += nextCount;
          }
          chainCounts.put(volt, count);
        }
      }

      validChainCount = chainCounts.getOrDefault(0, 0L);
    }

    private boolean isValidVoltageChain(int current, int next) {
      return next - 3 <= current && current <= next - 1;
    }

    private long countNumberOfGapSize(int gap) {
      if (exhaustiveChain == null) {
        return 0;
      }
      long count = 0;
      if (exhaustiveChain.get(0) == gap) {
        ++count;
      }
      if (phoneVoltage - exhaustiveChain.get(exhaustiveChain.size() - 1) == gap) {
        ++count;
      }
      for (int i = 0; i < exhaustiveChain.size() - 1; i++) {
        if (exhaustiveChain.get(i + 1) - exhaustiveChain.get(i) == gap) {
          ++count;
        }
      }
      return count;
    }
  }
}
