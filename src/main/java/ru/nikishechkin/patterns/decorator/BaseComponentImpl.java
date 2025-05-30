package ru.nikishechkin.decorator;

public class BaseComponentImpl implements Component {
    @Override
    public void operation() {
        System.out.println("BaseComponentImpl");
    }
}
