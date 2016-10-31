package com.project.fibonacciheap;
import java.util.*;

/**
 * Created by jmeunier28 on 10/30/16.
 */
public class FibHeapTest {

        public static void main(String[] args)
        {

            System.out.println("FibonacciHeap Test\n\n");
            FibonacciHeap fh = new FibonacciHeap();
            int[] arr = new int[15];

            for (int i = 0; i<15; i++) {
                     arr[i] = (int)(Math.random() * 14 + 1); // populate random array
            }

            for (int j = 0; j < arr.length;j++){
                fh.insert(arr[j]);
            }

            fh.display();
            fh.emptyHeap();
            fh.display();

        }
}
