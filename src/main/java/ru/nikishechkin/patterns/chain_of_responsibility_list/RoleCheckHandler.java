package ru.nikishechkin.patterns.chain_of_responsibility_list;

public class RoleCheckHandler implements Event {
    @Override
    public Boolean dataInputHandler(Request request) {
        if (request.getRole().isEmpty()) {
            System.out.println("Ошибка! Роль должна быть задана");
            return false;
        }
        System.out.println("Проверка роли успешна");
        return true;
    }
}
