package org.example.task_oop;

public class Weapon {
    private String name;
    private int damage;
    private int attackSpeed;
    private String enchantment;
    private int weight;

    public Weapon(String name, int damage, int attackSpeed, String enchantment, int weight) {
        this.name = name;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.enchantment = enchantment;
        this.weight = weight;
    }

    public void sharpenSword(int increaseDamage) {
        this.damage += increaseDamage;
    }

    public void changeEnchantment(String newEnchantment, int increaseDamage) {
        this.enchantment = newEnchantment;
        this.sharpenSword(increaseDamage);
    }

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Атака - " + damage);
        System.out.println("Вес - " + weight);
        System.out.println("Зачарование - " + enchantment);
        System.out.println("Скорость атаки - " + attackSpeed);
    }
}
