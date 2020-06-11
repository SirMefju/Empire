package com.company;

import com.company.creatures.Human;

public class DealList
{
    public Human buyer;
    public Human seller;
    public Double price;

    public DealList(Human buyer, Human seller, Double price)
    {
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
    }
}
