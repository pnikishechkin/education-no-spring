package ru.nikishechkin.factory;

public class ProductSecondImpl implements Product {
    @Override
    public void use() {
        System.out.println("Using ProductSecondImpl");
    }
}
