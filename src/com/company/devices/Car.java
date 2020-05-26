package com.company.devices;

import com.company.creatures.Animal;
import com.company.creatures.Human;

public class Car extends Device
{
    public final Double horsePower;

    public Car(String producer, String model, int yearOfProduction, Double horsePower   )
    {
        super(producer, model, yearOfProduction);
        this.horsePower = horsePower;
    }
    public void sell(Human buyer, Human seller, Double price) throws Exception
    {
        {
            if (!buyer.hasFreeSpace()) {
                throw new Exception("I don't have space!");
            }
            if (!seller.hasCar(this)) {
                throw new Exception("I don't have a car!");
            }
            if (buyer.cash < price) {
                throw new Exception("I don't have money!");
            }
            buyer.cash-=price;
            seller.cash+=price;
            buyer.addCar(this);
            seller.removeCar(this);
            System.out.println(seller+" take care of him");
            System.out.println(buyer+" just got "+this+" from "+seller);
            System.out.println(seller+"'s account balance: "+seller.cash);
            System.out.println(buyer+"'s account balance: "+buyer.cash);
        }
    }
    //public abstract void refuel();
    @Override
    public void turnOn()
    {
        System.out.println("LAST ONE RIDE");
    }
    public String toString()
    {
        return this.producer;
    }

}