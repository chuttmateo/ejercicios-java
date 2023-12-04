package org.example.annotation;

import java.util.Objects;

public class Rabbit {
    @Set(value = "White")
    private String color;
    @Set(value = "Rex")
    private String breed;
    private int age;

    public Rabbit(String color, String breed, int age) {
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public Rabbit() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit rabbit = (Rabbit) o;
        return age == rabbit.age && Objects.equals(color, rabbit.color) && Objects.equals(breed, rabbit.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, breed, age);
    }
}
