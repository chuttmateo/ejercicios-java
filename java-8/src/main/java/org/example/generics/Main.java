package org.example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Bounded Type Parameters = for instance, <T extends Number>

        Box<String, Integer> box = new Box<>();
        System.out.println(box.getObject());
        box.setObject("laptop");
        System.out.println(box.getObject());

        box.foo(100);

        /* //Raw type
        Box boxraw = new Box();
        boxraw.setObject("phone");
        System.out.println(boxraw.getObject());*/

        Box<Integer, Integer> bii = new Box<>();
        //Box<Integer, Integer> is not a subtype of Box<Number, Number> even though Integer is a subtype of Number.
        //boxTest(bii);

        boxTest2(bii);

        String s = foo("hola");

        String i = (String) bar("bar");

        // <? extends Integer> is used when you only need to access elements (read) and
        // <? super Integer> is used when you need to modify the list (write).

        List<String> l1 = new ArrayList<>();
        l1.add("sadf");
        l1.add("sdfsdf");
        printList(l1);

        List<Integer> l2 = List.of(1, 2, 3, 4, 5, 6);
        printList(l2);

        List<Object> l3o = new ArrayList<>();
        l3o.add("sadf");
        l3o.add(100);
        printListSuperInteger(l3o);
    }

    public static <T> T foo(T t){
        return t;
    }
    public static Object bar(Object o){
        return o;
    }
    public static void boxTest(Box<Number, Number> n) { /* ... */ }
    public static void boxTest2(Box<? extends Number, ? extends Number> n) { /* ... */ }


    public static void printList(List<?> list){
        for (Object element: list) {
            System.out.println(element);
        }
    }
    public static void printListSuperInteger(List<? super Integer> list){
        for (Object element: list) {
            System.out.println(element);
        }
    }
}
