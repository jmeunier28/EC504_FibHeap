package com.project.fibonacciheap;

import java.util.*;

/**
 * Created by jmeunier28 on 10/30/16.
 */


//Java Implementation of a Fibonacci Heap Data Structure


public class FibonacciHeap {

    private FibHeapNode root;
    private int count;

    //constructor

    public FibonacciHeap()
    {
        root = null;
        count = 0;
    }

    //check if heap is empty
    public boolean isEmpty()
    {
        return root == null;
    }

    //make heap empty
    public void emptyHeap()
    {
        root = null;
        count = 0;
    }

    //insert into the heap
    public void insert(int element) {

        FibHeapNode node = new FibHeapNode(element);
        node.element = element;

        if(root != null){
            // fib heap is not empty
            node.left = root; // insert to the left of the root
            node.right = root.right;
            root.right = node;
            node.right.left = node;
            if (element < root.element) { //make min value element the root
                root = node;
            }
        }
        else{
            //fib heap is empty set node to root
            root = node;
        }
        count++;
    }

    //Display Fib Heap
    public void display()
    {
        System.out.print("\nHeap = ");
        FibHeapNode ptr = root;
        if (ptr == null)
        {
            System.out.print("Empty\n");
            return;
        }
        do
        {
            System.out.print(ptr.element +" ");
            ptr = ptr.right;
        } while (ptr != root && ptr.right != null);
        System.out.println();
    }

    public FibHeapNode getMin()
    {
        return root;
    }

    public void delete(int element)
    {
        //Delete Key
        //Call consolidate
    }

    public void deleteMin()
    {
        //Delete min key
        //Call consolidate
    }

    public void consolidate()
    {
        //Consolidate according to fib heap rules
    }

    public void decreaseKey(int key, int newKey)
    {
        //modify Fib Heap to decrease key value
        //Call Consolidate 
    }

}
