public class Fungsi {
    public static int tambahkan(int a, int b) {
        int hasil = a + b;
        return hasil;
    }
    
    public static void main(String[] args) {
        int hasilTambah = tambahkan(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilTambah);
    }
}
