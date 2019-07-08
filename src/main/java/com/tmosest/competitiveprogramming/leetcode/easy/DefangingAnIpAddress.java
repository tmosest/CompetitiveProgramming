package com.tmosest.competitiveprogramming.leetcode.easy;

class DefangingAnIpAddress {

  /**
   * Defang an ip address.
   *
   * @param address The address.
   * @return The defangeed ip address.
   */
  String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
