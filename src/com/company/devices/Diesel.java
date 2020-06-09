package com.company.devices;

public class Diesel extends Car
{
    public Diesel(String producer, String model, int yearOfProduction, Double horsePower)
    {
        super(producer, model, yearOfProduction, horsePower);
    }
    @Override
    public void refuel()
    {
        System.out.println("rich car");
    }
    public String toString()
    {
        return "Diesel car: "+this.producer+" "+this.model;
    }
}
