package com.sanuka.design_patterns.factoryMethod.packages;

import com.sanuka.design_patterns.factoryMethod.enums.PackageCode;

public class PackageFactory {

    public static Package createPackage(PackageCode packageCode) {
        switch (packageCode) {
            case BASIC:
                return new BasicPack();
            case SILVER:
                return new SilverPack();
            case GOLD:
                return new GoldPack();
            default:
                return null;
        }
    }
}

