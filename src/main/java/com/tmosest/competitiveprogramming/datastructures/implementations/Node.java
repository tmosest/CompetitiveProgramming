package com.tmosest.competitiveprogramming.datastructures.implementations;

/**
 * This class represents a node of data.
 * @author tmosest
 * @param <T> What type of data is this node going to hold.
 */
public class Node<T> {

  // a class is made up of attributes and methods
    // attrtibutes are essentially pieces of data. like make, model, 
  // these are attributes
  public T data;        // data in the node    
  public Node<T> next;  // pointer to another node
  
  public Node<T> left;
  public Node<T> right;
  
  // Creates an empty node
  public Node() {
    
  }
  
  // Create a new node with the information "data" stored in the node.
  // This keyword references the current instance of the class.
  public Node(T data) {
    // class "data" = input "data"
    // "this" allows us to copy the data passed into the fucntion into the attribute data. 
    this.data = data;
  }

}

