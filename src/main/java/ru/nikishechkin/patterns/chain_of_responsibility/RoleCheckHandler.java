package ru.nikishechkin.chain_of_responsibility;

import ru.nikishechkin.patterns.chain_of_responsibility.AbstractHandler;

public class RoleCheckHandler extends AbstractHandler {
    @Override
    public boolean handle(String username, String password, String role) {
        if (role.isEmpty()) {
            System.out.println("Ошибка! Роль должна быть задана");
            return false;
        }
        System.out.println("Проверка роли успешна");
        return super.handle(username, password, role);
    }
}
