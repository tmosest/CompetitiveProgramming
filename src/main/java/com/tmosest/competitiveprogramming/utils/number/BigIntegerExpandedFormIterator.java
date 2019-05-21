package com.tmosest.competitiveprogramming.utils.number;

import java.util.Iterator;
import java.util.function.Consumer;

public class BigIntegerExpandedFormIterator implements Iterator<BigInteger>, Iterable<BigInteger> {

  private int index = 0;
  private char[] bigIntegerValue;

  /**
   * Iterate over the expanded form of a number.
   * Ex: 12345 -> 5 -> 40 -> 300 -> 2000 -> 10000.
   * @param val The value to iterate over.
   */
  public BigIntegerExpandedFormIterator(BigInteger val) {
    bigIntegerValue = val.toString().toCharArray();
  }

  @Override
  public void forEachRemaining(Consumer<? super BigInteger> action) {
  }

  @Override
  public void remove() {

  }

  @Override
  public boolean hasNext() {
    return index < bigIntegerValue.length;
  }

  @Override
  public BigInteger next() {
    StringBuilder stringBuilder = new StringBuilder();
    char digit = bigIntegerValue[bigIntegerValue.length - 1 - index];
    stringBuilder.append(digit);
    for (int i = 0; i < index; i++) {
      stringBuilder.append('0');
    }
    index++;
    return new BigInteger(stringBuilder.toString());
  }

  @Override
  public Iterator<BigInteger> iterator() {
    return this;
  }
}
