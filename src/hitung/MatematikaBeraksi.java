package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika rafiq = new Matematika(7,7);

        System.out.println("Hasil Penjumlahan : " + rafiq.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + rafiq.setPengurangan());
        System.out.println("Hasil Perkalian   : " + rafiq.setPerkalian());
        System.out.println("Hasil Pembagian   : " + rafiq.setPembagian());
    }
}
