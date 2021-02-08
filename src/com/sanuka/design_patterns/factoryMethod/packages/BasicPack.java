package com.sanuka.design_patterns.factoryMethod.packages;

import com.sanuka.design_patterns.factoryMethod.events.WaterEvent;

public class BasicPack extends Package {
    @Override
    protected void createPackage() {
        events.add(new WaterEvent());
    }
}
