package org.example.task_oop.hero;

import org.example.task_oop.Hero;


public class Warrior extends Hero {

    private int blacksmithSkill;

    public int getBlacksmithSkill(){
        return blacksmithSkill;
    }

    public Warrior(String name, int level, int health, int endurance, int mana, String race, int blacksmithSkill) {
        super(name, level, health, endurance, mana, race);
        this.blacksmithSkill = blacksmithSkill;
    }


    public String makingArmor(int blacksmithSkill) {
        if (blacksmithSkill<30) {
            return "Weak armor";
        } else if ((30<blacksmithSkill)&&(blacksmithSkill<60)) {
            return "Good armor";
        } else {
            return "Best armor";
        }
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
        Warrior warrior = new Warrior("Dowakin", 40, 250, 200, 150, "Nord", 70);
        warrior.description();
        System.out.println("Изготовлено - "+warrior.makingArmor(warrior.getBlacksmithSkill()));
        warrior.raisingLevel();
        warrior.description();
    }
}
