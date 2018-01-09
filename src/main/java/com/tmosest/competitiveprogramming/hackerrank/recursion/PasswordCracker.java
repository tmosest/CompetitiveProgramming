package com.tmosest.competitiveprogramming.hackerrank.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordCracker {

  public static boolean debugMode = false;

  private static String convertPqToString(MinPriorityQueue wordsMinPq) {
    StringBuilder sb = new StringBuilder();
    while(wordsMinPq.size > 0) {
      Word min = wordsMinPq.delMin();
      if (debugMode) {
        System.out.println("min: " + min.word + " : " + min.index);
      }
      sb.append(min.word);
      if (wordsMinPq.size > 0) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }

  private static String determinePassword(String[] attempts, String login) {
    if (debugMode) {
      System.out.println("login: " + login);
    }
    MinPriorityQueue wordsMinPq = new MinPriorityQueue(login.length() + attempts.length);
    String loginCopy = login;
    for (String attempt : attempts) {
      if (debugMode) {
        System.out.println("attempt: " + attempt);
      }
      if (attempt.equals(login)) {
        return attempt;
      }
      int index = login.indexOf(attempt);
      while(index > - 1) {
        if (debugMode) {
          System.out.println("attempt: " + attempt + " index: " + index);
        }
        Word word = new Word(index, attempt);
        wordsMinPq.insert(word);
        loginCopy = loginCopy.replaceFirst(attempt, "");
        index = login.indexOf(attempt, index + 1);
      }
    }
    if (debugMode) {
      System.out.println("final login: " + loginCopy);
    }
    return (loginCopy.length() == 0) ? convertPqToString(wordsMinPq) : "WRONG PASSWORD";
  }

  public static String[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    String[] results = new String[tests];
    for (int t = 0; t < tests; t++) {
      int words = in.nextInt();
      String[] attempts = new String[words];
      for (int w = 0; w < words; w++) {
        attempts[w] = in.next();
      }
      String login = in.next();
      results[t] = determinePassword(attempts, login);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }

  private static class Word implements Comparable<Word> {

    int index;
    String word;

    public Word(int index, String word) {
      this.index = index;
      this.word = word;
    }

    public int compareTo(Word other) {
      return Integer.compare(index, other.index);
    }
  }

  private static class MinPriorityQueue {

    int size;
    Word[] heap;

    public MinPriorityQueue(int capacity) {
      size = 0;
      heap = new Word[capacity];
    }

    private void swap(int first, int second) {
      Word temp = heap[first];
      heap[first] = heap[second];
      heap[second] = temp;
    }

    private boolean less(Word word1, Word word2) {
      return word1.compareTo(word2) < 0;
    }

    private void sink() {
      int parent = 0;
      int childLeft = 1;
      int childRight = 2;
      while((childLeft < size && (less(heap[childLeft], heap[parent])))
          || (childRight < size &&  (less(heap[childRight], heap[parent])))) {
        int childMin = childLeft;
        if (childRight < size && less(heap[childRight], heap[childLeft])) {
          childMin = childRight;
        }
        swap(parent, childMin);
        parent = childMin;
        childLeft = 2 * parent + 1;
        childRight = 2 * parent + 2;
      }
    }

    private void swim(int index) {
      while (index > 0 && less(heap[index], heap[index / 2])) {
        swap(index, index / 2);
        index /= 2;
      }
    }

    public Word delMin() {
      Word min = heap[0];
      swap(0, --size);
      sink();
      return min;
    }

    public void insert(Word word) {
      heap[size++] = word;
      swim(size - 1);
      if (size * 2 > heap.length) {
        Word[] array = new Word[2 * size];
        for (int i = 0; i < size; i++) {
          array[i] = heap[i];
        }
        heap = array;
      }
    }
  }
}
