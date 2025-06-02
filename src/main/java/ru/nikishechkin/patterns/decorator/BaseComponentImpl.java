package ru.nikishechkin.patterns.decorator;

public class BaseComponentImpl implements Component {
    @Override
    public void operation() {
        System.out.println("BaseComponentImpl");
    }
}
