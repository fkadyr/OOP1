package org.example.task1_2;

/*В классе броня, я добавил конструктор, и два метода. Первый метод у нас улучшает броню. А второй метод меняет зачарование брони */
public class Armor {
    private String name;
    private int protection;
    private int weight;
    private String enchantment;

    public void improvementsArmor(int increaseProtect, int weightElement) {
        this.protection += increaseProtect;
        this.weight += weightElement;
    }

    public void changesEnchantment(String newEnchantment) {
        this.enchantment = newEnchantment;
    }

    public Armor(String name, int protection, int weight, String enchantment) {
        this.name = name;
        this.protection = protection;
        this.weight = weight;
        this.enchantment = enchantment;
    }

    public void description() {
        System.out.println("Имя - " + this.name);
        System.out.println("Защита - "+ this.protection);
        System.out.println("Вес - "+ this.weight);
        System.out.println("Зачарование - "+ this.enchantment);
        System.out.println();
    }

    public static void main(String[] args) {
        Armor armor = new Armor("Rawhide Armor", 10, 10, null);
        armor.description();
        armor.changesEnchantment("Health recovery");
        armor.improvementsArmor(5, 2);
        armor.description();

        Armor steelArmor = new Armor("Steel armor", 15, 20, null);
        steelArmor.description();
        steelArmor.improvementsArmor(10, 3);
        steelArmor.changesEnchantment("Stamina recovery");
        steelArmor.description();


        Armor wolfArmour = new Armor("Wolf Armor", 30 , 18, "Poison Resistance");
        wolfArmour.description();
        wolfArmour.improvementsArmor(20, 5);
        wolfArmour.changesEnchantment("Illusion");
        wolfArmour.description();
    }
}
