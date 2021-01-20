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
  DAY_5_SAMPLE("advent_2020_day5_sample.txt");

  private String path;

  Advent2020TestPathsEnum(String path) {
    this.path = path;
  }

  public String getPath() {
    return this.path;
  }
}
