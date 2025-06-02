package ru.nikishechkin.patterns.chain_of_responsibility;

public class UsernameHandler extends AbstractHandler {
    @Override
    public boolean handle(String username, String password, String role) {
        if (username == null || username.isEmpty()) {
            System.out.println("Ошибка: Логин не может быть пустым!");
            return false;
        }
        System.out.println("Логин корректен");
        return super.handle(username, password, role);
    }
}
