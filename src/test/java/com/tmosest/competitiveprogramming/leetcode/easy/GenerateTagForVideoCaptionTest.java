package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("wc454")
@DisplayName("LeetCode: 3582. Generate Tag for Video Caption")
class GenerateTagForVideoCaptionTest {
    private GenerateTagForVideoCaption generateTagForVideoCaption;

    @BeforeEach
    void setup() {
        generateTagForVideoCaption = new GenerateTagForVideoCaption();
    }

    private void test(String output, String caption) {
        Assertions.assertEquals(output, generateTagForVideoCaption.generateTag(caption));
    }

    @Test
    void test0() {
        test("#leetcodeDailyStreakAchieved", "Leetcode daily streak achieved");
    }
}
