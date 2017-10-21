package com.tmosest.CompetitiveProgramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.CompetitiveProgramming.datastructures.UnionFindADT;

@DisplayName("Quick Union Weight Path Compression Union Find")
class QuickUnionWeightedPathCompressionTest {

  int size = 10;
  UnionFindADT uf;

  @BeforeEach
  public void setUp() {
    uf = new QuickUnionWeightedPathCompression(10);
  }

  @Test
  @DisplayName("isConnected")
  public void testIsConnectedForNewUF() throws IndexOutOfBoundsException {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j) {
          // Test Reflexive Property.
          Assertions.assertTrue(uf.isConnected(i, j));
        } else {
          // Otherwise shouldn't be connected.
          Assertions.assertFalse(uf.isConnected(i, j));
        }
      }
    }
  }

  @Test
  @DisplayName("Union")
  public void testUnion() throws IndexOutOfBoundsException {
    uf.union(0, 1);
    Assertions.assertTrue(uf.isConnected(0, 1));
    // Test Transitivity
    uf.union(1, 2);
    Assertions.assertTrue(uf.isConnected(0, 2));
  }

}
