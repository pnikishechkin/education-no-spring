package ru.nikishechkin.patterns.chain_of_responsibility;

import ru.nikishechkin.chain_of_responsibility.PasswordHandler;
import ru.nikishechkin.chain_of_responsibility.RoleCheckHandler;

/**
 * Chain of Responsibility — поведенческий паттерн, который позволяет передавать запросы по цепочке обработчиков.
 * Каждый обработчик решает, может ли он обработать запрос, и либо обрабатывает его, либо передаёт следующему в цепочке.
 *
 * Основная идея:
 * - Избежать жёсткой привязки отправителя запроса к получателю.
 * - Позволяет нескольким объектам обработать запрос, не зная заранее, какой именно объект это сделает.
 */
public class Main {
    public static void main(String[] args) {
        Handler passHandler = new PasswordHandler();
        Handler loginHandler = new UsernameHandler();
        Handler roleHandler = new RoleCheckHandler();

        loginHandler.setNext(passHandler);
        passHandler.setNext(roleHandler);

        loginHandler.handle("username", "password", "role");
    }
}
