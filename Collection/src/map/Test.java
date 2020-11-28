package map;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        //map doesn't maintain order of elements
        Map<Integer,String> map1 = new HashMap<>();

        //it maintains order of elements in which you have added elements
        Map<Integer,String> map2 = new LinkedHashMap<>();

        //sort the elements based upon key
        //Map<Integer,String> map3 = new TreeMap<>();
        Map<Integer,String> map3 = new TreeMap<>(Collections.reverseOrder());


        //key can't be duplicated
        //value can be duplicated
        //it can't do anything like--order,sorting
        map1.put(5,"John");
        map1.put(10,"Neha");
        map1.put(5,"Java");     //override the value at the 5
        map1.put(7,"Ravi");
        map1.put(8,"Ravi");
        map1.put(18,"ABC");

        //{5=John,10=Neha,8=Ravi,7=Ravi,18=ABC}
        //System.out.println(map1);

        //maintain order
        map2.put(5,"John");
        map2.put(10,"Neha");
        map2.put(5,"Java");     //override the value at the 5
        map2.put(7,"Ravi");
        map2.put(8,"Ravi");
        map2.put(18,"ABC");
        //System.out.println(map2);


        //maintain sorting
        map3.put(5,"John");
        map3.put(10,"Neha");
        map3.put(5,"Java");     //override the value at the 5
        map3.put(7,"Ravi");
        map3.put(8,"Ravi");
        map3.put(18,"ABC");
        System.out.println(map3);
    }
}
