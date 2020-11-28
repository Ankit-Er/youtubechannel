package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        //Student[] a = new Student[16];

        //map doesn't maintain order of elements
        Map<String, Integer> m = new HashMap<String, Integer>();

        //bucket is created with size of 16 using HashMap initial capacity which is 16
        //put first check bucket is created or not then add object into bucket
        //bucket is nothing it's an array of Node class which is nested class of HashMap
        m.put("Ankit", 222);

        //in case of index collision -- internally maintain linked list O(n) but after 8 nodes that convert into B-Tree O(log n)
        m.put("Yaman", 555);
        m.put("Joe", 777);
        m.put("Shashi", 333);

        m.put("ABC", 111);

        //multiple null keys are allowed--in this case max chance of index collision
        //in general for null key ...index would be zero
        m.put(null, 1011);
        m.put(null, 10110);
    }
}
