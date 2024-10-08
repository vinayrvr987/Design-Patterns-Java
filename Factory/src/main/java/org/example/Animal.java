package org.example;

import java.util.Objects;

interface Animal{
    void bark();
}

class Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("Bow Bow!");
    }
}

class Cat implements Animal{
    @Override
    public void bark() {
        System.out.println("Meow!");
    }
}

class AnimalFactory{
    public Animal createAnimalObjects(String animal){
        if(Objects.equals(animal, "dog")){
            return new Dog();
        } else if (Objects.equals(animal, "cat")) {
            return new Cat();
        }
        else return null;
    }
}
