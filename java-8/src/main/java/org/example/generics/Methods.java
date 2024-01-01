package org.example.generics;

import java.util.Collection;
import java.util.function.Predicate;

public class Methods {
    public static <T> int countElementsBySpecificProperty(Collection<T> collection, Predicate<T> predicate){
        int count = 0;
        for (T element : collection){
            if (predicate.test(element)){
                count++;
            }
        }
        return count;
    }
}
