package com.tmosest.competitiveprogramming.hackerearth.datastructures.stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MonkAndPrisonerOfAzkaban {

  public static boolean debugMode = false;

  /**
   * Function to test.
   *
   * @return Array of x + y's
   */
  public static long[] solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    Tuple[] array = new Tuple[size];
    for (int i = 0; i < size; i++) {
      Tuple tuple = new Tuple(i, in.nextLong());
      array[i] = tuple;
    }
    in.close();
    long[] nextGreaterElements = nextGreaterElements(array);
    long[] lastGreaterElements = lastGreaterElements(array);
    long[] results = new long[size];
    for (int i = 0; i < size; i++) {
      if (nextGreaterElements[i] > -1) {
        nextGreaterElements[i]++;
      }
      if (lastGreaterElements[i] > -1) {
        lastGreaterElements[i]++;
      }
      results[i] = nextGreaterElements[i] + lastGreaterElements[i];
    }
    return results;
  }

  /**
   * Main function bro.
   *
   * @param args Main String array
   */
  public static void main(String[] args) {
    Arrays.stream(solve()).forEach((index) -> {
      System.out.print(index + " ");
    });
  }

  private static long[] nextGreaterElements(Tuple[] array) {
    int index = 0;
    Stack<Tuple> stack = new Stack<Tuple>();
    stack.push(array[0]);
    Tuple element;
    Tuple next;
    long[] resultsIndex = new long[array.length];
    for (index = 1; index < array.length; index++) {
      next = array[index];
      if (debugMode) {
        System.out.println("i: " + index + " array: " + array[index]);
      }
      if (!stack.empty()) {
        // if stack is not empty, then
        // pop an element from stack
        element = stack.pop();
        if (debugMode) {
          System.out.println("element: " + element);
        }
        /* If the popped element is smaller than
                   next, then a) print the pair b) keep
                   popping while elements are smaller and
                   stack is not empty */
        while (element.value < next.value) {
          resultsIndex[element.index] = next.index;
          if (debugMode) {
            System.out.println(element.toString() + " --> " + next.toString());
          }
          if (stack.empty()) {
            break;
          }
          element = stack.pop();
        }
        /* If element is greater than next, then
                   push the element back */
        if (element.value > next.value) {
          stack.push(element);
        }
      }
      /* push next to stack so that we can find next
               greater for it */
      stack.push(next);
    }
    while (!stack.empty()) {
      element = stack.pop();
      resultsIndex[element.index] = -1;
      if (debugMode) {
        System.out.println(element.toString() + " -- " + -1);
      }
    }
    if (debugMode) {
      Arrays.stream(resultsIndex).forEach((val) -> {
        System.out.print(val + " ");
      });
      System.out.println();
    }
    return resultsIndex;
  }

  private static long[] lastGreaterElements(Tuple[] array) {
    int index = 0;
    Stack<Tuple> stack = new Stack<Tuple>();
    stack.push(array[array.length - 1]);
    Tuple element;
    Tuple last;
    long[] resultsIndex = new long[array.length];
    for (index = array.length - 2; index >= 0; index--) {
      last = array[index];
      if (debugMode) {
        System.out.println("i: " + index + " array: " + array[index]);
      }
      if (!stack.empty()) {
        // if stack is not empty, then
        // pop an element from stack
        element = stack.pop();
        if (debugMode) {
          System.out.println("element: " + element);
        }
        while (element.value < last.value) {
          resultsIndex[element.index] = last.index;
          if (debugMode) {
            System.out.println(element.toString() + " --> " + last.toString());
          }
          if (stack.empty()) {
            break;
          }
          element = stack.pop();
        }
        /* If element is greater than next, then
                   push the element back */
        if (element.value > last.value) {
          stack.push(element);
        }
      }
      /* push next to stack so that we can find next
               greater for it */
      stack.push(last);
    }
    while (!stack.empty()) {
      element = stack.pop();
      resultsIndex[element.index] = -1;
      if (debugMode) {
        System.out.println(element.toString() + " -- " + -1);
      }
    }
    if (debugMode) {
      Arrays.stream(resultsIndex).forEach((val) -> {
        System.out.print(val + " ");
      });
      System.out.println();
    }
    return resultsIndex;
  }

  private static class Tuple {

    int index;
    long value;

    public Tuple(int index, long value) {
      this.index = index;
      this.value = value;
    }

    public String toString() {
      return "{index: " + index + ", value: " + value + "}";
    }
  }
}
