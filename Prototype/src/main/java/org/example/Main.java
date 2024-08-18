package org.example;

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
