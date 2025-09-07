package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 896. Monotonic Array")
@Tag("wc100")
class MonotonicArrayTest {
private MonotonicArray monotonicArray;

@BeforeEach
void setup() {
 monotonicArray = new MonotonicArray();
}
private void test( boolean output, int[] nums) {
 Assertions.assertEquals(output, monotonicArray.isMonotonic(nums)); }
/* Example 1
Input: nums = [1,2,2,3]
Output: true
null
 */

@Test
void test1() {
 test(true, new int[] { 1,2,2,3}); }
/* Example 2
Input: nums = [6,5,4,4]
Output: true
null
 */

@Test
void test2() {
 test(true, new int[] { 6,5,4,4}); }
/* Example 3
Input: nums = [1,3,2]
Output: false
null
 */

@Test
void test3() {
 test(false, new int[] { 1,3,2}); }



}
