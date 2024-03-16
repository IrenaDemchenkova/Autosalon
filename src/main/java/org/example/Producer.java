package org.example;

public class Producer implements Runnable {
    Avtosalon avtosalon;

    Producer(Avtosalon avtosalon) {
        this.avtosalon = avtosalon;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            avtosalon.put();
        }
    }
}

