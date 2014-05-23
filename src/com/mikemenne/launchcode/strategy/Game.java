package com.mikemenne.launchcode.strategy;

import com.mikemenne.launchcode.strategy.weapons.BowAndArrow;
import com.mikemenne.launchcode.strategy.weapons.Sword;

/**
 * User: mpmenne
 * Date: 5/21/14
 * Time: 11:28 PM
 */
public class Game {


    public static void main(String[] varArgs) {
        System.out.println("Welcome to the warrior game");

        Warrior archer = new Warrior("archer", new BowAndArrow("bow1"));
        Warrior soldier = new Warrior("soldier", new Sword("excalibur"));

        archer.strike();
        soldier.strike();
    }


}
