package org.example;

public class Main {
    public static void main(String[] args) {

        Avtosalon avtosalon = new Avtosalon();
        Producer producer = new Producer(avtosalon);
        Buyer buyer = new Buyer(avtosalon);
        new Thread(producer).start();
        new Thread(buyer).start();
    }
}