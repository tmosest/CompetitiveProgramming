package com.tmosest.competitiveprogramming.datastructures.implementations;

import com.tmosest.competitiveprogramming.datastructures.LinkedListAdt;

/**
 * Implementation of a Linked List.
 *
 * @author tmosest (Tyler Owen Moses)
 */
public class LinkedList<T> implements LinkedListAdt<T> {

  /**
   * The number of elements in the array.
   */
  int size;
  /**
   * A reference to the first Node in the list.
   */
  Node<T> first;

  /**
   * Creates a new empty linked list.
   */
  public LinkedList() {
    first = null;
    size = 0;
  }

  /**
   * Private helper function to allow create a new node. It also sets first reference if it hasn't
   * been set before.
   *
   * @param data The element data for the new node.
   * @return The newly created Node.
   */
  private Node<T> createNewNode(T data) {
    // Create new node
    Node<T> newNode = new Node<T>();
    // Set data for new node
    newNode.data = data;
    // Set first if initial node
    if (first == null) {
      first = newNode;
    }
    // return Node for other operations.
    return newNode;
  }

  /**
   * Private function to get the node at index i. This function is slow and limits most of the other
   * operations. Unlike an array with constant time lookup this has O(size) lookup.
   *
   * @param index integer representing where we are looking.
   */
  private Node<T> getNode(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> toReturn = first;
    for (int i = 1; i <= index; i++) {
      toReturn = toReturn.next;
    }
    return toReturn;
  }

  /**
   * Append a new node to the end of the Linked List. The complexity of this function is not O(1)
   * but equal to the complexity of looking up a node at a given index.
   *
   * @param element The element to add to the end of the list.
   */
  public void append(T element) {
    Node<T> node = createNewNode(element);
    if (!isEmpty()) {
      Node<T> last = getNode(size - 1);
      last.next = node;
    }
    ++size;
  }

  /**
   * @return size integer representing the number of elements in the Linked List.
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Get the node at index i. This function is slow and limits most of the other operations. Unlike
   * an array with constant time lookup this has O(size) lookup.
   *
   * @param index integer representing where we are looking.
   */
  public T get(int index) throws IndexOutOfBoundsException {
    return getNode(index).data;
  }

  /**
   * Adds an element to the beginning of the Linked List. Takes constant time.
   *
   * @param element T the object to add to the beginning of the LinkedList.
   */
  public void prepend(T element) {
    Node<T> node = createNewNode(element);
    if (!isEmpty()) {
      node.next = first;
      first = node;
    }
    ++size;
  }

  /**
   * Returns the number of elements in the Linked List.
   *
   * @return integer representing the size of the Linked List.
   */
  public int size() {
    return size;
  }

  /**
   * Allows the user to set the value at a given index.
   *
   * @param index The index from zero of where to set.
   * @param element The object to set that value to.
   */
  public void set(int index, T element) throws IndexOutOfBoundsException {
    Node<T> updateNode = getNode(index);
    updateNode.data = element;
  }

}
