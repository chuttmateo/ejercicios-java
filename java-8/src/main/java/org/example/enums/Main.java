package org.example.enums;

public class Main {
    public static void main(String[] args) {

        Level level = Level.EASY;

        switch (level){
            case EASY:
                System.out.println("The level is easy");
                break;
            case NORMAL:
                System.out.println("The level is normal");
                break;
            case HARD:
                System.out.println("The level is hard");
                break;
        }

        System.out.println(" ---- Complex Enum ---- ");

        for (ComplexLevel value : ComplexLevel.values()) {
            System.out.println(value.printValue());
        }

    }
}
