package ru.nikishechkin.facade;

public class ServiceFacadeImpl implements ServiceFacade {

    private final FirstDevice fd;
    private final SecondDevice sd;

    public ServiceFacadeImpl(FirstDevice fd, SecondDevice sd) {
        this.fd = fd;
        this.sd = sd;
    }

    @Override
    public void turnOn() {
        fd.turnSound();
        fd.turnVideo();
        sd.checkBase();
        sd.addCheck();
        fd.check();
    }
}
