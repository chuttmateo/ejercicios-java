package org.example.collections.list.custom;

import java.util.List;

public class Main {
    public static void main(String[] args){

        LinkedList<Integer> custom = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        // Display the initial list
        System.out.println("Initial List:");
        custom.show();
        System.out.println("--------------------");

        // Get and set elements at specific positions
        System.out.println("Get element at index 3: " + custom.get(3));
        System.out.println("Set element at index 3 to 100: " + custom.set(3, 100));
        System.out.println("List after set operation:");
        custom.show();
        System.out.println("--------------------");

        // Restore the original value at position 3 and add an element at a specific position
        custom.set(3, 4);
        custom.add(4, 1000);
        System.out.println("Restored element at index 3 and added 1000 at index 4:");
        custom.show();
        System.out.println("Size: " + custom.size());
        System.out.println("--------------------");

        // Display the list and reduce it by removing an element
        System.out.println("List before removing element at index 4:");
        custom.show();
        custom.remove(4);
        System.out.println("--------------------");
        System.out.println("List after removing element at index 4:");
        custom.show();
        System.out.println("Size: " + custom.size());
    }
}
