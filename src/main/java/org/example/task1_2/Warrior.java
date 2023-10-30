package org.example.task1_2;

import java.util.Arrays;

/*В классе Воин я добавил один метод, который при увиличении уровня, добавляет здоровье, выносливость, и ману.*/

public class Warrior {
    private String name;
    private int level;
    private int health;
    private int endurance;
    private int mana;
    private String race;
    private String[] skills = {"One-handed weapon", "Heavy armor", "Blacksmith"};

    public void raisingLevel() {
        this.level++;
        this.health += 10;
        this.endurance += 10;
        this.mana += 10;
    }

    public Warrior(String name, int level, int health, int endurance, int mana, String race) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.endurance = endurance;
        this.mana = mana;
        this.race = race;
    }

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Уровень - " + level);
        System.out.println("Здоровье - " + health);
        System.out.println("Выносливость - " + endurance);
        System.out.println("Мана - " + mana);
        System.out.println("Раса - " + race);
        System.out.println("Навыки - " + Arrays.toString(skills));
        System.out.println();
    }

    public static void main(String[] args) {
        Warrior nordWarrior = new Warrior("Ulfrik", 20, 200, 150, 100, "Nord");
        nordWarrior.description();
        nordWarrior.raisingLevel();
        nordWarrior.description();

        Warrior elfWarrior = new Warrior("Elf", 5, 140, 100, 100, "Elf");
        elfWarrior.description();
        elfWarrior.raisingLevel();
        elfWarrior.description();

        Warrior orkWarrior = new Warrior("Ork", 10, 200, 150, 100, "Ork");
        orkWarrior.description();
        orkWarrior.raisingLevel();
        orkWarrior.description();
    }
}
