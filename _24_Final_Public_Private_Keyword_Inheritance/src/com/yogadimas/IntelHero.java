package com.yogadimas;

// public ini akan terbuka untuk semuanya
public class IntelHero extends Hero {

    IntelHero(String name, double health) {
        super(name, health);
        // System.out.println(this.health); tidak bisa diakses karena private
    }

    // override getHealth();
    // karena di superclass method public, maka di subclass harus public
    // public double getHealth() {
    // return this.health; // ini tidak mau, karena atribut ini pada superclass
    // memiliki visibility private
    // }

    // visibility harus sama dengan superclass
    public void display() {
        System.out.println(this.name + " mempunyai banyak " + this.getHealth());
    }

    // kita coba override setter, ternyata tidak bisa mengoverride method dengan
    // visibility final
    // tidak bisa dilakukan
    // final void setHealth(double newHealth) {
    // System.out.println("Mencoba memasukkan health = " + newHealth);
    // }

    // ini bisa dilakukan
    void setHealth(String newHealth) {
        System.out.println("Mencoba memasukkan health = " + newHealth);
    }

}
