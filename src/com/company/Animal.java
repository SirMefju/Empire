package com.company;

public class Animal {
    final String species;
    String name;
    private Double weight = 10.0;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.5;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    void feed() {
        switch (species) {
            case "dog":
                System.out.println("Rondel: Feed me!");
                break;
            case "lion":
                System.out.println("Leo: Feed me!");
                break;
            case "mouse":
                System.out.println("Mouse: Feed me!");
                break;
        }
        //console
        weight++;
        System.out.println("Thx for food!");
        System.out.println(species + " weight: " + this.weight);
    }

    void walk() {
        switch (species) {
            case "dog":
                System.out.println("Rondel: Take me for walk!");
                break;
            case "lion":
                System.out.println("Leo: Take me for walk!");
                break;
            case "mouse":
                System.out.println("Mouse: Take me for walk!");
                break;
        }
        //console
        weight--;
        System.out.println("Thx man!");
        System.out.println(species + " weight: " + this.weight);
        if (this.species.equals("dog") && weight < 9.0) {
            System.out.println("This pet die, you are freak!");
        } else if (this.species.equals("lion") && weight < 180.0) {
            System.out.println("This pet die, you are freak!");
        } else if (this.species.equals("mouse") && weight < 0.4) {
            System.out.println("This pet die, you are freak!");
        }
        //equals is like ==
    }
    public String toString()
    {
        return this.species + " " + this.name;
    }
}