package latihan3;

public class Rumus {

    // Atribut bertipe bilangan bulat
    public int sisi;
    public int panjang;
    public int lebar;
    public int hasil;

    // Konstruktor untuk menyetel semua nilai ke nol
    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }

    // Method mutator menghitung luas persegi
    public void luasPersegiRafiq() {
        hasil = sisi * sisi;
    }

    // Method mutator menghitung luas persegi panjang
    public void luasPersegiPanjangRafiq() {
        hasil = panjang * lebar;
    }

    // Method accessor untuk mengembalikan nilai hasil
    public int getHasilRafiq() {
        return hasil;
    }
}
