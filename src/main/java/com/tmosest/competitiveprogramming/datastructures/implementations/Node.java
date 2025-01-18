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
  
  // public Node<T> left;
  // public Node<T> right;
  
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

  private class LinkedList<T> {

    private Node<T> root = null;

    public LinkedList() {}

    public void print() {
      if (root == null) {
        System.out.println('empty');
      } else {
        Node<T> runner = root;
        while (runner != null) {
          System.out.println(runner.data);
          runner = runner.next;
        }
      }
    }

    public void append(T data) {
      if (root == null) {
        root = new Node<T>(data);
      } else {
        Node<T> runner = root;
        while(runner.next != null) {
          runner = runner.next;
        }
        runner.next = new Node<T>(data);
      }
    }
  }

  // Testing function
  public static void main() {
    Node<Integer> root = new Node<Integer>(1); // 1

    Node<Integer> fiveNode = new Node<Integer>(5); // 5

    root.next = fiveNode; // 1 -> 5

    Node<Integer> twoNode = new Node<>(2); // this node 2 in it.
    System.out.println(twoNode.data); // print out 2

    fiveNode.next = twoNode; // 5-> 2

  }
}

