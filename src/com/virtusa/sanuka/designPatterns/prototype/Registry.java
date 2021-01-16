package com.virtusa.sanuka.designPatterns.prototype;

import com.virtusa.sanuka.designPatterns.prototype.enums.PumpkinVarieties;
import com.virtusa.sanuka.designPatterns.prototype.enums.VegetableGrade;
import com.virtusa.sanuka.designPatterns.prototype.enums.VegetableSize;
import com.virtusa.sanuka.designPatterns.prototype.enums.VegetableTypes;
import com.virtusa.sanuka.designPatterns.prototype.vegetable.Carrot;
import com.virtusa.sanuka.designPatterns.prototype.vegetable.Pumpkin;
import com.virtusa.sanuka.designPatterns.prototype.vegetable.Vegetable;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<VegetableTypes, Vegetable> vegetables = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Vegetable getVegetables(VegetableTypes vegetableType){

        Vegetable vegetable = null;

        try {
            vegetable = (Vegetable) vegetables.get(vegetableType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return vegetable;
    }

    private void initialize() {

        Carrot carrot = new Carrot();
        carrot.setName("local carrot");
        carrot.setVegetableSize(VegetableSize.MEDIUM);
        carrot.setQuantity(100);
        carrot.setVegetableGrade(VegetableGrade.A);

        Pumpkin pumpkin = new Pumpkin();
        pumpkin.setName("local pumpkin");
        pumpkin.setPumpkinVarieties(PumpkinVarieties.A);
        pumpkin.setQuantity(100);
        pumpkin.setVegetableGrade(VegetableGrade.A);

        vegetables.put(VegetableTypes.CARROT,carrot);
        vegetables.put(VegetableTypes.PUMPKIN,pumpkin);
    }
}

