package com.company;
import com.company.creatures.Human;

public interface Salleable
{
    void sell(Human buyer, Human seller, Double price) throws Exception;
}