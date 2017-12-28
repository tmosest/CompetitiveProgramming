package com.tmosest.competitiveprogramming.datastructures.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.datastructures.LinkedListADT;

@DisplayName("Data Structures: Likned List Tests")
public class LinkedListTest {

  LinkedListADT<Integer> linkedList;

  Integer data;
  Integer newdata;

  @BeforeEach
  public void setup() {
    linkedList = new LinkedList<Integer>();
    data = 5;
    newdata = 7;
  }

  @Test
  @DisplayName("Get should not work for negative index")
  public void cannotGetIfNegativeIndex() {
    Assertions.assertTrue(linkedList.isEmpty());
    Assertions.assertEquals(0, linkedList.size());
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.get(0);
    });
  }

  @Test
  @DisplayName("Get should not work for empty list")
  public void cannotGetIfEmpty() {
    Assertions.assertTrue(linkedList.isEmpty());
    Assertions.assertEquals(0, linkedList.size());
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.get(0);
    });
  }

  @Test
  @DisplayName("Get should not work when index is equal to size")
  public void cannotGetIfIndexIsSize() {
    Assertions.assertTrue(linkedList.isEmpty());
    linkedList.prepend(data);
    int size = linkedList.size();
    Assertions.assertEquals(1, size);
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.get(size);
    });
  }

  @Test
  @DisplayName("Get should not work when index is larger than size")
  public void cannotGetIfIndexIsLargerThanSize() {
    Assertions.assertTrue(linkedList.isEmpty());
    int size = linkedList.size();
    Assertions.assertEquals(0, size);
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.get(size + 1);
    });
  }

  @Test
  @DisplayName("Set should not work for negative index")
  public void cannotSetIfNegativeIndex() {
    Assertions.assertTrue(linkedList.isEmpty());
    Assertions.assertEquals(0, linkedList.size());
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.set(-1, newdata);
    });
  }

  @Test
  @DisplayName("Set should not work for empty list")
  public void cannotSetIfEmpty() {
    Assertions.assertTrue(linkedList.isEmpty());
    Assertions.assertEquals(0, linkedList.size());
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.set(0, 2);
    });
  }

  @Test
  @DisplayName("Set should not work when index is equal to size")
  public void cannotSetIfIndexIsSize() {
    Assertions.assertTrue(linkedList.isEmpty());
    linkedList.prepend(data);
    int size = linkedList.size();
    Assertions.assertEquals(1, size);
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.set(size, newdata);
    });
  }

  @Test
  @DisplayName("Set should not work when index is larger than size")
  public void cannotSetIfIndexIsLargerThanSize() {
    Assertions.assertTrue(linkedList.isEmpty());
    int size = linkedList.size();
    Assertions.assertEquals(0, size);
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
      linkedList.set(size + 1, newdata);
    });
  }

  @Test
  @DisplayName("Append")
  public void canAppendElements() {
    // Try to append one piece of data.
    linkedList.append(data);
    Assertions.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    Assertions.assertEquals(1, linkedList.size()); // Confirm that size is working too.
    // Try to append a second piece of data to make sure that it really worked.
    linkedList.append(newdata);
    Assertions.assertEquals(data, linkedList.get(0)); // Confirm that original element is still
                                                      // first
    Assertions.assertEquals(newdata, linkedList.get(1)); // Confirm that new element is second.
    Assertions.assertEquals(2, linkedList.size()); // Confirm that size is working too.
  }

  @Test
  @DisplayName("Prepend")
  public void canPrependElement() {
    // Try to prepend one piece of data.
    linkedList.prepend(data);
    Assertions.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    Assertions.assertEquals(1, linkedList.size()); // Confirm that size is working too.
    // Try to prepend a second piece of data to make sure that it really worked.
    linkedList.prepend(newdata);
    Assertions.assertEquals(newdata, linkedList.get(0)); // Confirm that new element is first.
    Assertions.assertEquals(data, linkedList.get(1)); // Confirm that old element shifted up one
    Assertions.assertEquals(2, linkedList.size()); // Confirm that size is working too.
  }

  @Test
  @DisplayName("Can mix appends and prepends")
  public void canMixAppendsAndPrepends() {
    // Try to append one piece of data.
    linkedList.append(data);
    Assertions.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    Assertions.assertEquals(1, linkedList.size()); // Confirm that size is working too.
    // Try to prepend a second piece of data to make sure that it really worked.
    linkedList.prepend(newdata);
    Assertions.assertEquals(newdata, linkedList.get(0)); // Confirm that new element is first.
    Assertions.assertEquals(data, linkedList.get(1)); // Confirm that old element shifted up one
    Assertions.assertEquals(2, linkedList.size()); // Confirm that size is working too.
  }

  @Test
  @DisplayName("Can update nodes")
  public void canUpdateData() {
    // Try to append one piece of data.
    linkedList.append(data);
    Assertions.assertEquals(data, linkedList.get(0)); // Confirm that element is first
    linkedList.set(0, newdata);
    Assertions.assertEquals(newdata, linkedList.get(0)); // Confirm that element is updated
  }

}
