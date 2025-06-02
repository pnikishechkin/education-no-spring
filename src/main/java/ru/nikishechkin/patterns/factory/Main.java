package ru.nikishechkin.patterns.factory;

/**
 * Фабричный метод — это порождающий паттерн проектирования, который определяет интерфейс для создания объектов,
 * но позволяет подклассам изменять тип создаваемых экземпляров.
 *
 * Основная идея:
 * - Класс делегирует создание объектов своим подклассам.
 * - Позволяет заменить прямое создание объектов (new ConcreteClass()) на вызов метода (createProduct()).
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new FactoryFirstImpl();
        factory.createProduct().use();
    }
}
