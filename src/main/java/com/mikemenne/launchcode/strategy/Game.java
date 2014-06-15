package com.mikemenne.launchcode.strategy;

import com.mikemenne.launchcode.strategy.weapons.BowAndArrow;
import com.mikemenne.launchcode.strategy.weapons.Sword;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: mpmenne
 * Date: 5/21/14
 * Time: 11:28 PM
 */
public class Game {

    private Arsenal arsenal;

    public void start() {
        Warrior archer = new Warrior("archer", arsenal.bowAndArrow());
        Warrior longBow = new Warrior("long-bow", arsenal.bowAndArrow());
        Warrior soldier = new Warrior("soldier", arsenal.sword("excalibur"));

        archer.strike();
        soldier.strike();
        archer.toString();

        Warrior[] warriors = new Warrior[2];
        warriors[0] = archer;
        warriors[1] = soldier;
            warriors[2] = longBow;


        System.out.println(archer);
    }


    public Game(Arsenal arsenal) {
        this.arsenal = arsenal;
    }

    public static void main(String[] varArgs) {
        System.out.println("Welcome to the warrior game");

        ApplicationContext context =
         new ClassPathXmlApplicationContext("application.xml");

        Game obj = (Game) context.getBean("game1");
        obj.start();
    }

}
