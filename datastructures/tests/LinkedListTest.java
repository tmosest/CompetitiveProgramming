package datastructures.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import datastructures.LinkedListADT;
import datastructures.implementations.LinkedList;

public class LinkedListTest {

  LinkedListADT<Integer> linkedList;
  
  Integer data;
  Integer newdata;

  @Before
  public void setup() {
    linkedList = new LinkedList<Integer>();
    data = 5;
    newdata = 7;
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotGetIfNegativeIndex() {
    Assert.assertTrue(linkedList.isEmpty());
    Assert.assertEquals(0, linkedList.size());
    linkedList.get(-1);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotGetIfEmpty() {
    Assert.assertTrue(linkedList.isEmpty());
    Assert.assertEquals(0, linkedList.size());
    linkedList.get(0);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotGetIfIndexIsSize() {
    Assert.assertTrue(linkedList.isEmpty());
    linkedList.prepend(data);
    int size = linkedList.size();
    Assert.assertEquals(1, size);
    linkedList.get(size);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotGetIfIndexIsLargerThanSize() {
    Assert.assertTrue(linkedList.isEmpty());
    int size = linkedList.size();
    Assert.assertEquals(0, size);
    linkedList.get(size + 1);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotSetIfNegativeIndex() {
    Assert.assertTrue(linkedList.isEmpty());
    Assert.assertEquals(0, linkedList.size());
    linkedList.set(-1, newdata);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotSetIfEmpty() {
    Assert.assertTrue(linkedList.isEmpty());
    Assert.assertEquals(0, linkedList.size());
    linkedList.set(0, 2);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotSetIfIndexIsSize() {
    Assert.assertTrue(linkedList.isEmpty());
    linkedList.prepend(data);
    int size = linkedList.size();
    Assert.assertEquals(1, size);
    linkedList.set(size, newdata);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void cannotSetIfIndexIsLargerThanSize() {
    Assert.assertTrue(linkedList.isEmpty());
    int size = linkedList.size();
    Assert.assertEquals(0, size);
    linkedList.set(size + 1, newdata);
  }

  @Test
  public void canAppendElements() {
    // Try to append one piece of data.
    linkedList.append(data);
    Assert.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    Assert.assertEquals(1, linkedList.size()); // Confirm that size is working too.
    // Try to append a second piece of data to make sure that it really worked.
    linkedList.append(newdata);
    Assert.assertEquals(data, linkedList.get(0)); // Confirm that original element is still first
    Assert.assertEquals(newdata, linkedList.get(1)); // Confirm that new element is second.
    Assert.assertEquals(2, linkedList.size()); // Confirm that size is working too.
  }

  @Test
  public void canPrependElement() {
    // Try to prepend one piece of data.
    linkedList.prepend(data);
    Assert.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    Assert.assertEquals(1, linkedList.size()); // Confirm that size is working too.
    // Try to prepend a second piece of data to make sure that it really worked.
    linkedList.prepend(newdata);
    Assert.assertEquals(newdata, linkedList.get(0)); // Confirm that new element is first.
    Assert.assertEquals(data, linkedList.get(1)); // Confirm that old element shifted up one
    Assert.assertEquals(2, linkedList.size()); // Confirm that size is working too.
  }

  @Test
  public void canMixAppendsAndPrepends() {
    // Try to append one piece of data.
    linkedList.append(data);
    Assert.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    Assert.assertEquals(1, linkedList.size()); // Confirm that size is working too.
    // Try to prepend a second piece of data to make sure that it really worked.
    linkedList.prepend(newdata);
    Assert.assertEquals(newdata, linkedList.get(0)); // Confirm that new element is first.
    Assert.assertEquals(data, linkedList.get(1)); // Confirm that old element shifted up one
    Assert.assertEquals(2, linkedList.size()); // Confirm that size is working too.
  }

  @Test
  public void canUpdateData() {
    // Try to append one piece of data.
    linkedList.append(data);
    Assert.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    linkedList.set(0, newdata);
    Assert.assertEquals(newdata, linkedList.get(0)); // Confirm that element is updated
  }

}
