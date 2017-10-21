package datastructures;

/**
 * Creating my own linked list interface.
 * 
 * @author tmosest (Tyler Owen Moses)
 *
 */
public interface LinkedListADT<T> {
  /**
   * Append an element to the end of the Linked List.
   * 
   * @param element The element that needs to be appended to the end of the list.
   */
  public void append(T element);

  /**
   * Determines if the linked list is null or not.
   * 
   * @return
   */
  public boolean isEmpty();

  /**
   * Get the element T of the Linked List or throw an exception if out of bounds.
   * 
   * @param index The place in the Linked List starting at zero.
   * @return The element at the given index.
   * @throws IndexOutOfBoundsException Throws out of out of bounds exception.
   */
  public T get(int index) throws IndexOutOfBoundsException;

  /**
   * Prepend an element to the beginning of the Linked List.
   * 
   * @param element The element that needs to added to the beginning of the list.
   */
  public void prepend(T element);

  /**
   * Sets the element at the given index to the given element if it is with range.
   * 
   * @param index integer from 0 to size - 1;
   * @param element The new element we want to set to.
   * @throws IndexOutOfBoundsException Throws out of out of bounds exception.
   */
  public void set(int index, T element) throws IndexOutOfBoundsException;

  /**
   * Returns the number of elements inside the linked list.
   * 
   * @return The size of the list as an integer.
   */
  public int size();
}
