import java.util.Scanner;
public class GajiPegawai {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Program Hitung Gaji Pegawai");
        System.out.print("Masukkan jumlah hari kerja: ");
        int jumlah_hari = input.nextInt();
        System.out.print("Masukkan gaji harian: Rp.");
        int gaji_harian = input.nextInt();
        System.out.print("Masukkan uang makan harian: Rp.");
        int uang_makan = input.nextInt();
        
        int gaji_kotor = jumlah_hari * gaji_harian;
        System.out.println("Gaji kotor: Rp."+gaji_kotor);
        int total_uang_makan = jumlah_hari * uang_makan;
        System.out.println("Total uang makan: Rp."+total_uang_makan);
        int gaji_bersih = gaji_kotor - total_uang_makan;
        System.out.println("Gaji bersih: Rp."+gaji_bersih);
        
        System.out.println("");
        System.out.println("==== Gaji Pegawai ====");
        System.out.println("Gaji harian: Rp."+gaji_harian);
        System.out.println("Jumlah hari kerja: "+jumlah_hari);
        System.out.println("Uang makan: Rp."+uang_makan);
        System.out.println("Gaji kotor: Rp."+gaji_kotor);
        System.out.println("Total uang makan: Rp."+total_uang_makan);
        System.out.println("Gaji bersih: Rp."+gaji_bersih);
    }
}
