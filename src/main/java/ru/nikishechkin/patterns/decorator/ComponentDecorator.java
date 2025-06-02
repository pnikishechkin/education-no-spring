package ru.nikishechkin.patterns.decorator;

public abstract class ComponentDecorator implements Component {
    protected final Component delegate;

    public ComponentDecorator(Component delegate) {
        this.delegate = delegate;
    }

    @Override
    public void operation() {
        delegate.operation();
    }
}
