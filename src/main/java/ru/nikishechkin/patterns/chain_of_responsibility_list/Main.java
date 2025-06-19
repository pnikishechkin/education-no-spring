package ru.nikishechkin.patterns.chain_of_responsibility_list;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Request request = new Request("login", "pass", "role");

        List<Event> listEvent = List.of(
                new PasswordHandler(),
                new RoleCheckHandler(),
                new UserNameHandler()
        );

        ChainOfResponsibility chainOfResponsibility = new ChainOfResponsibility(listEvent);
        chainOfResponsibility.process(request);
    }
}
