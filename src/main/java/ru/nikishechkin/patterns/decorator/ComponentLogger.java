package ru.nikishechkin.patterns.decorator;

public class ComponentLogger extends ComponentDecorator {

    public ComponentLogger(Component delegate) {
        super(delegate);
    }

    @Override
    public void operation() {
        System.out.println("Logging start");
        super.operation();
        System.out.println("Logging stop");
    }
}
