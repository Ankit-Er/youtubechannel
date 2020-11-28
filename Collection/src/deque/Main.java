package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        /* head-------------tail
        * */

        //queue --FIFO

        Deque<Integer> d = new ArrayDeque<>();
        d.offer(5);
        d.offer(7);
        d.offer(8);
        // [5,7,8]

        d.pop();
        System.out.println(d);

    }
}
