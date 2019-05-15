package com.tmosest.competitiveprogramming.utils.number;

import java.util.Iterator;

public class BigInterIterator implements Iterator<BigInteger> {

  private BigInteger start = new BigInteger();
  private BigInteger destination = new BigInteger();

  /**
   * Iterate from 0 to this BigInteger.
   * @param destination From 0 to destination.
   */
  public BigInterIterator(BigInteger destination) {
    this.destination = destination;
  }

  @Override
  public void remove() {
  }

  @Override
  public boolean hasNext() {
    return !destination.equals(start);
  }

  @Override
  public BigInteger next() {
    BigInteger start = this.start;
    this.start = this.start.add(new BigInteger("1"));
    return start;
  }
}
