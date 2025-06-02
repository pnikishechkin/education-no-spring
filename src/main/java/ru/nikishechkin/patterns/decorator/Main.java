package ru.nikishechkin.patterns.decorator;

/**
 * Decorator — это структурный паттерн, который позволяет динамически добавлять объектам новую функциональность,
 * оборачивая их в специальные классы-декораторы.
 *
 * Основная идея:
 * - Расширение возможностей объекта без изменения его класса.
 * - Альтернатива наследованию (более гибкий подход).
 */
public class Main {
    public static void main(String[] args) {
        BaseComponentImpl baseComponent = new BaseComponentImpl();
        ComponentLogger componentLogger = new ComponentLogger(baseComponent);
        ComponentMonitoring componentMonitoring = new ComponentMonitoring(componentLogger);

        componentMonitoring.operation();
    }
}
