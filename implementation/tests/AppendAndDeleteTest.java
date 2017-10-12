package implementation.tests;

import org.junit.Assert;
import org.junit.Test;
import implementation.AppendAndDelete;

public class AppendAndDeleteTest {

  @Test
  public void testCase0() {
    Assert.assertTrue(AppendAndDelete.canAppendAndDelete("hackerhappy", "hackerrank", 9));
  }

  @Test
  public void testCase1() {
    Assert.assertTrue(AppendAndDelete.canAppendAndDelete("abc", "abc", 7));
  }
  
  @Test
  public void testCase2() {
    Assert.assertTrue(AppendAndDelete.canAppendAndDelete(
        "aaaaaaaaaa", 
        "aaaaa", 7
        ));
  }
  
  @Test
  public void testCase3() {
    Assert.assertTrue(AppendAndDelete.canAppendAndDelete("zzzzz", "zzzzzzz", 4));
  }
  
  @Test
  public void testCase7() {
    Assert.assertTrue(AppendAndDelete.canAppendAndDelete(
        "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 
        "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 20
        ));
  }
  
  @Test
  public void testCase8() {
    Assert.assertFalse(AppendAndDelete.canAppendAndDelete("y", "yu", 2));
  }
  
  @Test
  public void testCase10() {
    Assert.assertFalse(AppendAndDelete.canAppendAndDelete("abcd", "abcdert", 10));
  }
}
