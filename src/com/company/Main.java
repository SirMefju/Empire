package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Mateusz";
        me.lastName = "Cieślik";
        me.setSalary(17500.0);
        me.cash = 150000.0;

        Human sister = new Human();
        sister.firstName = "Magda";
        sister.lastName = "Cieślik";
        sister.setSalary(12500.0);
        sister.cash = 5000.0;

        Pet dog = new Pet("dog");
        Pet lion = new Pet("lion");
        Pet mouse = new Pet("mouse");
        FarmAnimal pig = new FarmAnimal("pig");
        dog.name = "Rondel";
        lion.name = "Leo";
        mouse.name = "Mouse";
        pig.name = "Peppa";
        me.pet = dog;

        Phone smartPhone = new Phone("Apple","iPhone",2020,4.7,false);
        me.phone = smartPhone;

        Car dirtyOne = new Car ("Mercedes", "SEC", 1970,300.0);
        Car cleanOne = new Car("Tesla", "Model S", 2019,730.0);
        dirtyOne.setValue(90000.0);
        cleanOne.setValue(200000.0);

        /* console */
        System.out.println("Hello "+me.firstName+"!");
        lion.feed();
        dog.feed(1.0);
        for(int i=1; i<4; i++)
            dog.walk();
        System.out.println("Mateusz's salary: "+me.getSalary());
        System.out.println("Tesla's value: "+cleanOne.getValue());
        me.setCar(cleanOne);
        System.out.println(cleanOne);
        cleanOne.turnOn();
        System.out.println(smartPhone);
        smartPhone.turnOn();

        dog.sell(sister,me,1500.0);
        System.out.println(sister+" your animal is: "+sister.pet.species);
        lion.sell(me,sister, 3000.0);

        cleanOne.sell(sister,me,90000.0);
        System.out.println(me+" your car still is: " +me.getCar());
        System.out.println(me+"'s account balance: "+me.cash);

        smartPhone.sell(sister,me,500.0);

        pig.beEaten();

    }
}