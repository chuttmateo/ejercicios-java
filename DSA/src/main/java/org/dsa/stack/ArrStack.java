package org.dsa.stack;

import java.util.Arrays;

public class ArrStack {
    //With dynamic arr implementation
    private int arrSize = 2; //initial arr size
    private int[] arr = new int[arrSize];
    private int top = 0;

    public void push(int element) {
        if (arrSize == top) {
            //set new arrSize
            arrSize = arrSize * 2;
            arr = Arrays.copyOf(arr, arrSize);
        }
        arr[top++] = element;
    }

    public int peek() {
        if (top == 0) throw new ArrayIndexOutOfBoundsException("Stack is empty");
        return arr[top - 1];
    }

    public int pop() {
        if (top == 0) throw new ArrayIndexOutOfBoundsException("Stack is empty");
        int element = arr[--top];
        arr[top] = 0;
        //shrink the arr
        if (top <= (arrSize / 2) / 2) { // (top <= (arrSize / 2) / 2) equals to (arrSize / 4)
            //set new arrSize
            arrSize = arrSize / 2;
            arr = Arrays.copyOf(arr, arrSize);
        }
        return element;
    }

    public void printStack() {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int size() {
        return top;
    }
}
