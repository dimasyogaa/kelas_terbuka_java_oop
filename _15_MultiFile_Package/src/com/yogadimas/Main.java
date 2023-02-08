package com.yogadimas;

// keyword import untuk package eksternal
import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
       Player player1 = new Player("Yoga");
       Player player2 = new Player("Dimas");
       Player player3 = new Player("Pambudi");
       player1.show();
       player2.show();
       player3.show();

       Console.log("hallo");
       Console.log("Hallo");
    }
}
