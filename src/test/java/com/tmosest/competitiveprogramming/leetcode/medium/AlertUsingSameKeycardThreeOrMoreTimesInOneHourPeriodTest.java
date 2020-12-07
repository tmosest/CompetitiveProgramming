package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc36")
@DisplayName("LeetCode: 1604. Alert Using Same Key-Card Three or More Times in a One Hour Period")
class AlertUsingSameKeycardThreeOrMoreTimesInOneHourPeriodTest {

  private AlertUsingSameKeycardThreeOrMoreTimesInOneHourPeriod alertUsingSameKeycardThreeOrMoreTimesInOneHourPeriod
      = new AlertUsingSameKeycardThreeOrMoreTimesInOneHourPeriod();

  @Test
  void test1() {
    Assertions.assertEquals(1, alertUsingSameKeycardThreeOrMoreTimesInOneHourPeriod.alertNames(
        new String[] {"daniel","daniel","daniel","luis","luis","luis","luis"},
        new String[] {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"}
    ).size());
  }
}
