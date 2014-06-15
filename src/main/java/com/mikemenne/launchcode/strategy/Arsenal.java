package com.mikemenne.launchcode.strategy;

import com.mikemenne.launchcode.strategy.weapons.BowAndArrow;
import com.mikemenne.launchcode.strategy.weapons.Sword;

/**
 * User: mpmenne
 * Date: 6/6/14
 * Time: 8:43 PM
 */
public class Arsenal {

    private Arsenal(int bows, int swords) {

    }

    public Weapon bowAndArrow() {
        return new BowAndArrow("");
    }

    public Weapon sword(String name) {
        return new Sword(name);
    }

}
