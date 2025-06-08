package hitung;

public class Matematika {
    // Variabel bil1 dan bil2 bertipe double
    private double bil1;
    private double bil2;

    // Constructor untuk mengisi nilai bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Method setPenjumlahan yang mengembalikan hasil bil1 + bil2
    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    // Method setPengurangan yang mengembalikan hasil bil1 - bil2
    public double setPengurangan() {
        return bil1 - bil2;
    }

    // Method setPerkalian yang mengembalikan hasil bil1 * bil2
    public double setPerkalian() {
        return bil1 * bil2;
    }

    // Method setPembagian yang mengembalikan hasil bil1 / bil2
    public double setPembagian() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0; // atau bisa lempar exception kalau mau lebih ketat
        }
    }
}
