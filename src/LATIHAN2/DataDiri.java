
package LATIHAN2;


public class Datadiri {
    private String nama;
    private String npm;
    private String kelas;

    // Konstruktor
    public Datadiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // (Optional) Getter untuk melihat isi atribut
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getKelas() {
        return kelas;
    }
}
