package org.example.task_oop;

public class Armor {
    private String name;
    private int protection;
    private int weight;
    private String enchantment;

    public Armor(String name, int protection, int weight, String enchantment) {
        this.name = name;
        this.protection = protection;
        this.weight = weight;
        this.enchantment = enchantment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEnchantment() {
        return enchantment;
    }

    public void setEnchantment(String enchantment) {
        this.enchantment = enchantment;
    }

    public void improvementsArmor(int increaseProtect, int weightElement) {
        this.protection += increaseProtect;
        this.weight += weightElement;
    }

    public void changesEnchantment(String newEnchantment) {
        this.enchantment = newEnchantment;
    }

    public void description() {
        System.out.println("Имя - " + this.name);
        System.out.println("Защита - "+ this.protection);
        System.out.println("Вес - "+ this.weight);
        System.out.println("Зачарование - "+ this.enchantment);
        System.out.println();
    }
}
