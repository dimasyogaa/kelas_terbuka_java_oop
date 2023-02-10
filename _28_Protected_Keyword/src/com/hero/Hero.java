package com.hero;

public abstract class Hero {
    protected String name; // ini hanya bisa diakses oleh subclass dari Hero, tidak disarankan protected pada attribute
    private int level;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public abstract void display();

    protected String getName() {
        String str = "name : " + this.name + " - " + this.level;
        return str;
    }

    protected void setName(String name) {
        this.name = name;
    }

}
