package org.example;

interface Coffee{
    String getDesc();
    double cost();
}

class FilterCoffee implements Coffee{

    @Override
    public String getDesc() {
        return "Filter Coffee";
    }

    @Override
    public double cost() {
        return 20;
    }
}

class Latte implements Coffee{

    @Override
    public String getDesc() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 100;
    }
}

abstract class DecoratedCoffee implements Coffee{

}