package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

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

        Phone smartPhone = new Phone("Apple","iPhone",4.7,false);
        me.phone = smartPhone;

        Car dirtyOne = new Car ("Mercedes", "SEC", 300.0);
        Car cleanOne = new Car("Tesla", "Model S", 730.0);
        cleanOne.setValue(200000.0);
        dirtyOne.setValue(90000.0);

        /* console */
        System.out.println("Hello "+me.firstName+"!");
        dog.feed();
        for(int i=1; i<4; i++)
            dog.walk();
        System.out.println("Mateusz's salary: "+me.getSalary());
        System.out.println("Tesla's value: "+cleanOne.getValue());
        me.setCar(cleanOne);

        System.out.println(cleanOne);
        System.out.println(dirtyOne);
        System.out.println(dog);
        System.out.println(me);
        System.out.println(smartPhone);
    }
}