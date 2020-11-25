package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc208")
@DisplayName("LeetCode: 1598. Crawler Log Folder")
class CrawlerLogFolderTest {

  private CrawlerLogFolder crawlerLogFolder = new CrawlerLogFolder();

  @Test
  void test1() {
    Assertions.assertEquals(2, crawlerLogFolder.minOperations(new String[] {
        "d1/", "d2/", "../", "d21", "./"
    }));
  }
}
