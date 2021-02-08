package com.sanuka.design_patterns.factoryMethod.packages;

import com.sanuka.design_patterns.factoryMethod.events.Event;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
    protected List<Event> events = new ArrayList<>();

    public Package() {
        createPackage();
    }

    protected abstract void createPackage();
}
