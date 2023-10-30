package org.example.task1_3;

/* Задача 1.3
 * Для третей задачи я использовал класс Воина из второй задачи.
 * Для этого класса мы создали поля, а также создали метод который дает текстовое описание
 * нашего класса. И в главном методе мы демонстрируем побочный эффект передачи обьекта по ссылке.
 * Мы снача создали воина Норда, у которого определны все характеристики, и после этого мы создали
 * воина Имперца, у которого нет характеристик. Мы присваеваем обьект норд, к обьекту имперца, и полуаем,
 * что у нас два обьекта указывают на одну область памяти. При попытке изменить поля обьекта имперца, у нас
 * меняются и поля обьекта норд, и тем самым мы получаем побочный эффект передачи обьекта по ссылки.
 * */

import java.util.Arrays;

public class Warriors {
    private String name;
    private int level;
    private int health;
    private int endurance;
    private int mana;
    private String race;
    private String[] skills = {"One-handed weapon", "Heavy armor", "Blacksmith"};

    public Warriors(String name, int level, int health, int endurance, int mana, String race) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.endurance = endurance;
        this.mana = mana;
        this.race = race;
    }

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Уровень - " + level);
        System.out.println("Здоровье - " + health);
        System.out.println("Выносливость - " + endurance);
        System.out.println("Мана - " + mana);
        System.out.println("Раса - " + race);
        System.out.println("Навыки - " + Arrays.toString(skills));
        System.out.println();
    }

    public static void main(String[] args) {
        Warriors nordWarriors = new Warriors("kadir", 2, 110, 100, 100, "Nord");
        Warriors imperialWarriors;
        imperialWarriors = nordWarriors;

        nordWarriors.description();
        imperialWarriors.description();

        imperialWarriors.name = "Tuliy";
        imperialWarriors.race = "Imperial";

        nordWarriors.description();
        imperialWarriors.description();

    }
}
