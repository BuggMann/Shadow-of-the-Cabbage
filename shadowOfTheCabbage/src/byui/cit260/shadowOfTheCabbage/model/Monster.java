/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shadowOfTheCabbage.model;

import java.io.Serializable;

/**
 *
 * @author Scott
 */
public enum Monster implements Serializable {
    Snake("Snake", "Negatio", 100),
    Tiger("Tiger", "Ira", 200),
    Baboon("Baboon", "Paciscendo", 300),
    Bear("Bear", "Depressione", 400),
    Fox("fox", "acceptatio", 1000);

    private final String monsterType;
    private final String monsterName;
    private final int str;

    private Game game;

    Monster(String type, String name, int str) {
        this.monsterType = type;
        this.monsterName = name;
        this.str = str;

    }

    public String getMonsterType() {
        return monsterType;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getStr() {
        return str;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return monsterName + " - " + monsterType + ", strength: " + str;
    }

}
