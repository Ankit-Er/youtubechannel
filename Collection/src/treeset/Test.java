package treeset;

import java.util.*;
import java.util.stream.Collectors;


//difference b/w Comparable v/s Comparator interface
public class Test {

    /*
     * TreeSet is represented by Red-Black tree
     * TreeSet is not a thread-safe
     * TreeSet use default natural ordering
     */
    public static void main(String[] args) {

        Set<Person> set = new TreeSet<>();  //sorted
        set.add(new Person("Rohan",22));
        set.add(new Person("Riya",19));
        set.add(new Person("Neha",26));
        set.add(new Person("Yaman",35));
        set.add(new Person("Amit",40));

        //System.out.println(set);


        /*
         * Comparable ===> compareTo(T ob);
         * Comparator ===> compare(T ob1,T ob1);
         */

        //just imagine MyStudent class is coming from a jar file....

        Comparator<MyStudent> c = (ob1,ob2) -> ob1.getRollNo() - ob2.getRollNo();
        Comparator<MyStudent> c2 = (ob1,ob2) -> ob1.getName().compareTo(ob2.getName());


        Set<MyStudent> s = new TreeSet<>(c2);
        s.add(new MyStudent("Neha",1005));
        s.add(new MyStudent("Riya",1002));
        s.add(new MyStudent("Yaman",1007));
        s.add(new MyStudent("Abhi",1003));
        s.add(new MyStudent("Rohan",1001));
        s.add(new MyStudent("John",1009));

        System.out.println(set);

    }
}
