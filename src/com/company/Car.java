package com.company;
public class Car
{
    public final String producer;
    public final String model;
    public final Double horsePower;
    public String plates;

    public Car(String producer, String model, Double horsePower, String plates)
    {
        this.producer = producer;
        this.model = model;
        this.horsePower = horsePower;
        this.plates = plates;
    }
}