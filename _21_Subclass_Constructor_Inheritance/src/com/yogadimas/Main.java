package com.yogadimas;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Esmeralda", 10); // ini memakai constructor superclass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Dimas", 10); // 
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Yoga");
        hero3.display();
    }
}
