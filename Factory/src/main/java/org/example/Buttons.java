package org.example;

interface Button{
    void paint();
}

class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Rendering a Windows style button");
    }
}

class MacButton implements Button{

    @Override
    public void paint() {
        System.out.println("Rendering a Mac style button");
    }
}

interface CheckBox{
    void paint();
}

class WindowsCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Rendering a Windows style checkbox");
    }
}

class MacCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Rendering a Mac style Checkbox");
    }
}

interface GUIFactory{
    Button createButton();
    CheckBox createCheckBox();
}

class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

