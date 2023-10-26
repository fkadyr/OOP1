package org.example.task1_2;

public class Sword {
    private String name = "Steel sword";
    private int damage = 15; // урон 15 ед. здоровья
    private int attackSpeed = 20;    // Скорость атаки 20 ударов в минуту.
    private String enchantment = "paralysis"; //Зачарование меча паралич.
    private int weight = 4;

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Атака - "+ damage);
        System.out.println("Вес - "+ weight);
        System.out.println("Зачарование - "+ enchantment);
        System.out.println("Скорость атаки - "+ attackSpeed);
        System.out.println();
    }

    public static void main(String[] args) {
        Sword sword = new Sword();
        sword.description();

        Sword blade = new Sword();
        blade.name = "The Blade of Merunes Dagon";
        blade.damage = 10;
        blade.attackSpeed = 40;
        blade.enchantment = "50% chance of double damage";
        blade.weight = 1;
        blade.description();

        Sword dwemerSword = new Sword();
        dwemerSword.name = "Dwemer sword";
        dwemerSword.damage = 14;
        dwemerSword.weight = 5;
        dwemerSword.attackSpeed = 15;
        dwemerSword.enchantment = null;
        dwemerSword.description();
    }
}
