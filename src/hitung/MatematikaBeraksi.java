
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika mtk = new Matematika(10.5, 4.5);

        // Menampilkan hasil penjumlahan
        double hasil = mtk.setPenjumlahan();
        System.out.println("Hasil Penjumlahan: " + hasil);
    }
}
