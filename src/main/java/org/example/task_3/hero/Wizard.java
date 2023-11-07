package org.example.task_3.hero;

import org.example.task_3.Hero;

public class Wizard extends Hero {
    private int alchemySkill;

    public int getAlchemySkill() {
        return alchemySkill;
    }

    public Wizard(String name, int level, int health, int endurance, int mana, String race, int alchemySkill) {
        super(name, level, health, endurance, mana, race);
        this.alchemySkill = alchemySkill;
    }

    public String preparePotion(int alchemySkill) {
        if (alchemySkill < 10) {
            return "Weak potion";
        } else if ((alchemySkill > 10)&&(50>alchemySkill)) {
            return "Good potion";
        } else {
            return "Best potion";
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
        System.out.println("Навык алхимии - " + alchemySkill);
        System.out.println();
    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard("Klawius", 30, 150, 120, 250, "Nord", 60);
        wizard.description();
        wizard.raisingLevel();
        System.out.println("Сварено - "+ wizard.preparePotion(wizard.getAlchemySkill()));
        wizard.description();
    }
}
