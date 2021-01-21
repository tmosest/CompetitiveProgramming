package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.utils.string.StringUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class PassportProcessing {

  private Set<String> requiredKeys;
  private List<Passport> passports;
  private Map<String, Predicate<String>> validationRules;

  PassportProcessing(String[] requiredKeys, Map<String, Predicate<String>> validationRules) {
    this.requiredKeys = new HashSet<>();
    this.requiredKeys.addAll(Arrays.asList(requiredKeys));
    this.validationRules = validationRules;
  }

  long validPassport(List<String> inputs) {
    this.passports = StringUtil.fromLineSeperatedToSpaceSeperated(inputs).stream()
        .map(Passport::new).collect(
            Collectors.toList());

    return this.passports.stream()
        .filter(passport -> passport.isValid(requiredKeys, validationRules)).count();
  }

  private static class Passport {

    private String password;
    private Map<String, String> keyValues;

    private Passport(String password) {
      this.password = password.trim();
      this.keyValues = new HashMap<>();
      String[] spaces = password.split(" ");
      Arrays.stream(spaces).map(space -> space.trim().split(":")).forEach(arr -> {
        this.keyValues.put(arr[0], arr[1]);
      });
    }

    private boolean isValid(Set<String> requiredKeys,
        Map<String, Predicate<String>> validationRules) {

      if (!this.keyValues.keySet().containsAll(requiredKeys)) {
        return false;
      }

      for (Entry<String, Predicate<String>> validationRule : validationRules.entrySet()) {
        if (!validationRule.getValue()
            .test(this.keyValues.getOrDefault(validationRule.getKey(), ""))) {
          return false;
        }
      }

      return true;
    }
  }
}
