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
        return 100;
    }
}

class Latte implements Coffee{

    @Override
    public String getDesc() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 150;
    }
}

abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    public String getDesc(){
        return decoratedCoffee.getDesc();
    }

    public double cost(){
        return decoratedCoffee.cost();
    }
}

class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDesc(){
        return decoratedCoffee.getDesc() + ", with Milk";
    }

    public double cost(){
        return decoratedCoffee.cost() + 100;
    }
}

class Sugar extends CoffeeDecorator{

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDesc(){
        return decoratedCoffee.getDesc() + ", with Sugar";
    }

    public double cost(){
        return decoratedCoffee.cost() + 150;
    }
}
