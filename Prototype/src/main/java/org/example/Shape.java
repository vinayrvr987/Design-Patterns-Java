package org.example;

//abstract class
abstract class Shape {
    abstract void draw();
    abstract Shape cloneShape();
}

//concrete class
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    Shape cloneShape() {
        return new Rectangle();
    }
}

//concrete class
class circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    Shape cloneShape() {
        return new circle();
    }
}
