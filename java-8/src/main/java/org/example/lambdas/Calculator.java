package org.example.lambdas;
@FunctionalInterface
public interface Calculator<T> {
    T calculate(T x, T y);
}
