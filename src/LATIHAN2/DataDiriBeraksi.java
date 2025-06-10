package LATIHAN2;

public class DataDiriBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Datadiri dengan nama objek: rafiq
        Datadiri rafiq = new Datadiri("Rafiq ", "2310010677", "TI-4A");

        // Menampilkan data
        System.out.println("Nama  : " + rafiq.getNama());
        System.out.println("NPM   : " + rafiq.getNpm());
        System.out.println("Kelas : " + rafiq.getKelas());
    }
}
