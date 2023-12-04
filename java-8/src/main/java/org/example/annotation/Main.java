package org.example.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {

        Class<Rabbit> rabbitClass = Rabbit.class;

        Constructor<Rabbit> declaredConstructor = rabbitClass.getDeclaredConstructor();
        Rabbit rabbit = declaredConstructor.newInstance();

        System.out.println("Rabbit Breed: " + rabbit.getBreed());
        System.out.println("Rabbit Color: " + rabbit.getColor());


        Field[] fields = rabbitClass.getDeclaredFields();
        Arrays.stream(fields)
                .forEach(field -> {
                    Set declaredAnnotation = field.getDeclaredAnnotation(Set.class);

                    if (declaredAnnotation == null) return;

                    String annotationValue = declaredAnnotation.value();
                    System.out.println("Annotation value: " + annotationValue);

                    field.setAccessible(true);
                    try {
                        field.set(rabbit, annotationValue);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });

            System.out.println("Rabbit Breed: " + rabbit.getBreed());
            System.out.println("Rabbit Color: " + rabbit.getColor());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
