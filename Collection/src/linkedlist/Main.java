package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    /*
     *  1) "null" insertion is allowed
     *  2) it is good for frequent changes like remove,add at specific index.
     *  3) for searching is not good
     *  4) Random access is not possible (it is not implemented RandomAccess interface)
     *  5) it can store heterogeneous values in non-generic LinkedList
     *  6) it's implemented Cloneable & Serializable,Deque interface
     *  7) Each object inside the LinkedList is node
     *  8) Internally represented by doubly linked list
     */


    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.add("progrank");
        lst.add(55);
        lst.add(null);
/*

        System.out.println(lst);

        System.out.println(lst.get(1));
*/

        lst.push(75);
        System.out.println(lst);

        //System.out.println(lst.removeFirst());
        System.out.println(lst.removeLast());
        System.out.println(lst);

        lst.add(1,"programmer");
        System.out.println(lst);

        lst.pollLast();
        System.out.println(lst);
        lst.set(1,"Java");//replace

        System.out.println(lst);
    }
}
