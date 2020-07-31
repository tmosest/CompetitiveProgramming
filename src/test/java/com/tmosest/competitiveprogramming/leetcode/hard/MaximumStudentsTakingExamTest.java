package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("matrix")
@Tag("wc175")
@Tag("dynamic")
@DisplayName("LeetCode: 1349. Maximum Students Taking Exam")
class MaximumStudentsTakingExamTest {

  private MaximumStudentsTakingExam maximumStudentsTakingExam = new MaximumStudentsTakingExam();

  @Test
  void test0() {
    Assertions.assertEquals(4, maximumStudentsTakingExam.maxStudents(new char[][]{
        {'#', '.', '#', '#', '.', '#'},
        {'.', '#', '#', '#', '#', '.'},
        {'#', '.', '#', '#', '.', '#'}
    }));
  }
}
