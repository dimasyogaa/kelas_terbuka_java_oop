package com.hero;

public class HeroStrength extends Hero {

    public HeroStrength(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Nama : " + this.name);
        // System.out.println(this.getName());
    }

    public void setName(String name) {
        super.setName(name);
    }

}
