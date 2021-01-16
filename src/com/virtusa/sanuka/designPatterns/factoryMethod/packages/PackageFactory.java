package com.virtusa.sanuka.designPatterns.factoryMethod.packages;

import com.virtusa.sanuka.designPatterns.factoryMethod.enums.PackageCode;

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

