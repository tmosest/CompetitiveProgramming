package com.tmosest.CompetitiveProgramming.hackerearth.circuits.dec17;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeftOrRight {

  public static boolean debugMode = false;
  
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

    public Reader(String file_name) throws IOException {
      din = new DataInputStream(new FileInputStream(file_name));
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
      byte[] buf = new byte[64]; // line length
      int cnt = 0, c;
      while ((c = read()) != -1) {
        if (c == '\n')
          break;
        buf[cnt++] = (byte) c;
      }
      return new String(buf, 0, cnt);
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

    public long nextLong() throws IOException {
      long ret = 0;
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

    public double nextDouble() throws IOException {
      double ret = 0, div = 1;
      byte c = read();
      while (c <= ' ')
        c = read();
      boolean neg = (c == '-');
      if (neg)
        c = read();

      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (c == '.') {
        while ((c = read()) >= '0' && c <= '9') {
          ret += (c - '0') / (div *= 10);
        }
      }

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

  private static int countSteps(int[] cities, int startCityIndex, int cityType, char direction) {
    int steps = -1;
    int N = cities.length;
    int index = startCityIndex;
    for (int i = 0; i < N; i++) {
      if (i > 0)
        index = (direction == 'R') ? (index + 1) % N : (index - 1 + N) % N;
      if (cities[index] == cityType) {
        steps = i;
        break;
      }
    }
    return steps;
  }

  public static int[] solve() throws IOException {
    Reader in = new Reader();
    int citiesSize = in.nextInt();
    int querySize = in.nextInt();
    int[] cities = new int[citiesSize];
    for (int i = 0; i < citiesSize; i++)
      cities[i] = in.nextInt();
    if(debugMode) {
      for(int i = 0; i < citiesSize; i++) {
        System.out.println("i: " + i + " <- " + ((i - 1 + citiesSize) % citiesSize) + " -> " + (i + 1));
      }
    }
    int[] results = new int[querySize];
    for (int i = 0; i < querySize; i++) {
      String[] line = in.readLine().split(" ");
      int start = Integer.parseInt(line[0]);
      int type = Integer.parseInt(line[1]);
      char direction = line[2].charAt(0);
      results[i] = countSteps(cities, start, type, direction);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) throws IOException {
    int[] results = solve();
    for (int i : results)
      System.out.println(i);
  }
}
