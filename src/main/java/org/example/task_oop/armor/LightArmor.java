package org.example.task_oop.armor;

import org.example.task_oop.Armor;

public class LightArmor extends Armor {
    public LightArmor(String name, int protection, int weight, String enchantment) {
        super(name, protection, weight, enchantment);
    }

    @Override
    public void improvementsArmor(int increaseProtect, int weightElement) {
        setProtection(getProtection() + increaseProtect);
        setWeight(getWeight() - weightElement);
    }

    public static void main(String[] args) {
        LightArmor lightArmor = new LightArmor("Rawhide Armor", 10, 10, null);
        lightArmor.description();
        lightArmor.changesEnchantment("Health recovery");
        lightArmor.improvementsArmor(5, 2);
        lightArmor.description();

        LightArmor elvenArmor = new LightArmor("Elven armor", 16, 12, null);
        elvenArmor.description();
        elvenArmor.improvementsArmor(5, 2);
        elvenArmor.changesEnchantment("Stamina recovery");
        elvenArmor.description();
    }
}
