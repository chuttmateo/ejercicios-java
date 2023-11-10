package org.example.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*HashMap: This implementation does not guarantee the order of its elements.
        The order of elements can change over time as elements are added or removed.
        It provides constant-time performance for basic operations such as adding, removing, and looking up elements.

        LinkedHashMap: Unlike HashMap, LinkedHashMap maintains the order in which elements were inserted.
        It uses a doubly-linked list to keep track of the order, and thus,
        iterating over a LinkedHashMap will produce elements in the order they were added.

        TreeMap: This implementation sorts its key-value pairs based on the natural ordering of the keys
        or using a custom comparator provided at the time of creation.
        The keys must either implement the Comparable interface, or a custom comparator must be supplied.
        As a result, when you iterate over a TreeMap, the elements will be ordered based on the keys.*/
        System.out.println("HashMap doesn't guarantee order of its elements insertion");
        Map<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("sdf", 3);
        hm.put("d", 4);
        hm.put("easdf", 5);
        hm.put("f", 6);
        hm.put("g", 7);
        for (Map.Entry<String, Integer> entry: hm.entrySet() ){
            System.out.println(entry.getKey().hashCode() + " " + entry);
        }
        hm.put("h", 8);
        hm.put("sd", 9);
        hm.put("fsdf", 10);
        hm.put("g3", 11);

        System.out.println("second for-each print");
        for (Map.Entry<String, Integer> entry: hm.entrySet() ){
            System.out.println(entry.getKey().hashCode() + " " + entry);
        }


        System.out.println("LinkedHashMap guarantee insertion order");
        Map<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("a", 1);
        lhm.put("b", 2);
        lhm.put("sdf", 3);
        lhm.put("d", 4);
        lhm.put("easdf", 5);
        lhm.put("f", 6);
        lhm.put("g", 7);
        for (Map.Entry<String, Integer> entry: lhm.entrySet() ){
            System.out.println(entry.getKey().hashCode() + " " + entry);
        }

        lhm.put("h", 8);
        lhm.put("sd", 9);
        lhm.put("fsdf", 10);
        lhm.put("g3", 11);

        System.out.println("second for-each print");
        for (Map.Entry<String, Integer> entry: lhm.entrySet() ){
            System.out.println(entry.getKey().hashCode() + " " + entry);
        }

        System.out.println("TreeMap sort its key-value pair by key order, the key should implement Comparable<T>");
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("g", 1);
        tm.put("f", 2);
        tm.put("e", 3);
        tm.put("zzz", 4);
        tm.put("c", 5);
        tm.put("b", 6);
        tm.put("a", 7);

        for (Map.Entry<String, Integer> entry: tm.entrySet() ){
            System.out.println(entry.getKey().hashCode() + " " + entry);
        }

        System.out.println("TreeMap sorting by custom comparator");
        Map<String, Integer> tmCustomComparator = new TreeMap<>(new CustomComparator());

        tmCustomComparator.put("g", 1);
        tmCustomComparator.put("fasdffsdas", 2);
        tmCustomComparator.put("easdfsadfsadf", 3);
        tmCustomComparator.put("zsadfsadfsfdzz", 4);
        tmCustomComparator.put("csdfsdaf", 5);
        tmCustomComparator.put("bs324", 6);
        tmCustomComparator.put("assss", 7);

        for (String key : tmCustomComparator.keySet()) {
            System.out.println(key + "=" + tmCustomComparator.get(key));
        }
        for (Map.Entry<String, Integer> entry : tmCustomComparator.entrySet()) {
            // code
            //entry.getKey();
            //entry.getValue();
        }
        for ( Integer value : tmCustomComparator.values()){
            //code
            // value
        }

    }
}
