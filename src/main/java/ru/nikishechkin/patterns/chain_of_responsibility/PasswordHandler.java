package ru.nikishechkin.chain_of_responsibility;

import ru.nikishechkin.patterns.chain_of_responsibility.AbstractHandler;

public class PasswordHandler extends AbstractHandler {
    @Override
    public boolean handle(String username, String password, String role) {
        if (password.isEmpty()) {
            System.out.println("Ошибка: Пароль должен быть задан!");
            return false;
        }
        System.out.println("Пароль корректный!");
        return super.handle(username, password, role);
    }
}
