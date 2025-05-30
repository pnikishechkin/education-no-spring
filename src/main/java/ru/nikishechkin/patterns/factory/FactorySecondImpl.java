package ru.nikishechkin.factory;

public class FactorySecondImpl extends Factory {
    public Product createProduct() {
        return new ProductSecondImpl();
    }
}
