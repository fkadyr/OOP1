package org.example.task_oop.hero;

import org.example.task_oop.Hero;

public class Archer extends Hero {

    private int lockPickingSkill;

    public int getLockPickingSkill() {
        return lockPickingSkill;
    }

    public Archer(String name, int level, int health, int endurance, int mana, String race, int lockPickingSkill) {
        super(name, level, health, endurance, mana, race);
        this.lockPickingSkill = lockPickingSkill;
    }

    public String breakingLock(int lockPickingSkill) {
        if (lockPickingSkill < 15) {
            return "The lock was broken in 20 attempts";
        } else if ((15<lockPickingSkill)&&(lockPickingSkill<60)) {
            return "The lock was broken in 10 attempts";
        } else {
            return "The lock was broken in 5 attempts";
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
        System.out.println("Навык взлома - " + getLockPickingSkill());
        System.out.println();
    }

    public static void main(String[] args) {
        Archer archer = new Archer("Kodlak", 3, 100, 130, 100, "Dark Elf", 50);
        archer.raisingLevel();
        System.out.println(archer.breakingLock(archer.getLockPickingSkill()));
        archer.description();

    }
}
