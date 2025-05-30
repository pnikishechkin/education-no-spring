package ru.nikishechkin.factory;

public abstract class Factory {
    public abstract Product createProduct();

    public void useProduct() {
        Product product = createProduct();
        product.use();
    }
}
