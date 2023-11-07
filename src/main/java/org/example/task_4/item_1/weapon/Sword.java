package org.example.task_4.item_1.weapon;

public class Sword extends Weapon {

    private String type;

    public Sword(String name, int damage, int attackSpeed, String enchantment, int weight, String type) {
        super(name, damage, attackSpeed, enchantment, weight);
        this.type = type;
    }
    public Sword() {}
    public String getType() {
        return type;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Тип оружия - " + getType());
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
}
