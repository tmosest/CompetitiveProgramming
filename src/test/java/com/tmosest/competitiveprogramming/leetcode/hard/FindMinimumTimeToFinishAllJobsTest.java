package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("depthFirstSearch")
@Tag("wc223")
@DisplayName("LeetCode: 1723. Find Minimum Time to Finish All Jobs")
class FindMinimumTimeToFinishAllJobsTest {
    private FindMinimumTimeToFinishAllJobs findMinimumTimeToFinishAllJobs;

    @BeforeEach
    void setup() {
        findMinimumTimeToFinishAllJobs = new FindMinimumTimeToFinishAllJobs();
    }

    private void test(int output, int[] jobs, int k) {
        Assertions.assertEquals(output, findMinimumTimeToFinishAllJobs.minimumTimeRequired(jobs, k));
    }

    @Test
    void test0() {
        test(11, new int[] { 1, 2, 4, 7, 8 }, 2);
    }
}
