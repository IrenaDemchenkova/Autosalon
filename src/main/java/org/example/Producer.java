package org.example;

public class Producer implements Runnable {
    Avtosalon avtosalon;

    private static final int PRODUCTION_INTERVAL = 1;

    Producer(Avtosalon avtosalon) {
        this.avtosalon = avtosalon;
    }

    @Override
    public void run() {
        while (avtosalon.count() < 10) {
            try {
                Thread.sleep(PRODUCTION_INTERVAL * 1000);
            } catch (InterruptedException e) {
                System.out.println("Producer exception: " + e.getLocalizedMessage());
            }
            avtosalon.put();
        }
    }
}

