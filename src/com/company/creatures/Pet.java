package com.company.creatures;

public class Pet extends Animal {
    private static final double DEFAULT_FOOD_WEIGHT = 0.5;
    public Pet(String species) {
        super(species);
    }
    public String toString()
    {
        return this.species + " " + this.name;
    }

    @Override
    public void feed()
    {
        feed(DEFAULT_FOOD_WEIGHT);
    }
}
