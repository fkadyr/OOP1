package org.example.task_oop.weapon;

import org.example.task_oop.Weapon;

public class Sword extends Weapon {

    private String type;

    public Sword(String name, int damage, int attackSpeed, String enchantment, int weight, String type) {
        super(name, damage, attackSpeed, enchantment, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Тип оружия - " + type);
    }

    public String skillSword(String type) {
        if (type.equals("blade")) {
            return "When attacking from behind, there is a chance to do double damage";
        } else if (type.equals("sword")){
            return "When attacking with two swords, there is a chance to deal critical damage";
        } else {
            return "When attacking with a two - handed sword , there is a chance to knock down the enemy";
        }
    }

    public static void main(String[] args) {
        Sword sword = new Sword("Silver sword", 20, 10, "Effective against the undead",5, "sword");
        System.out.println("skill - " + sword.skillSword(sword.getType()));
        sword.sharpenSword(5);
        sword.description();
    }
}
