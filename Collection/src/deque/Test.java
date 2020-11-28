package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    /* Deque : Stack --> LIFO
     * Deque : Queue --> FIFO
    */

    public static void main(String[] args) {

        Deque<Integer> d = new ArrayDeque<>();

        //add in the head (beginning)

        /* d.push(5);
        d.push(15);
        d.push(55);*/

        // [15,15,5]
        d.addFirst(5);
        d.addFirst(7);
        d.addFirst(8);
        // [8,7,5]

        //remove elements from head

        //d.remove();
        //d.removeFirst();
        //d.pop();

        //remove elements from tail(end)
        //d.removeLast();

        System.out.println(d);

    }
}
