package ru.nikishechkin.patterns.chain_of_responsibility_list;

public interface Event {
    Boolean dataInputHandler(Request request);
}
