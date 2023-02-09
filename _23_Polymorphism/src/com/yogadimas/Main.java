package com.yogadimas;

// is a
// subclass is a superclass
// superclass isn't a subclass
public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Yoga");
        HeroStrength hero2 = new HeroStrength("Dimas");
        hero1.display();
        hero2.display();

        // Polymorphic
        // tipe data Hero, object Agility
        Hero hero3 = new HeroAgility("Pambudi");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Mahmud");
        hero4.display();
        hero4.showOff();

        // tidak bisa
        // HeroIntel hero4 = new Hero("Mahmud");
        // hero4.display();

        // Array list
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; // casting dari HeroAgility menjadi Hero

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        // method calls
        // kumpulanHero[3].showOff(); // ini tidak bisa, akibat dari casting tadi dan
        // pada class Hero tidak ada method showOff()
        hero4.showOff();

        // aplikasi, parameter memiliki tipe data Hero, sehingga semua turunan kelas Hero bisa dijadikan argument pada method attack
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);

    }

}
