package listandset;

import java.util.*;

public class Main {
    /*
        list 			vs   		set
        ----------------------------------------------
        indexed	    				not indexed
        ordered 					not ordered always
        duplicate allowed		    doesn't allow duplicate

    */

    public static void main(String[] args) {

        //System.out.println("List Collection...");
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("5");
        list.add("3");
        list.add("4");
        list.add("1");
        list.add("2");

        //System.out.println(list);


       System.out.println("Set Collection...");
        //Set<String> set = new HashSet<>();  //not oredered & sorted
        Set<String> set = new LinkedHashSet<>();  //oredered
        set.add("2");
        set.add("5");
        set.add("3");
        set.add("33");
        set.add("13");
        set.add("55");
        set.add("4");
        set.add("1");
        set.add("2");

        //System.out.println(set);

        //System.out.println(getSortedSet());  //sorted

        //Set<Integer> s1 = Set.of(1,2,3,4,6,2);  //java.lang.IllegalArgumentException
        Set<Integer> s1 = Set.of(1,2,3,4,6);
        System.out.println(s1);


    }

    public static SortedSet<Integer> getSortedSet(){
        SortedSet<Integer> set = new TreeSet<>();  //sorted
        set.add(2);
        set.add(22);
        set.add(12);
        set.add(45);
        set.add(102);
        set.add(450);
        set.add(20);
        return set;
    }

}
