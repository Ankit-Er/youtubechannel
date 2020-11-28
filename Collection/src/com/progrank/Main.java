package com.progrank;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Collection<E>(I) --> Set(I),Queue(I),List(I)

        //List(I) --> Vector(C),ArrayList(C),LinkedList(C)
                      //Vector(C)--> Stack(C)  //legacy 1.0

        //Queue(I) --> Deque(I),BlockingQueue(C),PriorityQueue(C)
                     //BlockingQueue(C) --> LinkedBlockingQueue(C),PriorityBlockingQueue(C)

        //Set(I) --> HashSet(C),SortedSet(I)
                    //HashSet(C)--> LinkedHashSet(C)
                                //SortedSet(I) -->NavigableSet(I) --> TreeSet(C)

        //Map<K,V>(I) --> HashMap(C),WeakHashMap(C),Hashtable(C),IdentityHashMap(C),SortedMap(I)
        //HashMap(C) --> LinkedHashMap(C)
        //Hashtable(C) --> Properties(C)    ///Hashtable also extends Dictionary(AC)
        ////SortedMap(I) -->NavigableMap(I) --> TreeMap(C)
        
    }
}
