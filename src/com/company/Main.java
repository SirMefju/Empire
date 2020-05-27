package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        Human me = new Human(3,2);
        me.firstName = "Mateusz";
        me.lastName = "Cieślik";
        me.setSalary(17500.0);
        me.cash = 150000.0;
        me.farm = new FarmAnimal[3];
        me.farm[0] = new FarmAnimal("pig",600.0);
        me.farm[1] = new FarmAnimal("cow",1500.0);
        me.farm[2] = new FarmAnimal("horse",400.0);
        me.garage = new Car[2];
        me.garage[0] = new Car("Tesla", "Model S", 2019, 730.0);
        me.garage[1] = new Car("BMW", "E46", 2006,215.0);

        Human sister = new Human(15,4);
        sister.firstName = "Magda";
        sister.lastName = "Cieślik";
        sister.setSalary(12500.0);
        sister.cash = 50000.0;
        sister.farm = new FarmAnimal[15];
        sister.garage = new Car[2];
        sister.garage[0] = new Car("Mercedes", "SEC", 1970,300.0);

        Pet dog = new Pet("dog");
        Pet lion = new Pet("lion");
        Pet mouse = new Pet("mouse");
        FarmAnimal pig = new FarmAnimal("pig",600.0);
        FarmAnimal cow = new FarmAnimal("cow", 1500.0);
        FarmAnimal horse = new FarmAnimal("horse", 400.0);
        dog.name = "Rondel";
        lion.name = "Leo";
        mouse.name = "Mouse";
        pig.name = "Peppa";
        cow.name = "Milka";
        me.pet = dog;

        Phone smartPhone = new Phone("Apple","iPhone",2020,4.7,false);
        me.phone = smartPhone;

        Diesel dirtyOne = new Diesel ("Mercedes", "SEC", 1970,300.0);
        Electric cleanOne = new Electric("Tesla", "Model S", 2019,730.0);
        LPG smellyOne = new LPG("BMW", "E46", 2006,215.0);
        dirtyOne.setValue(90000.0);
        cleanOne.setValue(200000.0);
        smellyOne.setValue(15000.0);

        /* console */
        System.out.println("Hello "+me+"!");
        lion.feed();
        dog.feed(1.0);
        for(int i=1; i<4; i++)
            dog.walk();
        System.out.println("Mateusz's salary: "+me.getSalary());
        System.out.println("Tesla's value: "+cleanOne.getValue());
        me.setCar(cleanOne,0);
        me.setCar(smellyOne,1);
        System.out.println(cleanOne);
        cleanOne.turnOn();
        System.out.println(smartPhone);
        smartPhone.turnOn();
        dog.sell(sister,me,1500.0);
        System.out.println(sister+" your animal is: "+sister.pet.species);
        lion.sell(me,sister, 3000.0);
        /*cleanOne.sell(sister,me,90000.0); // exception
        System.out.println(me+" your car still is: " +me.getCar(0));*/
        smartPhone.sell(sister,me,500.0);
        /* cleanOne.refuel(); */
        sister.phone.installAnApp("WhatsApp");
        sister.phone.installAnApp("WhatsApp",4.34);
        sister.phone.installAnApp("GitHub",3.21,"github.com");
        Arrays.sort(me.farm);
        for(int i = 0; i<me.farm.length;i++)
        {
            System.out.println(me.farm[i]);
        }
        pig.beEaten();
        Arrays.sort(me.garage);
        for(int i = 0; i<me.garage.length;i++)
        {
            System.out.println(me.garage[i]);
        }
        System.out.println("Mateusz's garage value: "+me.garageValue());
        System.out.println("Magda's garage value: "+sister.garageValue());
        smellyOne.sell(sister,me,10000.0);
        System.out.println("Mateusz's garage value: "+me.garageValue());
        System.out.println("Magda's garage value: "+sister.garageValue());
        Arrays.sort(sister.garage);
        for(int i = 0; i<me.garage.length;i++)
        {
            System.out.println(sister.garage[i]);
        }

    }
}