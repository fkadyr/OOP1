package org.example.task_oop.weapon;

import org.example.task_oop.Weapon;

public class Bow extends Weapon {

    private int rangeOfAction;

    public Bow(String name, int damage, int attackSpeed, String enchantment, int weight, int rangeOfAction) {
        super(name, damage, attackSpeed, enchantment, weight);
        this.rangeOfAction = rangeOfAction;
    }

    public int getRangeOfAction() {
        return rangeOfAction;
    }

    public int chanceOfHit(int rangeOfAction) {
        if (rangeOfAction < 15) {
            return 95;
        } else if ((15<rangeOfAction)&&(rangeOfAction<30)) {
            return 65;
        } else {
            return 50;
        }
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Радиус действия - "+getRangeOfAction());
    }

    public static void main(String[] args) {
        Bow elfBow = new Bow("Elf bow", 11, 5,"Illusion", 5, 25);
        elfBow.chanceOfHit(elfBow.getRangeOfAction());
        elfBow.changeEnchantment("Double damage", 20);
        elfBow.description();
    }
}
