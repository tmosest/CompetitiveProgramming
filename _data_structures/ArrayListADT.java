package _data_structures;
/**
 * ArrayListADT<Generic>
 * 
 * Class
 * 
 * @author tmosest
 *
 * @param <Generic>
 */
public interface ArrayListADT<T> {
	/**
	 * Determines if an Array is empty or not.
	 * @return
	 */
	boolean isEmpty();
	/**
	 * Returns the current size of the Array List
	 * @return
	 */
	int size();
	/**
	 * Returns the current item in the i'th slot.
	 * Starting at zero.
	 * @param i
	 * @return
	 * @throws Exception 
	 */
	T get(int i) throws Exception;
	/**
	 * Allows you to look at the top element without removing it.
	 * @return
	 */
	T peek();
	/**
	 * Removes and returns the most recently added object.
	 * @return
	 */
	T pop();
	/**
	 * Adds a new item to the end of the Array.
	 * @param item
	 */
	void push(T item);
}
