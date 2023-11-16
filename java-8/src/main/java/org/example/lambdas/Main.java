package org.example.lambdas;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // with lambda expression we can Implement functional interfaces directly in line, without a new class to implement this method.
        IWork work = () -> System.out.println("i'm working");
        work.work();

        Calculator<Integer> add = (a, b) -> a + b;
        Calculator<Integer> substract = (a, b) -> a - b;

        System.out.println(add.calculate(133, 67));
        System.out.println(substract.calculate(100, 10));

    }
}