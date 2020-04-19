package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args)
    {
        Human me = new Human();
        me.firstName = "Mateusz";
        me.lastName = "Cieślik";
        me.setSalary(17500.0);

        Animal dog = new Animal("dog");
        Animal lion = new Animal("lion");
        Animal mouse = new Animal("mouse");
        dog.name = "Rondel";
        lion.name = "Leo";
        mouse.name = "Mouse";
        me.pet = dog;

        Car cleanOne = new Car("Tesla", "Model S", 730.0);
        cleanOne.setValue(200000.0);
        me.setCar(cleanOne);

        /* console */
        System.out.println("Hello "+me.firstName+"!");
        dog.feed();
        for(int i=1; i<4; i++)
            dog.walk();
        System.out.println("Mateusz's salary: "+me.getSalary());
        System.out.println("Tesla's value: "+cleanOne.getValue());
        System.out.println(me.getCar().producer);
    }
}