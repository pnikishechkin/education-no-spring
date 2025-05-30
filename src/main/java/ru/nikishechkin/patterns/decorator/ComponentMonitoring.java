package ru.nikishechkin.decorator;

public class ComponentMonitoring extends ComponentDecorator {

    public ComponentMonitoring(Component delegate) {
        super(delegate);
    }

    @Override
    public void operation() {
        System.out.println("Monitoring start");
        super.operation();
        System.out.println("Monitoring stop");
    }
}
