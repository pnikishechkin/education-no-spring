package ru.nikishechkin.patterns.chain_of_responsibility;

public interface Handler {
    void setNext(Handler handler); // Установка следующего обработчика

    boolean handle(String username, String password, String role); // Обработка запроса
}
