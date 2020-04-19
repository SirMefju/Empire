package com.company.devices;
public class Car extends Device
{
    public final Double horsePower;

    public Car(String producer, String model, Double horsePower)
    {
        super(producer, model);
        this.horsePower = horsePower;
    }
    public String toString()
    {
        return this.producer+" "+this.model;
    }
}