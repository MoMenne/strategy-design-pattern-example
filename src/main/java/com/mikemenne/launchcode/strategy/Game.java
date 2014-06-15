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

    public static void main(String[] varArgs) {
        System.out.println("Welcome to the warrior game");

        ApplicationContext context =
         new ClassPathXmlApplicationContext("application.xml");

        Game obj = (Game) context.getBean("game1");
        obj.start();
    }



    private Arsenal arsenal;

    public Game(Arsenal arsenal) {
        this.arsenal = arsenal;
    }

    public void start() {
        Warrior archer = new Warrior("archer", arsenal.bowAndArrow());
        Warrior soldier = new Warrior("soldier", arsenal.sword("excalibur"));

        archer.strike();
        soldier.strike();
        archer.toString();

        System.out.println(archer);
    }


}
