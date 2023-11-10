package org.example.generics;

public class Box<T, V extends Number> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    /*
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + object.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }*/

    public void foo(V v){
        System.out.println(v);
    }
}
