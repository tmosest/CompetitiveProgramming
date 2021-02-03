package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TicketTranslation {

  private List<Rule> rules;
  private List<Ticket> tickets;

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

  int multiplyDepartures(List<String> input) {
    return 0;
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

    private List<Integer> getInvalidNumbers(List<Rule> rules) {
      return numbers.stream()
          .filter(num -> rules.stream().filter(rule -> rule.isValidNumber(num)).count() == 0)
          .collect(Collectors.toList());
    }
  }

  private static class Rule {

    private String name;
    private List<Interval> intervals;

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
