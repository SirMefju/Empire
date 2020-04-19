package com.company.devices;

public class Phone extends Device
{
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, boolean isAndroid)
    {
        super(producer, model);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }
}