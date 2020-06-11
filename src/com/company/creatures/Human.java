package com.company.creatures;

import com.company.DealList;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal
{
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    private Double salary = 20000.0;
    public Double cash = 100000.0;
    public FarmAnimal[] farm;
    public Car[] garage;

    public Human()
    {
        super("homo sapiens");
        this.weight = 80.0;
    }
    public Human(Integer farmSize, Integer garageSize)
    {
        super("homo sapiens");
        this.weight = 80.0;
        this.farm = new FarmAnimal[farmSize];
        this.garage = new Car[garageSize];
    }
    public Car[] getGarage()
    {
        return this.garage;
    }
    public Double garageValue()
    {
        Double garageValue = 0.0;
        for (Car car : garage) {
            if (car != null) {
                garageValue += car.getValue();
            }
        }
        return garageValue;
    }

    public void setSalary(Double salary)
    {
        if(salary<0)
            throw new IllegalArgumentException("you can't earn less than zero");
        else if(salary>20000.0)
            throw new IllegalArgumentException("u are not too good for that money");
        this.salary = salary;
    }
    public Double getSalary()
    {
        System.out.println("New data has been sent to accounting system."+"\n"+"ZUS and US already know about the change in payout and it makes no sense to hide your salary."+"\n"+"Remember to receive an annex to the contract from Ms. Hania from the staff.");
        return salary;
    }

    public void setCar(Car car, Integer index)
    {
        if (car == null) {
            this.garage[index] = null;
        } else if (isGarageFull()) {
            System.out.println("No space in the garage");
        } else {
            this.garage[index] = car;
            if (car.deals.size() == 0) {
                car.deals.add(new DealList(this, this, 0.0));
            }
            if (car.deals.size() > 0) {
                if (car.deals.getLast().buyer != this)
                    car.deals.add(new DealList(this, this, 0.0));
            }
        }
    }
    public Car getCar(Integer index)
    {
        return this.garage[index];
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }
    public boolean hasFreeSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }
    public void removeCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == newCar) {
                this.garage[i] = null;
            }
        }
    }
    public void addCar(Car newCar) throws Exception {
        if (!this.hasFreeSpace()) {
            throw new Exception("nie ma miejsca");
        }
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                break;
            }
        }
    }
    public boolean isGarageFull() {
        for (Car car : this.garage) {
            if (car == null) return false;
        }
        return true;
    }
    @Override
    public String toString()
    {
        return this.firstName;
    }
}
