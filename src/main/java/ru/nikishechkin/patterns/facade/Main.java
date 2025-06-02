package ru.nikishechkin.patterns.facade;

/**
 * Фасад — это структурный паттерн проектирования, который предоставляет простой интерфейс для работы со сложной
 * подсистемой (фреймворком, библиотекой или набором классов).
 *
 * Основная идея:
 * - Скрыть сложность системы за удобным API.
 * - Упростить взаимодействие клиента с подсистемой.
 */
public class Main {
    public static void main(String[] args) {
        FirstDevice fd = new FirstDevice();
        SecondDevice sd = new SecondDevice();
        ServiceFacade facade = new ServiceFacadeImpl(fd, sd);
        facade.turnOn();
    }
}
