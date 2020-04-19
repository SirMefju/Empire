package com.company;

public class Main {

    public static void main(String[] args)
    {
        Human me = new Human();
        me.firstName = "Mateusz";
        me.lastName = "Cieślik";

        Animal dog = new Animal("dog");
        Animal lion = new Animal("lion");
        Animal mouse = new Animal("mouse");
        dog.name = "Rondel";
        lion.name = "Leo";
        mouse.name = "Mouse";
        me.pet = dog;

        Car tesla = new Car("Tesla", "Model S", 730.0, "GD 947WH");
        me.car = tesla;


        /* console */
        System.out.println("Hello "+me.firstName+"!");
        System.out.println("Your car is "+me.car.producer+" with "+me.car.horsePower+" HP!");
        dog.feed();
        for(int i=1; i<4; i++)
            dog.walk();
    }
}