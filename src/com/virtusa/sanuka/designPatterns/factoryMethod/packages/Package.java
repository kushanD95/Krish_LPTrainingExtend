package com.virtusa.sanuka.designPatterns.factoryMethod.packages;

import com.virtusa.sanuka.designPatterns.factoryMethod.events.Event;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
    protected List<Event> events = new ArrayList<>();

    public Package() {
        createPackage();
    }

    protected abstract void createPackage();
}
