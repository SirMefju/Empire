package com.company.devices;

public class Device
{
    public final String producer;
    public final String model;
    private Double value = 2000.0;

    public Device(String producer, String model)
    {
        this.producer = producer;
        this.model = model;
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

