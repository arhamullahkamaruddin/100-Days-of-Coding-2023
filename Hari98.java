import java.util.Scanner;
public class PeminjamanBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nama peminjam: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan judul buku: ");
        String buku = input.nextLine();
        
        System.out.println("Batas peminjaman: 7 hari");
        
        System.out.print("Masukkan hari pengembalian: ");
        int kembali = input.nextInt();
        
        System.out.println("\n=== Perpustakaan Gadam ===");
        System.out.println("Nama peminjam: "+nama);
        System.out.println("Judul buku: "+buku);
        System.out.println("Batas peminjaman buku: 7 hari");
        System.out.println("Hari penegembalian buku: "+kembali+" hari");
        if (kembali > 7) {
            int denda = (kembali - 7) * 2000;
            System.out.println("Jika terlambat, maka akan di denda Rp.2000 per jumlah hari yang terlambat");
            System.out.println("Denda : Rp."+denda);
        } else {
            System.out.println("Pengembalian buku tepat waktu");
            System.out.println("Denda: -");
        }
    }
}
