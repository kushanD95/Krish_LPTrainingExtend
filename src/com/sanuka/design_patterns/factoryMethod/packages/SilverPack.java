package com.sanuka.design_patterns.factoryMethod.packages;

import com.sanuka.design_patterns.factoryMethod.events.AdventureEvent;
import com.sanuka.design_patterns.factoryMethod.events.WaterEvent;

public class SilverPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
        events.add(new AdventureEvent());
    }
}
