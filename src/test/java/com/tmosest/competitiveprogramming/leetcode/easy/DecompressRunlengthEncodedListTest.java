package com.tmosest.competitiveprogramming.leetcode.easy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1313. Decompress Run-Length Encoded List")
class DecompressRunlengthEncodedListTest {

  void testCase0() throws Exception {
    int[] arr = {1,2,3,4};
    int[] expected = {2,4,4,4};
    Assertions.assertArrayEquals(expected, new DecompressRunlengthEncodedList().decompressRleList(arr));

    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    System.out.println(sdf.format(getSomeDate(
        "2010-01-17 09:54 am", TimeZone.getTimeZone("UTC"))));
    System.out.println(sdf.format(getSomeDate(
        "2010-11-17 01:54 pm", TimeZone.getTimeZone("PST"))));
  }

  public static Date getSomeDate(final String str, final TimeZone tz)
      throws ParseException {
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
    sdf.setTimeZone(tz);
    return sdf.parse(str);
  }
}
