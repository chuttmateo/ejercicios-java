package org.dsa.queue;

import java.util.LinkedList;
import java.util.List;


public class MyQueue<T>{
    private final List<T> elements = new LinkedList<>();

    public void enQueue(T element) {
        elements.add(element);
    }

    public T deQueue(){
        if (elements.size() <= 0) throw new IndexOutOfBoundsException("Queue is empty");
        return elements.remove(0);
    }

    public int size() {
        return elements.size();
    }
}
