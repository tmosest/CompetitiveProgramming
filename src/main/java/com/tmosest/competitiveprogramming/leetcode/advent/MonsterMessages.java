package com.tmosest.competitiveprogramming.leetcode.advent;

import com.tmosest.competitiveprogramming.utils.string.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

class MonsterMessages {

  private Map<Integer, Rule> ruleMap;
  private List<String> strings;
  private Map<Integer, List<String>> cachedRuleMap;

  long numberOfStringMatchingRuleZero(List<String> input) {
    processInputs(input);
    createMatchingStrings(ruleMap.get(0));
    List<String> allowedStrings = cachedRuleMap.get(0);
    return strings.stream().filter(
        str -> allowedStrings.contains(str)
    ).count();
  }

  private List<String> createMatchingStrings(Rule rule) {
    if (cachedRuleMap.containsKey(rule.index)) {
      return cachedRuleMap.get(rule.index);
    }
    // Depth First Search
    List<String> results = new ArrayList<>();
    Stack<Rule> rulesStack = new Stack<>();
    rulesStack.push(rule);

    while (!rulesStack.empty()) {
      Rule currentRule = rulesStack.pop();
      // Get all of the | sub rules
      List<List<String>> orRules = currentRule.rules;
      // This means we have a terminating node.
      if (orRules.size() == 1 && orRules.get(0).size() == 1 && !StringUtil
          .isNumber(orRules.get(0).get(0))) {
        String str = orRules.get(0).get(0);
        results.add(str);
        List<String> cached = new ArrayList<>();
        cached.add(str);
        cachedRuleMap.put(currentRule.index, cached);
        return results;
      }
      // Now we need to go through each | rule
      // And use that to create its sub rules.
      for (List<String> subRuleList : orRules) {
        List<String> subListOfStrs = new ArrayList<>();
        for (String strRule : subRuleList) {
          Rule subRule = ruleMap.get(Integer.valueOf(strRule));
          List<String> subRuleStrings = createMatchingStrings(subRule);
          List<String> subListOfStrsNext = new ArrayList<>();
          if (subListOfStrs.isEmpty()) {
            subListOfStrs.addAll(subRuleStrings);
            continue;
          }
          for (String next : subRuleStrings) {
            for (String old : subListOfStrs) {
              subListOfStrsNext.add(old + next);
            }
          }
          subListOfStrs = subListOfStrsNext;
        }
        results.addAll(subListOfStrs);
      }
    }

    cachedRuleMap.put(rule.index, results);
    return results;
  }

  private void processInputs(List<String> input) {
    ruleMap = new HashMap<>();
    strings = new ArrayList<>();
    cachedRuleMap = new HashMap<>();

    boolean isRules = true;
    for (String line : input) {
      if (line.isEmpty()) {
        isRules = false;
        continue;
      }
      if (isRules) {
        Rule rule = Rule.fromString(line);
        ruleMap.put(rule.index, rule);
        continue;
      }
      strings.add(line);
    }
  }

  private static class Rule {

    private int index;
    private String rule;
    private List<List<String>> rules;

    private Rule(int index, String rule) {
      this.index = index;
      this.rule = rule;
      this.initRules();
    }

    static Rule fromString(String value) {
      String[] indexRule = value.split(":");
      return new Rule(Integer.valueOf(indexRule[0]), indexRule[1].trim().replace("\"", ""));
    }

    private void initRules() {
      rules = new ArrayList<>();
      String[] orRules = rule.split("\\|");
      for (String listStrOfRules : orRules) {
        rules.add(Arrays.stream(listStrOfRules.split(" "))
            .filter(str -> !str.isEmpty())
            .collect(Collectors.toList())
        );
      }
    }
  }
}
