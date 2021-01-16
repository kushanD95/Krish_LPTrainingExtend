package com.virtusa.sanuka.designPatterns.factoryMethod.packages;

import com.virtusa.sanuka.designPatterns.factoryMethod.events.AdventureEvent;
import com.virtusa.sanuka.designPatterns.factoryMethod.events.HikingEvent;
import com.virtusa.sanuka.designPatterns.factoryMethod.events.WaterEvent;

public class GoldPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
        events.add(new AdventureEvent());
        events.add(new HikingEvent());
    }
}
