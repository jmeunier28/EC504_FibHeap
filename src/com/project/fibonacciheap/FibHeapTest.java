package com.project.fibonacciheap;
import javax.print.attribute.standard.Fidelity;
import java.util.*;

/**
 * Created by jmeunier28 on 10/30/16.
 */
public class FibHeapTest {

        public static void main(String[] args) {

            System.out.println("FibonacciHeap Test\n\n");
            FibonacciHeap fh = new FibonacciHeap<Integer>();

            for (int i = 15; i > 0; i--)
            {
                FibHeapNode node = new FibHeapNode((int) Math.floor(Math.random()*i*200));//, (int) Math.floor(Math.random() * i*200)); // populate random array
                fh.insert(node);
                //System.out.print("\n\nThe min is: " + fh.getMin().getValue());
            }
            FibHeapNode node = new FibHeapNode(800); //insert on purpose

            System.out.print("\n\nThe min is: key: " + fh.getMin().getKey());
            fh.deleteMin();
            System.out.print("\n\nThe min is: key: " + fh.getMin().getKey());
            fh.delete(node);
            fh.printPaths(node);



//            FibonacciHeap fh2 = new FibonacciHeap<Integer>();
//            for(int i = 15; i < 30; i++)
//            {
//                FibHeapNode node = new FibHeapNode((int) Math.floor(Math.random()*i + 5));//, (int) Math.floor(Math.random() * i*5));
//                fh2.insert(node);
//            }
//            System.out.print("\n\nMerging in second Heap");
//            fh.mergeHeap(fh2); // merge the two heaps
//            System.out.print("\n\nThe min is: key: " + fh.getMin().getKey()+ " value: " + fh.getMin().getValue());
//            fh.deleteMin();
//            System.out.print("\n\nThe min is: key: " + fh.getMin().getKey()+ " value: " + fh.getMin().getValue());


        }
}
