package com.project.fibonacciheap;

/**
 * Created by jmeunier28 on 10/30/16.
 */
public class FibHeapNode {

        FibHeapNode child, left, right, parent;
        int element;

        //constructor

        public FibHeapNode(int element)
        {

            this.right = this;
            this.left = this;
            this.element = element;

        }
}
