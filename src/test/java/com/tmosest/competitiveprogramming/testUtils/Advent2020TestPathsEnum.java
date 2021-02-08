package com.tmosest.competitiveprogramming.testUtils;

public enum Advent2020TestPathsEnum {
  DAY_1("advent_2020_day1.txt"),
  DAY_2("advent_2020_day2.txt"),
  DAY_2_SAMPLE("advent_2020_day2_sample.txt"),
  DAY_3("advent_2020_day3.txt"),
  DAY_3_SAMPLE("advent_2020_day3_sample.txt"),
  DAY_4("advent_2020_day4.txt"),
  DAY_4_SAMPLE("advent_2020_day4_sample.txt"),
  DAY_5("advent_2020_day5.txt"),
  DAY_5_SAMPLE("advent_2020_day5_sample.txt"),
  DAY_6("advent_2020_day6.txt"),
  DAY_6_SAMPLE("advent_2020_day6_sample.txt"),
  DAY_7("advent_2020_day7.txt"),
  DAY_7_SAMPLE("advent_2020_day7_sample.txt"),
  DAY_8("advent_2020_day8.txt"),
  DAY_8_SAMPLE("advent_2020_day8_sample.txt"),
  DAY_9("advent_2020_day9.txt"),
  DAY_9_SAMPLE("advent_2020_day9_sample.txt"),
  DAY_10("advent_2020_day10.txt"),
  DAY_10_SAMPLE("advent_2020_day10_sample.txt"),
  DAY_10_SAMPLE_SMALL("advent_2020_day10_sample_small.txt"),
  DAY_11("advent_2020_day11.txt"),
  DAY_11_SAMPLE("advent_2020_day11_sample.txt"),
  DAY_12("advent_2020_day12.txt"),
  DAY_12_SAMPLE("advent_2020_day12_sample.txt"),
  DAY_13("advent_2020_day13.txt"),
  DAY_13_SAMPLE("advent_2020_day13_sample.txt"),
  DAY_14("advent_2020_day14.txt"),
  DAY_14_SAMPLE("advent_2020_day14_sample.txt"),
  DAY_16("advent_2020_day16.txt"),
  DAY_16_SAMPLE("advent_2020_day16_sample.txt"),
  DAY_17("advent_2020_day17.txt"),
  DAY_17_SAMPLE("advent_2020_day17_sample.txt");

  private String path;

  Advent2020TestPathsEnum(String path) {
    this.path = path;
  }

  public String getPath() {
    return this.path;
  }
}
