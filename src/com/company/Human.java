package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human
{
    String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;
    private Double salary = 20000.0;

    public Double getSalary()
    {
        System.out.println("New data has been sent to accounting system."+"\n"+"ZUS and US already know about the change in payout and it makes no sense to hide your salary."+"\n"+"Remember to receive an annex to the contract from Ms. Hania from the staff.");
        return salary;
    }
    public void setSalary(Double salary)
    {
        if(salary<0)
            throw new IllegalArgumentException("you can't earn less than zero");
        else if(salary>20000.0)
            throw new IllegalArgumentException("u are not too good for that money");
        this.salary = salary;
    }
    public Car getCar()
    {
        return this.car;
    }
    public void setCar(Car car)
    {
        if(this.salary>car.getValue())
        {
            System.out.println("You can buy car for cash!");
            this.car = car;
        }
        else if(this.salary*12>car.getValue())
        {
            System.out.println("You can buy a car on credit!");
            this.car = car;
        }
        else
            System.out.println("Think about another car!");
    }
    public String toString()
    {
        return this.firstName + " " + this.lastName;
    }
}
