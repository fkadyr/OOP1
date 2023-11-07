package org.example.task_4.item_1.weapon;

public class Weapon {
    private String name;
    private int damage;
    private int attackSpeed;
    private String enchantment;
    private int weight;

    public Weapon() {
    }

    public Weapon(String name, int damage, int attackSpeed, String enchantment, int weight) {
        this.name = name;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.enchantment = enchantment;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String getEnchantment() {
        return enchantment;
    }

    public void setEnchantment(String enchantment) {
        this.enchantment = enchantment;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
        System.out.println("Имя - " + getName());
        System.out.println("Атака - " + getDamage());
        System.out.println("Вес - " + getWeight());
        System.out.println("Зачарование - " + getEnchantment());
        System.out.println("Скорость атаки - " + getAttackSpeed());
    }
}