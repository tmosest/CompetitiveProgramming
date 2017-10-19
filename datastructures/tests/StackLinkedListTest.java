package datastructures.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import datastructures.implementations.StackLinkedList;

public class StackLinkedListTest {

  StackLinkedList<String> stack;

  @Before
  public void setup() {
    stack = new StackLinkedList<String>();
  }

  @Test
  public void shouldBeAbleToAppendAndDelete() {
    String word = "to";
    stack.push(word);
    Assert.assertEquals(word, stack.pop());
  }

  @Test
  public void shouldBeAbleToReverseStringArray() {
    String[] words = {"to", "be", "or", "not", "to", "be", "that", "is", "the", "question"};
    for (String word : words)
      stack.push(word);
    for (int i = words.length - 1; i > -1; i--)
      Assert.assertEquals(words[i], stack.pop());
  }

  @Test
  public void shouldBeAbleToEmptyAndRefill() {
    String[] words = {"to", "be", "or", "not", "to", "be", "that", "is", "the", "question"};
    for (String word : words)
      stack.push(word);
    Assert.assertEquals(words.length, stack.size());
    for (int i = words.length - 1; i > -1; i--)
      Assert.assertEquals(words[i], stack.pop());
    Assert.assertEquals(0, stack.size());
    Assert.assertEquals(null, stack.pop());
    for (String word : words)
      stack.push(word);
    for (int i = words.length - 1; i > -1; i--)
      Assert.assertEquals(words[i], stack.pop());
  }

}
