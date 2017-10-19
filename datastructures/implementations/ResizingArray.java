package datastructures.implementations;

import datastructures.ArrayListADT;

public class ResizingArray<T> implements ArrayListADT<T> {

	private int N;
	private T[] array;
	
	@SuppressWarnings("unchecked")
    public ResizingArray() {
		N = 0;
		array = (T[]) new Object[10];
	}
	
	@Override
	public boolean isEmpty() { return N == 0; }
	
	@Override
	public int size() { return N; }

	@Override
	public T get(int i) throws Exception {
		if(i >= N || i < 0) 
			throw new Exception("Out Of bounds");
		return array[i];
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		int length = array.length;
		if(N == length) {
            T[] array2 = (T[]) new Object[2 * array.length];
			for(int i = 0; i < length; i++) {
				array2[i] = array[i];
			}
			array = array2;
		} else if(N * 4 > length) {
    		  
			T[] array2 = (T[]) new Object[array.length / 4];
			for(int i = 0; i < length; i++) {
				array2[i] = array[i];
			}
			array = array2;
		}
	}

	@Override
	public T pop() {
		return (isEmpty()) ? null : array[--N];
	}

	@Override
	public void push(T item) {
		if(N == array.length)
			resize();
		array[N++] = item;
	}

	@Override
	public T peek() {
		return (isEmpty()) ? null : array[N-1];
	}
}
