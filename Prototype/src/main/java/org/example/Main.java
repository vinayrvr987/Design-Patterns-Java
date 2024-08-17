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

public class Main {
    public static void main(String[] args) {
        Shape initialRectangle = new Rectangle();
        Shape initialCircle = new circle();

        Shape clonedRectangle = initialRectangle.cloneShape();
        clonedRectangle.draw();
        Shape clonedCircle = initialCircle.cloneShape();
        clonedCircle.draw();
    }
}
