package org.dsa.stack;

import java.util.LinkedList;
import java.util.List;

public class MyStack<T> {
    //implementation using linkedList
    List<T> internalList = new LinkedList<>();
    private int top = 0 ;

    public void push(T element){
        internalList.add(element);
        top++;
    }
    public T pop(){
        int index = --top; // (top--) to get the top index and, after it, subtract 1
        T element = internalList.get(index);
        internalList.remove(index);
        return element;
    }
    public T peek(){
        return internalList.get(top-1);
    }
    public void printStack(){
        internalList.forEach(System.out::println);
    }

    public int size(){
        return top;
    }
}
