package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device
{
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, int yearOfProduction, Double screenSize, boolean isAndroid)
    {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }
    public void turnOn()
    {
        System.out.println("so call me maybe");
    }
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.phone == this && price <= buyer.cash)
        {
            buyer.cash-=price;
            seller.cash+=price;
            buyer.phone = this;
            seller.phone = null;
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
    public String toString()
    {
        return this.producer+" "+this.model;
    }
}