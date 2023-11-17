package org.example.collections.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Used when we need to retrieve values quickly
        List<String> arrayList = new ArrayList<>();
        Collection<String> arrayList2 = new ArrayList<>();

        arrayList.add("zero");
        arrayList.add("one");
        arrayList.add("two");


        //These methods come from List interface
        arrayList.get(0);
        //arrayList.remove(1);

        //We can see that these methods doesn't work with a Collection type.
        //arrayList2.get();
        //arrayList2.remove(0);

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("----------Adding 'three' between 'one' and 'two'----------");
        arrayList.add(2, "three");

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("----------Changing 'three' to 'x'----------");
        arrayList.set(2,"x");

        for (String s : arrayList) {
            System.out.println(s);
        }




        //Used when we need to add values between values in the list
        System.out.println("----------LinkedList----------");
        List<String> linkedList = new LinkedList<>();

        linkedList.add("zero");
        linkedList.add("one");
        linkedList.add("two");

        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("----------Adding 'three' between 'one' and 'two'----------");
        linkedList.add(2, "three");

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("----------Changing 'three' to 'x'----------");
        linkedList.set(2,"x");

        for (String s : linkedList) {
            System.out.println(s);
        }

        List<String> listUnmodifiable = List.of("Mateo", "Ivan");
        //listUnmodifiable.add("hola"); //this will throw an exception
        //listUnmodifiable.set(0, "hola"); //this will throw an exception
        System.out.println(listUnmodifiable.size());

    }

}
