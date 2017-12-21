package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.search.binarysearch;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RoundTableMeeting {

  static class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
      din = new DataInputStream(System.in);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public int nextInt() throws IOException {
      int ret = 0;
      byte c = read();
      while (c <= ' ')
        c = read();
      boolean neg = (c == '-');
      if (neg)
        c = read();
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (neg)
        return -ret;
      return ret;
    }

    private void fillBuffer() throws IOException {
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      if (bytesRead == -1)
        buffer[0] = -1;
    }

    private byte read() throws IOException {
      if (bufferPointer == bytesRead)
        fillBuffer();
      return buffer[bufferPointer++];
    }

    public void close() throws IOException {
      if (din == null)
        return;
      din.close();
    }
  }

  public static boolean debugMode = false;

  public static int findMinimumTime(int[] universities, int university1, int university2) {
    if (university1 == university2)
      return 0;

    if (debugMode) {
      System.out.println("\n==============================");
      System.out.println("university1: " + university1 + " university2: " + university2);
      System.out.println("==============================");
    }
    Set<Integer> students1 = new HashSet<Integer>();
    Set<Integer> students2 = new HashSet<Integer>();
    for (int i = 0; i < universities.length; i++) {
      if (universities[i] == university1) {
        students1.add(i);
      }
      if (universities[i] == university2) {
        students2.add(i);
      }
    }
    int minimumTime = Integer.MAX_VALUE;
    for (int index1 : students1) {
      for (int index2 : students2) {
        int normalDifference = Math.abs(index2 - index1);
        int roundDifference = universities.length - normalDifference;
        int difference = Math.min(normalDifference, roundDifference);
        minimumTime = Math.min(minimumTime, (difference) / 2);
        if (debugMode) {
          System.out
              .println("index1: " + index1 + " index2: " + index2 + " minimumTime: " + minimumTime);
          System.out.println("normalDifference: " + normalDifference + " roundDifference: "
              + roundDifference + " difference: " + difference);
        }
        if (minimumTime <= 0)
          break;
      }
    }
    if (debugMode)
      System.out.println("final time: " + minimumTime);
    return (minimumTime > 0) ? minimumTime : 0;
  }

  public static int[] solve() throws IOException {
    Reader in = new Reader();
    int arraySize = in.nextInt();
    int queries = in.nextInt();
    int[] universities = new int[arraySize];
    for (int i = 0; i < arraySize; i++)
      universities[i] = in.nextInt();
    int[] results = new int[queries];
    for (int i = 0; i < queries; i++) {
      int university1 = in.nextInt();
      int university2 = in.nextInt();
      results[i] = findMinimumTime(universities, university1, university2);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) throws IOException {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
