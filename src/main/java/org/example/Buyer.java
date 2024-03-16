package org.example;

public class Buyer implements Runnable {
    Avtosalon avtosalon;

    public Buyer(Avtosalon avtosalon) {
        this.avtosalon = avtosalon;
    }

    @Override
    public void run() {
        avtosalon.get();
    }
}
