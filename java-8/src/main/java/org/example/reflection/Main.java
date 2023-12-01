package org.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("//name of class methods-------------");
        m2();
        System.out.println("//Class name-----------");
        m1();
        */

        /*System.out.println("Creating an instance from Person");
        try {
            m3();
        }catch (Exception e ){
            e.printStackTrace();
        }*/

        /*System.out.println("Creating an instance from Person");
        try {
            m4();
        }catch (Exception e ){
            e.printStackTrace();
        }

        System.out.println("setting a value to a field");
        try {
            m5();
        }catch (Exception e ){
            e.printStackTrace();
        }

        System.out.println("get Interfaces name");
        try {
            m6();
        }catch (Exception e ){
            e.printStackTrace();
        }*/

        printMethodsFromAClass(Person.class);


    }
    public static void m1(){
        Class<Person> clazz = Person.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
    }
    public static void m2(){
        Class<Person> clazz = Person.class;
        Method[] methods =  clazz.getMethods();
        Arrays.stream(methods)
                .forEach(m -> System.out.println("Method name is: " + m.getName()));
    }

    public static void m3() throws Exception {
        Class<Person> clazz = Person.class;
        Person instance = clazz
                .getDeclaredConstructor(String.class, String.class)
                .newInstance("mateo", "chutt");

        System.out.println(instance.getFirstName());
    }

    public static void m4() throws Exception {
        Class<Person> clazz = Person.class;
        //we need a constructor without parameters to create an empty instance
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method printSomething = clazz.getMethod("printSomething", String.class);
        printSomething.invoke(instance, "Hello reflection");
    }

    public static void m5() throws Exception {
        Class<?> clazz = Person.class;
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Field field =  clazz.getDeclaredField("firstName");
        field.setAccessible(true);

        System.out.println("Field's value: " + field.get(instance));
        field.set(instance, "Mateo");
        System.out.println("Field's value: " + field.get(instance));

    }

    public static void m6(){
        Class<?> clazz = Person.class;
        Class<?>[] interfaces = clazz.getInterfaces();
        Arrays.stream(interfaces)
                .forEach(i -> System.out.println(i.getSimpleName()));
    }

    public static void printMethodsFromAClass(Class<?> clazz){
        Method[] methods =  clazz.getMethods();
        Arrays.stream(methods)
                .forEach(method -> System.out.println(method.getName()));
    }

}
