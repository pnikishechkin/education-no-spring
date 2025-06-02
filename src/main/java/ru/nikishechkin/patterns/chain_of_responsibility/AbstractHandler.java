package ru.nikishechkin.patterns.chain_of_responsibility;

public class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean handle(String username, String password, String role) {
        if (nextHandler != null) {
            nextHandler.handle(username, password, role);
        }
        return true;
    }
}
