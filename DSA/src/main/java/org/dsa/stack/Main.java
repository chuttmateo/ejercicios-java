package org.dsa.stack;

public class Main {
    public static void main(String[] args) {
        //MyStack<Integer> stack = new MyStack<>();
        ArrStack stack = new ArrStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();
        System.out.println("-----------");

        System.out.println(stack.peek());

        System.out.println("-----------");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("-----------");
        stack.printStack();
        System.out.println("-----------");

        System.out.println(stack.size());

        System.out.println("-----------");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();

    }
}
