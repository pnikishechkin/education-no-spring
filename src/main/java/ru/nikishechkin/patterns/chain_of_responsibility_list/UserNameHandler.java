package ru.nikishechkin.patterns.chain_of_responsibility_list;

public class UserNameHandler implements Event {
    @Override
    public Boolean dataInputHandler(Request request) {
        if (request.getLogin() == null || request.getLogin().isEmpty()) {
            System.out.println("Ошибка: Логин не может быть пустым!");
            return false;
        }
        System.out.println("Логин корректен");
        return true;
    }
}
