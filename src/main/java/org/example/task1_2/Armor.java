package org.example.task1_2;

//Класс броня
public class Armor {
    private String name = "Rawhide Armor";  //Сыромятая броня
    private int protection = 10;            //Защита от атак 10 ед.
    private int weight = 10;                 //Вес брони 10
    private String enchantment = "Illusion";//Зачарование Иллюзия

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Защита - "+ protection);
        System.out.println("Вес - "+ weight);
        System.out.println("Зачарование - "+ enchantment);
        System.out.println();
    }

    public static void main(String[] args) {
        Armor armor = new Armor();
        armor.description();

        Armor steelArmor = new Armor();
        steelArmor.name = "Steel armor";
        steelArmor.weight = 20;
        steelArmor.enchantment = null;
        steelArmor.protection = 15;
        steelArmor.description();

        Armor wolfArmour = new Armor();
        wolfArmour.name = "Wolf Armor";
        wolfArmour.protection = 30;
        wolfArmour.weight = 18;
        wolfArmour.enchantment = "Poison Resistance";
        wolfArmour.description();
    }
}
