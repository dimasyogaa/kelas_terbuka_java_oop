package com.yogadimas;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nHero hero1 = new Hero(\"Yoga\");\n============");
        Hero hero1 = new Hero("Yoga");
        hero1.display();

        System.out.println("============\n");

        // kita sebut class Object sebagai superclass dari semua class yang ada di java
        Object hero2 = hero1;
        String hero2_str = hero2.toString();
        String hero1_str = hero1.toString();
        System.out.println("\nObject hero2 = hero1\n============");
        System.out.println("hero1 address : " + hero1_str);
        System.out.println("hero2 address : " + hero2_str);

        System.out.println("============\n");

        // salah satu method dari class Object adalah equals
        System.out.println("hero1.equals(hero2)\n============");
        System.out.println(hero1.equals(hero2));
        System.out.println("============\n");

        // contoh dari equals
        Hero hero3 = new Hero("Yeo");
        Hero hero4 = new Hero("Yeo");
        Hero hero5 = new Hero("Yeo");

        System.out.println("\nHero hero3 = new Hero(\"Yeo\");");
        System.out.println("Hero hero4 = new Hero(\"Yeo\");\n============");
        System.out.println("hero3 address : " + hero3.toString());
        System.out.println("hero4 address : " + hero4.toString());
        System.out.println("============\n");

        Jagoan hero6 = new Jagoan("Yeo");
        System.out.println("\nJagoan hero6 = new Jagoan(\"Yeo\");\n============");
        System.out.println("Jagoan hero6 address : " + hero6.toString());
        System.out.println("============\n");

        System.out.println("hero3.equals(hero4)\n============");
        System.out.println(hero3.equals(hero4));
        System.out.println("============\n");

        System.out.println("hero3.equals(hero6)\n============");
        System.out.println(hero3.equals(hero6));
        System.out.println("============\n");

        System.out.println("hero3.equals(hero1)\n============");
        // override equals di class Hero
        System.out.println(hero3.equals(hero1));
        System.out.println("============\n");


    }
}
