package com.virtusa.sanuka.design_patterns.prototype.vegetable;

import com.virtusa.sanuka.design_patterns.prototype.enums.VegetableSize;

public class Carrot extends Vegetable {
    private VegetableSize vegetableSize;

    public VegetableSize getVegetableSize() {
        return vegetableSize;
    }

    public void setVegetableSize(VegetableSize vegetableSize) {
        this.vegetableSize = vegetableSize;
    }

    @Override
    public String toString() {
        return super.toString() + " Carrot{" +
                "vegetableSize=" + vegetableSize +
                '}';
    }
}

