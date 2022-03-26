package com.tmosest.competitiveprogramming.testUtils;

public enum Advent2021TestPathsEnum {
  DAY_1_SAMPLE("advent_2021_day1_sample.txt"),
  DAY_1("advent_2021_day1.txt"),
  DAY_2_SAMPLE("advent_2021_day2_sample.txt"),
  DAY_2("advent_2021_day2.txt");

  private String path;

  Advent2021TestPathsEnum(String path) {
    this.path = path;
  }

  public String getPath() {
    return this.path;
  }
}
