package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.StringUtil;

import java.util.List;

class CamelcaseMatching {
  /* Write code here. */

  /**
   * Determines if word matches the pattern.
   *
   * @param queries A query of words.
   * @param pattern The pattern they need to match.
   * @return A list of booleans that determine the result of the query.
   */
  public List<Boolean> camelMatch(String[] queries, String pattern) {
    return StringUtil.isCamelCaseMatches(queries, pattern);
  }


}
