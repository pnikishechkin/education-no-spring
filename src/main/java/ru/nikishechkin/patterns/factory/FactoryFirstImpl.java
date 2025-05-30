package ru.nikishechkin.factory;

public class FactoryFirstImpl extends Factory {
    public Product createProduct() {
        return new ProductFirstImpl();
    }
}
