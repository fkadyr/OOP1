package org.example.task_4.item_1.hero;

public class Hero {
    private String name;
    private int level;
    private int health;
    private int endurance;
    private int mana;
    private String race;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    public Hero(String name, int level, int health, int endurance, int mana, String race) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.endurance = endurance;
        this.mana = mana;
        this.race = race;
    }

    public void raisingLevel() {
        this.level++;
        this.health += 10;
        this.endurance += 10;
        this.mana += 10;
    }

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Уровень - " + level);
        System.out.println("Здоровье - " + health);
        System.out.println("Выносливость - " + endurance);
        System.out.println("Мана - " + mana);
        System.out.println("Раса - " + race);
        System.out.println();
    }
}