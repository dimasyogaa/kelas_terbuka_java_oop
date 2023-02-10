package com.yogadimas;

import com.hero.HeroAgility;
import com.hero.HeroIntel;
import com.hero.HeroStrength;

public class Main {
    public static void main(String[] args) {

        // membuat object dari kelas non-abstract
        HeroIntel hero1 = new HeroIntel("Yoga");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("Dimas");
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Pambudi");
        hero3.display();

        hero1.levelUp();
        hero2.levelUp();
        hero3.levelUp();

        hero1.display();
        hero2.display();
        hero3.display();

    }
}
