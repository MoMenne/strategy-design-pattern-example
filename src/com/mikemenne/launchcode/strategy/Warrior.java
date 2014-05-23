package com.mikemenne.launchcode.strategy;

/**
 * User: mpmenne
 * Date: 5/21/14
 * Time: 11:28 PM
 */


public class Warrior {

    private String name;
    private Weapon weapon;

    public Warrior(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void strike() {
        weapon.strike();
    }
}
