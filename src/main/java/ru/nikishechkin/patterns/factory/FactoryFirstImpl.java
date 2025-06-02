package ru.nikishechkin.patterns.factory;

public class FactoryFirstImpl extends Factory {
    public Product createProduct() {
        return new ProductFirstImpl();
    }
}
