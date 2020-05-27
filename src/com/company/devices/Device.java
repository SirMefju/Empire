package com.company.devices;

public abstract class Device implements Comparable<Car>
{
    public final String producer;
    public final String model;
    public final int yearOfProduction;
    private Double value = 20000.0;

    public Device(String producer, String model, int yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void turnOn();
    public Double getValue()
    {
        return this.value;
    }
    public void setValue(Double value)
    {
        this.value = value;
    }
    public int compareTo(Car otherCar) {
        return (int) (this.yearOfProduction - otherCar.yearOfProduction);
    }
}

