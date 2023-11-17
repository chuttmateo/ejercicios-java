package org.example.collections.list.custom;

import java.util.List;

public class Main {
    public static void main(String[] args){

        LinkedList<Integer> custom = new LinkedList<>(List.of(1,2,3,4,5));

        /*custom.addAll(List.of(1,2,3,4,5));*/

        /*custom.add(1);
        custom.add(2);
        custom.add(3);
        custom.add(4);
        custom.add(5);*/


        custom.show();
        System.out.println(custom.remove(Integer.valueOf(0)));
        System.out.println(custom.remove(Integer.valueOf(1)));
        System.out.println(custom.remove(Integer.valueOf(3)));
        System.out.println(custom.remove(Integer.valueOf(5)));
        System.out.println(custom.remove(Integer.valueOf(6)));
        custom.show();
    }
}
