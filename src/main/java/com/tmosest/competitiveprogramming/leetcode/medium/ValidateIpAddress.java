package com.tmosest.competitiveprogramming.leetcode.medium;

class ValidateIpAddress {

  static String validIpAddress(String ipAddress) {
    String[] ipv4 = ipAddress.split("\\.", -2);
    String[] ipv6 = ipAddress.split("\\:", -1);

    if (ipv4.length == 4) {
      for (String str : ipv4) {
        if (isIPv4(str)) {
          continue;
        } else {
          return "Neither";
        }
      }
      return "IPv4";
    }

    if (ipv6.length == 8) {
      for (String str : ipv6) {
        if (isIPv6(str)) {
          continue;
        } else {
          return "Neither";
        }
      }
      return "IPv6";
    }
    return "Neither";
  }

  private static boolean isIPv4(String str) {
    if (str.length() == 0 || str.length() > 3) {
      return false;
    }
    if (str.charAt(0) == '0' && str.length() != 1) {
      return false;
    }
    for (char ch : str.toCharArray()) {
      if (!Character.isDigit(ch)) {
        return false;
      }
    }
    try {
      return str.charAt(0) != '-' && Integer.parseInt(str) >= 0 && Integer.parseInt(str) <= 255;
    } catch (IllegalArgumentException e) {
      return false;
    }

  }

  private static boolean isIPv6(String str) {
    if (str.length() == 0 || str.length() > 4) {
      return false;
    }
    try {
      return Integer.parseInt(str, 16) >= 0 && str.charAt(0) != '-';
    } catch (IllegalArgumentException e) {
      return false;
    }
  }
}
