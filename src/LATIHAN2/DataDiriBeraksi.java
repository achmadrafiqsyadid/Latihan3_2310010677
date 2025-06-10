package LATIHAN2;

public class DataDiriBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Datadiri dengan nama objek: rafiq
        Datadiri rafiq = new Datadiri("Rafiq Alamsyah", "231234567", "TI-2B");

        // Menampilkan data
        System.out.println("Nama  : " + rafiq.getNama());
        System.out.println("NPM   : " + rafiq.getNpm());
        System.out.println("Kelas : " + rafiq.getKelas());
    }
}
