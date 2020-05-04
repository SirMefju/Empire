package com.company.creatures;

import com.company.devices.Salleable;

public class Animal implements Salleable {
    public final String species;
    public String name;
    protected Double weight = 10.0;

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

    public void feed() {
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

    public void walk() {
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

    public void sell(Human buyer, Human seller, Double price) throws Exception
    {
        if (this instanceof Human)
        {
            throw new Exception("you are sick");
        }
        if (seller.pet == this && price <= buyer.cash)
        {
            buyer.cash-=price;
            seller.cash+=price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println(seller+" take care of him");
            System.out.println(buyer+" just got "+this+" from "+seller);
            System.out.println(seller+"'s account balance: "+seller.cash);
            System.out.println(buyer+"'s account balance: "+buyer.cash);
        }
        else if (buyer.cash < price)
        {
            System.out.println(buyer+" you don't have enough money");
        }
        else
        {
            System.out.println("You don't have "+this+", "+seller);
        }
    }
    public String toString()
    {
        return this.species + " " + this.name;
    }
}