package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class TicketTranslation {

  private List<Rule> rules;
  private List<Ticket> tickets;
  private Ticket myTicket;

  TicketTranslation() {
    rules = new ArrayList<>();
    tickets = new ArrayList<>();
  }

  private void readInRules(List<String> inputs) {
    for (String line : inputs) {
      if (line.trim().length() == 0) {
        break;
      }
      rules.add(Rule.fromString(line));
    }
  }

  private void readInOtherTickets(List<String> inputs) {
    boolean foundTickets = false;
    for (String line : inputs) {
      if (line.contains("nearby tickets:")) {
        foundTickets = true;
        continue;
      }
      if (!foundTickets) {
        continue;
      }
      tickets.add(new Ticket(line));
    }
  }

  private void readInMyTicket(List<String> inputs) {
    boolean foundTickets = false;
    for (String line : inputs) {
      if (line.contains("your ticket:")) {
        foundTickets = true;
        continue;
      }
      if (!foundTickets) {
        continue;
      }
      myTicket = new Ticket(line);
      break;
    }
  }

  int getErrorRate(List<String> input) {
    readInRules(input);
    readInOtherTickets(input);
    return tickets.stream()
        .map(ticket -> ticket.getInvalidNumbers(rules))
        .filter(list -> list.size() > 0)
        .map(list -> list.stream().reduce(Integer::sum).orElse(0))
        .reduce(Integer::sum)
        .orElse(-1);
  }

  long multiplyDepartures(List<String> input) {
    readInRules(input);
    readInOtherTickets(input);
    readInMyTicket(input);

    List<Ticket> validTickets = tickets.stream()
        .filter(ticket -> ticket.isValid(rules))
        .collect(Collectors.toList());

    validTickets.add(myTicket);

    Map<Integer, Rule> ruleMap = new HashMap<>();

    for (Rule rule : rules) {
      rule.calculateIndex(validTickets);
    }

    Collections.sort(rules, Comparator.comparingInt(rule -> rule.indexes.size()));

    for (int i = 0; i < rules.size(); i++) {
      Rule rule = rules.get(i);
      for (int j = i + 1; j < rules.size(); j++) {
        Rule nextRule = rules.get(j);
        nextRule.indexes.removeAll(rule.indexes);
      }
    }

    for (Rule rule : rules) {
      ruleMap.put(rule.indexes.get(0), rule);
    }

    long res = -1;

    for (int i = 0; i < myTicket.getNumbers().size(); i++) {
      Rule rule = ruleMap.get(i);
      if (rule != null && rule.name.contains("departure")) {
        if (res == -1) {
          res = 1;
        }
        res *= myTicket.getNumbers().get(i);
      }
    }

    return res;
  }

  private static class Ticket {

    private String orignalTicket;
    private List<Integer> numbers;

    private Ticket(String original) {
      orignalTicket = original;
      numbers = Arrays.stream(original.split(","))
          .map(Integer::valueOf)
          .collect(Collectors.toList());
    }

    public List<Integer> getNumbers() {
      return numbers;
    }

    private List<Integer> getInvalidNumbers(List<Rule> rules) {
      return numbers.stream()
          .filter(num -> rules.stream().filter(rule -> rule.isValidNumber(num)).count() == 0)
          .collect(Collectors.toList());
    }

    private boolean isValid(List<Rule> rules) {
      return getInvalidNumbers(rules).size() == 0;
    }
  }

  private static class Rule {

    private String name;
    private List<Interval> intervals;
    private List<Integer> indexes;

    private Rule(String name) {
      this.name = name;
      this.intervals = new ArrayList<>();
    }

    private static Rule fromString(String str) {
      String[] nameIntervalPair = str.trim().split(":");
      Rule rule = new Rule(nameIntervalPair[0].trim());
      List<Interval> intervals = Arrays.stream(nameIntervalPair[1].split("or"))
          .map(Interval::fromString)
          .collect(Collectors.toList());
      rule.intervals.addAll(intervals);
      return rule;
    }

    private boolean isValidNumber(int number) {
      return intervals.stream()
          .filter(interval -> interval.isInInterval(number))
          .count() > 0;
    }

    private void calculateIndex(List<Ticket> tickets) {
      indexes = new ArrayList<>();
      int size = tickets.get(0).getNumbers().size();
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < tickets.size(); j++) {
          int num = tickets.get(j).getNumbers().get(i);
          if (!isValidNumber(num)) {
            break;
          }
          if (j == tickets.size() - 1) {
            indexes.add(i);
          }
        }
      }
    }
  }

  private static class Interval {

    private int start;
    private int end;

    private Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }

    private static Interval fromString(String str) {
      String[] values = str.trim().split("-");
      return new Interval(Integer.valueOf(values[0]), Integer.valueOf(values[1]));
    }

    private boolean isInInterval(int value) {
      return this.start <= value && value <= this.end;
    }
  }
}
