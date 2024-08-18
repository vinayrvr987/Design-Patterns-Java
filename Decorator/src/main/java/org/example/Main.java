package org.example;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new FilterCoffee();
        System.out.println(myCoffee.getDesc() + "cost: " + myCoffee.cost());

        Coffee poojaCoffee = new Latte();
        System.out.println(poojaCoffee.getDesc() + "cost: " + poojaCoffee.cost());

        poojaCoffee = new Sugar(poojaCoffee);
        System.out.println(poojaCoffee.getDesc() + "cost: " + poojaCoffee.cost());

        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.getDesc() + "cost: " + myCoffee.cost());

        myCoffee = new Sugar(myCoffee);
        System.out.println(myCoffee.getDesc() + "cost: " + myCoffee.cost());
    }
}