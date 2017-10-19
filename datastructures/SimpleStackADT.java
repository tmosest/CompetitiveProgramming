package datastructures;

public interface SimpleStackADT<T> {
  /**
   * Insert a new object into the stack.
   * @param element new object to add.
   */
  void push(T element);
  /**
   * Remove and return last object added to the stack.
   * @return Last object added to the stack.
   */
  T pop();
  /**
   * Is the Stack Empty?
   * @return true if the stack is empty.
   */
  boolean isEmpty();
  /**
   * The Number of objects on the stack.
   * @return
   */
  int size();
}
