package ru.nikishechkin.patterns.chain_of_responsibility_list;

public class PasswordHandler implements Event{
    @Override
    public Boolean dataInputHandler(Request request) {
        if (request.getPassword().isEmpty()) {
            System.out.println("Ошибка: Пароль должен быть задан!");
            return false;
        }
        System.out.println("Пароль корректный!");
        return true;
    }
}
