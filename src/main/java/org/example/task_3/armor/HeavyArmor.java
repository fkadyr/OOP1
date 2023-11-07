package org.example.task_3.armor;

import org.example.task_3.Armor;

public class HeavyArmor extends Armor {
    public HeavyArmor(String name, int protection, int weight, String enchantment) {
        super(name, protection, weight, enchantment);
    }

    public static void main(String[] args) {
        HeavyArmor armor = new HeavyArmor("Rawhide Armor", 10, 10, null);
        armor.description();
        armor.changesEnchantment("Health recovery");
        armor.improvementsArmor(5, 2);
        armor.description();

        HeavyArmor steelArmor = new HeavyArmor("Steel armor", 15, 20, null);
        steelArmor.description();
        steelArmor.improvementsArmor(10, 3);
        steelArmor.changesEnchantment("Stamina recovery");
        steelArmor.description();
    }
}
