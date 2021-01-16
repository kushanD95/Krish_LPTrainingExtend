package com.virtusa.sanuka.designPatterns.factoryMethod.packages;

import com.virtusa.sanuka.designPatterns.factoryMethod.events.WaterEvent;

public class BasicPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
    }
}
