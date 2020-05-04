package com.company.devices;
public class Car extends Device
{
    public final Double horsePower;

    public Car(String producer, String model, int yearOfProduction, Double horsePower)
    {
        super(producer, model, yearOfProduction);
        this.horsePower = horsePower;
    }
    public String toString()
    {
        return this.producer+" "+this.model;
    }
    public void turnOn()
    {
        System.out.println("LAST ONE RIDE");
    }
}