package org.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Used when we need to retrieve values quickly
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("zero");
        arrayList.add("one");
        arrayList.add("two");

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




    }

}
