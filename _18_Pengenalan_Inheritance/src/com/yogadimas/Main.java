package com.yogadimas;

// inheritance adalah hubungan is-a
// interface adalah hubungan has-a

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Yoga";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Dimas";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Pambudi";
        hero3.display();

    }

}
