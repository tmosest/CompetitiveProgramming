package com.tmosest.competitiveprogramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackOfStringsLinkedListTest {

  StackOfStringsLinkedList stack;

  @BeforeEach
  public void setup() {
    stack = new StackOfStringsLinkedList();
  }

  @Test
  public void shouldBeAbleToAppendAndDelete() {
    String word = "to";
    stack.push(word);
    Assertions.assertEquals(word, stack.pop());
  }

  @Test
  public void shouldBeAbleToReverseStringArray() {
    String[] words = {"to", "be", "or", "not", "to", "be", "that", "is", "the", "question"};
    for (String word : words)
      stack.push(word);
    for (int i = words.length - 1; i > -1; i--)
      Assertions.assertEquals(words[i], stack.pop());
  }

  @Test
  public void shouldBeAbleToEmptyAndRefill() {
    String[] words = {"to", "be", "or", "not", "to", "be", "that", "is", "the", "question"};
    for (String word : words)
      stack.push(word);
    Assertions.assertEquals(words.length, stack.size());
    for (int i = words.length - 1; i > -1; i--)
      Assertions.assertEquals(words[i], stack.pop());
    Assertions.assertEquals(0, stack.size());
    Assertions.assertEquals(null, stack.pop());
    for (String word : words)
      stack.push(word);
    for (int i = words.length - 1; i > -1; i--)
      Assertions.assertEquals(words[i], stack.pop());
  }

}
