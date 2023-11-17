package org.example.collections.list.custom;

import java.util.*;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;


    class Node<T>{
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedList() {
    }

    public LinkedList(Collection<T> c) {
        this();
        addAll(c);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean add(T t) {

        Node<T> n = new Node<>(t, null);
        if (head == null){
            head = n;
        }else {
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = n;
        }
        size++;
        return true;

    }

    public void show(){
        Node<T> current = head;
        System.out.println(current.data);
        while (current.next != null){
            current = current.next;
            System.out.println(current.data);
        }
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;
        while (current != null){
            if (o.equals(current.data)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> current = head;
        if (current == null) return false;
        if (current.data.equals(o)){
            head = head.next;
            return true;
        }
        while (current.next != null){
            if (o.equals(current.next.data)){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T t : c) {
            add(t);
        }
        return true;
    }

    //it doesn't work correctly
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {

        isIndexValid(index);

        int numNew = c.toArray().length;

        if (numNew == 0) return false;

        Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node<T> node = current.next;

            for (T t : c) {
                    current.next = new Node<>(t, null);
                    current = current.next;
            }

        current.next = node;

        size += numNew;
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        isIndexValid(index);
        if (head == null) return null;
        return getCurrentNodeByIndex(index).data;
    }

    @Override
    public T set(int index, T element) {
        isIndexValid(index);
        getCurrentNodeByIndex(index).data = element;
        return element;
    }

    @Override
    public void add(int index, T element) {
        isIndexValid(index);
        if(index == 0){
            head = new Node<>(element, head);
        }else {
            Node<T> prev = getCurrentNodeByIndex(index - 1);
            prev.next = new Node<>(element, prev.next);
        }
        size++;
    }

    @Override
    public T remove(int index) {
        isIndexValid(index);
        if(index == 0){
            head = head.next;
        }else {
            Node<T> prev = getCurrentNodeByIndex(index - 1);
            prev.next = prev.next.next;
        }
        size--;


        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    private void isIndexValid(int index){
        if ((index >= size || index < 0)) throw new IndexOutOfBoundsException("index out of bounds");
    }

    private Node<T> getCurrentNodeByIndex(int index){
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

}
