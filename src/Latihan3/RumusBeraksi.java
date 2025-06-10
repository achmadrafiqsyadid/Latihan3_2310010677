package latihan3;



public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus
        Rumus rafiq = new Rumus();

        // Mengatur nilai atribut
        rafiq.sisi = 5;
        rafiq.panjang = 7;
        rafiq.lebar = 4;

        // Menghitung luas persegi
        rafiq.luasPersegiRafiq();
        System.out.println("Luas Persegi: " + rafiq.getHasilRafiq());

        // Menghitung luas persegi panjang
        rafiq.luasPersegiPanjangRafiq();
        System.out.println("Luas Persegi Panjang: " + rafiq.getHasilRafiq());
    }
}
