package ru.nikishechkin.patterns.factory;

public abstract class Factory {
    public abstract Product createProduct();

    public void useProduct() {
        Product product = createProduct();
        product.use();
    }
}
