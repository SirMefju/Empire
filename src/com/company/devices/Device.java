package com.company.devices;

public abstract class Device
{
    public final String producer;
    public final String model;
    public final int yearOfProduction;
    private Double value = 2000.0;

    public Device(String producer, String model, int yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Double getValue()
    {
        return this.value;
    }
    public void setValue(Double value)
    {
        this.value = value;
    }
}

