package com.virtusa.sanuka.design_patterns.factoryMethod.packages;

import com.virtusa.sanuka.design_patterns.factoryMethod.events.AdventureEvent;
import com.virtusa.sanuka.design_patterns.factoryMethod.events.WaterEvent;

public class SilverPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
        events.add(new AdventureEvent());
    }
}
