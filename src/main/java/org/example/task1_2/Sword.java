package org.example.task1_2;

/*В классе Меча, я добавил два метода и конструктор. Первый метод заточка меча, а второй метод меняет зачарование.
 Во втором методе мы смотрим, если наше зачарование увеличивает урон, то вызваем первый метод и увеличиваем урон*/
public class Sword {
    private String name;
    private int damage;
    private int attackSpeed;
    private String enchantment;
    private int weight;

    public void sharpenSword(int increaseDamage) {
        this.damage += increaseDamage;
    }

    public void changeEnchantment(String newEnchantment, int increaseDamage) {
        this.enchantment = newEnchantment;
        this.sharpenSword(increaseDamage);
    }

    public Sword(String name, int damage, int attackSpeed, String enchantment, int weight) {
        this.name = name;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.enchantment = enchantment;
        this.weight = weight;
    }

    public void description() {
        System.out.println("Имя - " + name);
        System.out.println("Атака - "+ damage);
        System.out.println("Вес - "+ weight);
        System.out.println("Зачарование - "+ enchantment);
        System.out.println("Скорость атаки - "+ attackSpeed);
        System.out.println();
    }

    public static void main(String[] args) {
        Sword sword = new Sword("Steel sword", 15, 20, "Paralysis", 4);
        sword.description();
        sword.sharpenSword(4);
        sword.changeEnchantment("Stamina recovery", 0);
        sword.description();

        Sword blade = new Sword("The Blade of Merunes Dagon", 10 , 40, "50% chance of double damage", 1);
        blade.sharpenSword(10);
        blade.description();

        Sword dwemerSword = new Sword("Dwemer sword", 14, 15, null, 5);
        dwemerSword.changeEnchantment("Electric charge", 15);
        dwemerSword.description();
   }
}
