package com.yogadimas;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("\nPenulis\t: " + this.penulis);
    }
}

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami");
        buku1.display();

        // Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        // assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku1 dan buku2 berada pada address atau referensi yang sama
        buku2.judul = "Membunuh komandantur";
        buku1.display();
        buku2.display();

        // kita akan memasukkan object ke dalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();

    }

    // pass by reference 
    // dihindari dalam OOP, sehingga diperlukan enkapsulasi, agar atribut dan method ada aturan untuk mengaksesnya tidak secara bebas akses
    public static void fungsi(Buku dataBuku) {
        String addressBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressBuku);
        dataBuku.penulis = "Haruki Mahalkami";
    }

}

/*
 * object sama seperti array pada java yaitu pass by reference
 * tidak membuat alokasi memori baru
 * tidak menduplikasi
 * memberikan alamat addressnya
 * 
 * jika ingin menduplikasi ada method khususnya
 */
