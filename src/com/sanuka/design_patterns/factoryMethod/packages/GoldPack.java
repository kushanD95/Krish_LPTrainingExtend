package com.sanuka.design_patterns.factoryMethod.packages;

import com.sanuka.design_patterns.factoryMethod.events.AdventureEvent;
import com.sanuka.design_patterns.factoryMethod.events.HikingEvent;
import com.sanuka.design_patterns.factoryMethod.events.WaterEvent;

public class GoldPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
        events.add(new AdventureEvent());
        events.add(new HikingEvent());
    }
}
