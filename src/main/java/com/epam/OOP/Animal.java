package com.epam.OOP;

public class Animal {

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.getDescription());
        Animal bird = new Bird();
        System.out.println(bird.getDescription());
        Animal fly = new Animal("black", 6, false);
        System.out.println(fly.getDescription());
    }

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %d paw%s and %s fur.",
                color,
                numberOfPaws,
                numberOfPaws > 1 ? "s" : "",
                hasFur ? "a" : "no");
    }
}
