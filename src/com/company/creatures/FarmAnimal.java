package com.company.creatures;

public class FarmAnimal extends Animal
{
    public FarmAnimal(String species) {
        super(species);
    }
    public FarmAnimal(String species, Double weight)
    {
        super(species);
        this.weight = weight;
    }
}
