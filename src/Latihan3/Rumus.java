package latihan3;

/**
 * Nama  : Achmad Rafiq Syaddid
 * NPM   : 2310010677
 * Kelas : 4A
 */
public class Rumus {

    // Atribut bertipe bilangan bulat
    public int sisi;
    public int panjang;
    public int lebar;
    public int hasil;

    // Konstruktor
    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }

    // Method menghitung luas persegi
    public void luasPersegiRafiq() {
        hasil = sisi * sisi;
    }

    // Method menghitung luas persegi panjang
    public void luasPersegiPanjangRafiq() {
        hasil = panjang * lebar;
    }
}
