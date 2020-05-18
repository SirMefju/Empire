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
    public void sell(Human buyer, Human seller, Double price)
    {
        if (seller.getCar() == this && price <= buyer.cash)
        {
            buyer.cash-=price;
            seller.cash+=price;
            buyer.setCar(this);
            seller.setCar();
            System.out.println(seller+" take care of him");
            System.out.println(buyer+" just got "+this+" from "+seller);
            System.out.println(seller+"'s account balance: "+seller.cash);
            System.out.println(buyer+"'s account balance: "+buyer.cash);
        }
        else if (buyer.cash < price)
        {
            System.out.println(buyer+" you don't have enough money!");
        }
        else
        {
            System.out.println("You don't have "+this+", "+seller);
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