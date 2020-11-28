package arraylist1;

import java.util.*;

public class Main {

    /*
     *  1) "null" insertion is allowed
     *  2) ArrayList is having default capacity --- 10
     *  3) Enlarge the default capacity automatically by adding the value
     *     (ArrayList create a new array with another value of the length)
     *  4) Not good for frequent changes like remove,add at specific index.
     *  5) for searching is good
     *  6) ArrayList use behind array
     *  7) it's not a synchronized (not thread-safe)
     *  8) Random access is possible based on index (it's implemented RandomAccess interface)
     *  9) it can store heterogeneous values in non-generic ArrayList
     *  10) it's implemented Cloneable & Serializable interface
     */

    public static void main(String[] args) {

        ArrayList lst = new ArrayList();
        lst.add("progrank");
        lst.add(55);
        lst.add(null);

        System.out.println(lst.get(1)); //O(1)

        //Initialization
        List<String> lst1 = Arrays.asList("BBB","AAA","CCC","AAA");
        Collection<String> lst2 = Arrays.asList("AAA","BBB","CCC");

        //it might be supported in jdk 13
        //ArrayList<String> lst3 = Arrays.asList("AAA","BBB","CCC");

        //Empty
        List<Integer> lst3 = new ArrayList<>();
        //ADD
        lst3.add(45);   //0

        lst3.add(24);   //1
        //System.out.println(lst3.size());

        lst3.add(40);   //2

        //System.out.println(lst3.size());
        //ArrayList can store duplicates elements
        lst3.add(50);   //3

        //int[] arr = {45,13,24,50,40};
        //System.out.println(arr[8]);    //ArrayIndexOutOfBoundsException

        //System.out.println(lst3);   //[45,13,24,50,40]
        //System.out.println(arr);    //Integer;@fjf4dfsd5        //[I@fjdl4fs4

        //get() --fetch
        //System.out.println(lst3.get(9));    //IndexOutOfBoundsException

        //length
        //System.out.println(lst3.size());

        /*for(int i=0; i<lst3.size();i++){
            System.out.println(lst3.get(i));
        }*/

       /* for(Integer val : lst3){
            System.out.println(val);
        }*/

        /*Iterator<Integer> iterator = lst3.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());  //fetch+move to next index*/

        //lst3.forEach(x-> System.out.println(x));
        //lst3.forEach(System.out::println);

        //remove elements
        //lst3.remove(1);
        //System.out.println(lst3);

        //return the index of first occur...of value or object
        //System.out.println(lst1.indexOf("AAA"));

        //System.out.println(lst1.lastIndexOf("AAA"));

        //replace value or object
        /*System.out.println(lst3);
        lst3.set(0,35);
        System.out.println(lst3);*/

        //contains
        //System.out.println(lst1.contains("progrank"));

        //addAll
        /*System.out.println(lst3);

        List<Integer> lst4  = Arrays.asList(1,2);

        lst3.addAll(lst4);

        System.out.println(lst3);*/

        //remove first occur....element
        ArrayList<Integer> lst4 = new ArrayList<>();
        //ADD
        lst4.add(45);
        lst4.add(40);
        lst4.add(24);
        lst4.add(40);
        lst4.add(50);
        /*System.out.println(lst4);
        lst4.remove((Integer)40);
        System.out.println(lst4);*/



    }
}
