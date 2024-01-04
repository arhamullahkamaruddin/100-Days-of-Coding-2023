import java.util.Scanner;
public class Pinjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah pinjaman: ");
        double jumlahPinjaman = input.nextDouble();
        
        if (jumlahPinjaman > 3000000) {
            double bunga = jumlahPinjaman * 0.1;
            double totalPinjaman = jumlahPinjaman + bunga;

            System.out.println("Jumlah pinjaman: "+jumlahPinjaman);
            System.out.println("Bunga 10%: "+bunga);
            System.out.println("Total pinjaman: "+totalPinjaman);
        } else {
            System.out.println("Pinjaman kurang dari atau sama dengan 3 juta, tidak ada bunga.");
        }
    }
}
