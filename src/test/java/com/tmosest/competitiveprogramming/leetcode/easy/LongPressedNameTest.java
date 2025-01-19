package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc106")
@DisplayName("LeetCode: 925. Long Pressed Name")
class LongPressedNameTest {
    private LongPressedName longPressedName;

    @BeforeEach
    void setup() {
        longPressedName = new LongPressedName();
    }

    private void test(boolean output, String name, String typed) {
        Assertions.assertEquals(output, longPressedName.isLongPressedName(name, typed));
    }

    @Test
    void test0() {
        test(true, "alex", "aaleex");
    }

    @Test
    void test1() {
        test(false, "saeed", "ssaaedd");
    }

    @Test
    void test2() {
        test(false, "rick", "kric");
    }

    @Test
    void test4() {
        test(false, "alex", "aaleexa");
    }
}
