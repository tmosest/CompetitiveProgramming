package com.tmosest.competitiveprogramming.leetcode;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LemonadeChange {

  /**
   * Determine if we can serve all customers.
   * @param bills The customers bills.
   * @return True if we will have change for everyone.
   */
  public boolean lemonadeChange(int[] bills) {
    int lemonnadeCost = 5;
    Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
    for (int bill : bills) {
      int change = bill - lemonnadeCost;
      if (!makeChange(map, bill, change)) {
        return false;
      }
    }
    return true;
  }

  private boolean makeChange(Map<Integer, Integer> bills, int bill, int change) {
    // If we don't owe change.
    if (change < 1) {
      Integer billCount = bills.get(bill);
      billCount = (billCount == null) ? 1 : billCount + 1;
      bills.put(bill, billCount);
      return true;
    }
    // If we have the bill
    Integer changeCount = bills.get(change);
    if (changeCount != null && changeCount > 0) {
      Integer billCount = bills.get(bill);
      billCount = (billCount == null) ? 1 : billCount + 1;
      bills.put(bill, billCount);
      bills.put(change, changeCount - 1);
      return true;
    }
    // Can we make change from multiple bills
    for (int changeDenomination : bills.keySet()) {
      if (changeDenomination <= change) {
        int changeUsed = 1;
        Integer changeDenominationCount = bills.get(changeDenomination);
        for (; changeUsed <= changeDenominationCount; changeUsed++) {
          change -= changeDenomination;
          bills.put(changeDenomination, changeDenominationCount - changeUsed);
          if (change == 0) {
            Integer billCount = bills.get(bill);
            billCount = (billCount == null) ? 1 : billCount + 1;
            bills.put(bill, billCount);
            return true;
          }
          if (changeDenomination > change) {
            break;
          }
        }
      }
    }
    return false;
  }
}
