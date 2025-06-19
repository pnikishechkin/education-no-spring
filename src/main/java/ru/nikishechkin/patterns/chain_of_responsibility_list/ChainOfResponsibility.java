package ru.nikishechkin.patterns.chain_of_responsibility_list;

import java.util.List;

public class ChainOfResponsibility {
    private final List<Event> listEvent;

    public ChainOfResponsibility(List<Event> listEvent) {
        this.listEvent = listEvent;
    }

    public void process(Request request) {
        for (Event event: listEvent) {
            if (!event.dataInputHandler(request)) {
                System.out.println("Ошибка выполнения");
                return;
            }
        }
        System.out.println("Успех!");
    }
}
