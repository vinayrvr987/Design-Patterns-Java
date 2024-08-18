package org.example;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimalObjects("dog");
        dog.bark();

        Animal cat = factory.createAnimalObjects("cat");
        cat.bark();

        Animal rabbit = factory.createAnimalObjects("rabbit");
        if(rabbit != null){
            rabbit.bark();
        }
        else System.out.println("Error");

        GUIFactory windowsFactory = new WindowsFactory();
        init(windowsFactory);

        GUIFactory macFactory = new MacFactory();
        init(macFactory);
    }

    private static void init(GUIFactory factory) {
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.paint();
    }
}
