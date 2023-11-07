package org.example.task_4.item_1.hero;

import org.example.task_4.item_1.weapon.Sword;

public class Warrior extends Hero {

    private int blacksmithSkill;
    private Sword sword;

    public int getBlacksmithSkill() {
        return blacksmithSkill;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Warrior(String name, int level, int health, int endurance, int mana, String race, int blacksmithSkill, Sword sword) {
        super(name, level, health, endurance, mana, race);
        this.blacksmithSkill = blacksmithSkill;
        this.sword = sword;
    }


    public Sword makingSword(int blacksmithSkill) {
        if (blacksmithSkill < 30) {
            return new Sword("Steel sword", 10, 10, null, 10, "sword");
        } else if ((30 < blacksmithSkill) && (blacksmithSkill < 60)) {
            return new Sword("Ebonite sword", 22, 15, null, 8, "sword");
        } else {
            return new Sword("Daedric Sword", 30, 20, null, 5, "sword");
        }
    }

    public int attack(Sword sword) {
        return sword.getDamage();
    }

    @Override
    public void description() {
        System.out.println("Имя - " + getName());
        System.out.println("Уровень - " + getLevel());
        System.out.println("Здоровье - " + getHealth());
        System.out.println("Выносливость - " + getEndurance());
        System.out.println("Мана - " + getMana());
        System.out.println("Раса - " + getRace());
        System.out.println("Навык изготовления брони - " + getBlacksmithSkill());
        System.out.println();
    }

    public static void main(String[] args) {
        Sword elfSword = new Sword("Elf sword", 20, 20, "Fire attack", 5, "sword");
        Warrior warrior = new Warrior("Dowakin", 40, 250, 200, 150, "Nord", 70, elfSword);
        warrior.getSword().description();
        System.out.println("Урон нашего воина - " + warrior.getSword().getDamage());
        System.out.println("Навык нашего оружия - " + warrior.getSword().skillSword(warrior.getSword().getType()));
    }
}
