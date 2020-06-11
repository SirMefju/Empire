package com.company.devices;

import com.company.creatures.Human;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Phone extends Device
{
    public final Double screenSize;
    public final boolean isAndroid;
    public HashSet<Application> Applications = new HashSet<>();

    public Phone(String producer, String model, int yearOfProduction, Double screenSize, boolean isAndroid)
    {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }
    @Override
    public void turnOn()
    {
        System.out.println("so call me maybe");
    }
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.phone == this && price <= buyer.cash)
        {
            buyer.cash-=price;
            seller.cash+=price;
            buyer.phone = this;
            seller.phone = null;
            System.out.println(seller+" take care of him");
            System.out.println(buyer+" just got "+this+" from "+seller);
            System.out.println(seller+"'s account balance: "+seller.cash);
            System.out.println(buyer+"'s account balance: "+buyer.cash);
        }
        else if (buyer.cash < price)
        {
            System.out.println(buyer+" you don't have enough money!");
        }
        else
        {
            System.out.println("You don't have "+this+", "+seller);
        }
    }

    public void installAnApp(Human owner, Application application) {
        if (owner.cash >= application.price) {
            Applications.add(application);
            owner.cash -= application.price;
            System.out.println("New application: " + application);
        }
    }

    public void installAnApp(Human owner, Application[] applications) {
        for (int i = 0; i < applications.length; i++) {
            Application application = applications[i];
            installAnApp(owner, application);
        }
    }

    public void isAppInstalled(Application application) {
        if (Applications.contains(application))
            System.out.println(application + " is installed");
        else System.out.println(application + " is not installed");
    }

    public void isAppInstalled(String appName) {
        if (Applications.stream().anyMatch(o -> o.name.equals(appName)))
            System.out.println(appName + " is installed");
        else System.out.println(appName + " is not installed");
    }

    public void showFreeApps() {
        System.out.println("Your free apps: ");
        for (Application app : Applications) {
            if (app.price == 0)
                System.out.println(app.name);
        }
    }

    public double sumValueOfApps() {
        double value = 0;
        for (Application app : Applications) {
            value += app.price;
        }
        return value;
    }

    public void applicationsSortedByName() {
        System.out.println("Your apps sorted by name: ");
        ArrayList<Application> temp = new ArrayList<>(Applications);
        temp.sort(Comparator.comparing(application -> application.name));
        for (Application app : temp) {
            System.out.println(app);
        }
    }

    public void applicationsSortedByPrice() {
        System.out.println("Your apps sorted by price: ");
        ArrayList<Application> temp = new ArrayList<>(Applications);
        temp.sort(Comparator.comparing(app -> app.price));
        for (Application app : temp) {
            System.out.println(app);
        }
    }


    public String toString()
    {
        return this.producer+" "+this.model;
    }
}