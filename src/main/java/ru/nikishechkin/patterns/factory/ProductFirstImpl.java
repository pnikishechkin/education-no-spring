package ru.nikishechkin.factory;

public class ProductFirstImpl implements Product {
    @Override
    public void use() {
        System.out.println("Using ProductFirstImpl");
    }
}
