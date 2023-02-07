package com.yogadimas;

class Mahasiswa {
    // Data member
    String nama = "nama asli";
    String NIM;

    // Constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    /* Note : 
    Mahasiswa(String nama, String inputNIM) {
    // local scope mengambil prioritas paling tinggi
    System.out.println(nama);

    // this : objek
    // this.nama == mahasiswa1.nama
    // variabel "nama" diluar method ini (bukan nama parameter pada method
    ini/global scope) di dalam class ini
    System.out.println(this.nama);

    } */

    // 1.  method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.NIM);
    }

    // 2. method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // 3. method dengan return dan tanpa parameter
    String getName() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // 4. method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}



public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("yoga", "13305041");
        // System.out.println(mahasiswa1.nama);

        // method 
        mahasiswa1.show();
        mahasiswa1.setNama("dimas");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getName());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);

  
        
    }

}