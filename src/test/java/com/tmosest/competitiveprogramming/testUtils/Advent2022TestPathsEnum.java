package com.tmosest.competitiveprogramming.testUtils;

public enum Advent2022TestPathsEnum {
  DAY_5_SAMPLE("advent_2022_day5_sample.txt"),
  DAY_5("advent_2022_day5.txt");

  private String path;

  Advent2022TestPathsEnum(String path) {
    this.path = path;
  }

  public String getPath() {
    return this.path;
  }
}
