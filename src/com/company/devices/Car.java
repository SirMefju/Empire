package com.company.devices;

import com.company.DealList;
import com.company.creatures.Human;

import java.util.LinkedList;

public abstract class Car extends Device
{
    public final Double horsePower;
    public static LinkedList<DealList> deals = new LinkedList<DealList>();

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
    public abstract void refuel();
    @Override
    public void turnOn()
    {
        System.out.println("LAST ONE RIDE");
    }
    public static void realDeal(Human seller, Human buyer) {
        if (deals.stream().anyMatch(x -> x.seller.equals(seller) &&  x.buyer.equals(buyer)))
            System.out.println(buyer+" bought car from "+seller);
        else
            System.out.println("false deal");
    }
    public static void wasOwner(Human human) {
        if (deals.stream().anyMatch(x -> x.buyer.equals(human)))
            System.out.println(human + " had a car!");
        else System.out.println(human + " didn't have a car!");
    }
    public static void howManyTransactions() {
        int number = deals.size();
        System.out.println("This car changed its owner " + number + " times");
    }
    public String toString()
    {
        return this.producer;
    }

}