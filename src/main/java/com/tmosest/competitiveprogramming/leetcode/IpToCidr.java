package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IpToCidr {

  /**
   * Convert IP to CIDR over a range.
   * @param ip The IP address.
   * @param size The size of the range.
   * @return List of IPs.
   */
  public List<String> ipToCidr(String ip, int size) {
    long start = ipToLong(ip);
    List<String> ans = new ArrayList<>();
    while (size > 0) {
      int mask = Math.max(
          33 - bitLength(Long.lowestOneBit(start)),
          33 - bitLength(size)
      );
      ans.add(longToIp(start) + "/" + mask);
      start += 1 << (32 - mask);
      size -= 1 << (32 - mask);
    }
    return ans;
  }

  private long ipToLong(String ip) {
    long ans = 0;
    for (String x: ip.split("\\.")) {
      ans = 256 * ans + Integer.valueOf(x);
    }
    return ans;
  }

  private String longToIp(long num) {
    return String.format("%s.%s.%s.%s",
        num >> 24, (num >> 16) % 256, (num >> 8) % 256, num % 256);
  }

  private int bitLength(long num) {
    if (num == 0) {
      return 1;
    }
    int ans = 0;
    while (num > 0) {
      num >>= 1;
      ans++;
    }
    return ans;
  }
}
