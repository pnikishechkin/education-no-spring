package ru.nikishechkin.patterns.factory;

public class FactorySecondImpl extends Factory {
    public Product createProduct() {
        return new ProductSecondImpl();
    }
}
