package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.tmosest.competitiveprogramming.leetcode.common.ListUtil;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("string")
@Tag("sort")
@Tag("map")
@Tag("wc371")
@DisplayName("LeetCode: 2933. High-Access Employees")
class HighaccessEmployeesTest {
    private HighaccessEmployees highaccessEmployees;

    @BeforeEach
    void setup() {
        highaccessEmployees = new HighaccessEmployees();
    }

    private void test(List<String> output, List<List<String>> access_times) {
        Assertions.assertEquals(output, highaccessEmployees.findHighAccessEmployees(access_times));
    }

    @Test
    void test0() {
        test(List.of("a"), ListUtil.fromString("[[\"a\",\"0549\"],[\"b\",\"0457\"],[\"a\",\"0532\"],[\"a\",\"0621\"],[\"b\",\"0540\"]]"));
    }

    @Test
    void test1() {
        test(List.of("c", "d"), ListUtil.fromString("[[\"d\",\"0002\"],[\"c\",\"0808\"],[\"c\",\"0829\"],[\"e\",\"0215\"],[\"d\",\"1508\"],[\"d\",\"1444\"],[\"d\",\"1410\"],[\"c\",\"0809\"]]"));
    }

    @Test
    void test2() {
        test(List.of("zltmqe"), ListUtil.fromString("[[\"wmcnxagevi\",\"1750\"],[\"zltmqe\",\"1749\"],[\"wiihypt\",\"1830\"],[\"zltmqe\",\"1801\"],[\"zltmqe\",\"1828\"],[\"zltmqe\",\"1843\"],[\"zltmqe\",\"1850\"],[\"zltmqe\",\"1835\"]]"));
    }

    @Test
    void test3() {
        test(List.of("r", "va"), ListUtil.fromString("[[\"wjmqm\",\"0442\"],[\"wjmqm\",\"0504\"],[\"r\",\"0525\"],[\"va\",\"0436\"],[\"r\",\"0440\"],[\"va\",\"0505\"],[\"va\",\"0509\"],[\"r\",\"0515\"],[\"r\",\"0414\"]]"));
    }
}
