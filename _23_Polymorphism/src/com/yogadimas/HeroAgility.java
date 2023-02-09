package com.yogadimas;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type \t: " + this.type);
    }

    void showOff(){
        System.out.println("Saya hero Agility!!");
    }

}
