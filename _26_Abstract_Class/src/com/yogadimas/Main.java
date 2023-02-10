package com.yogadimas;

import com.hero.HeroAgility;
import com.hero.HeroIntel;

public class Main {
    public static void main(String[] args) {

        // membuat object dari kelas non-abstract
        HeroIntel hero1 = new HeroIntel("Yoga");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("Dimas");
        hero2.display();

        // membuat object dari kelas abstract
        // Hero hero3 = new Hero("Dimas");
        // hero3.display();

    }
}
