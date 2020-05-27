package com.company.devices;

public class Electric extends Car
{
    public Electric(String producer, String model, int yearOfProduction, Double horsePower)
    {
        super(producer, model, yearOfProduction, horsePower);
    }
    /*(@Override
    public void refuel()
    {
        System.out.println("rich car");
    }*/
    public String toString()
    {
        return "Electric car: " +this.producer+" "+this.model;
    }
}
