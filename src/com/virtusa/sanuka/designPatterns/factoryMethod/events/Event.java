package com.virtusa.sanuka.designPatterns.factoryMethod.events;

public abstract class Event {
    public Event(String message) {
        System.out.println(message);
    }
}
