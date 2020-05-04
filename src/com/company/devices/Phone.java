package com.company.devices;

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
    public void turnOn() {
        System.out.println("so call me maybe");
    }
    public String toString()
    {
        return this.producer+" "+this.model;
    }
}