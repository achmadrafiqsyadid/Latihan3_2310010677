package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika(10.5, 4.5);

        System.out.println("Hasil Penjumlahan : " + mtk.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + mtk.setPengurangan());
        System.out.println("Hasil Perkalian   : " + mtk.setPerkalian());
        System.out.println("Hasil Pembagian   : " + mtk.setPembagian());
    }
}
