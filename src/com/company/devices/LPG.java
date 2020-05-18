package com.company.devices;

public class LPG extends Car
{
    public LPG(String producer, String model, int yearOfProduction, Double horsePower)
    {
        super(producer, model, yearOfProduction, horsePower);
    }
    /*@Override
    public void refuel()
    {
        System.out.println("rich car");
    }*/
    public String toString()
    {
        return "Your LPG car: " +this.producer+" "+this.model;
    }
}
