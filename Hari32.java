import java.util.Scanner;
public class HitungGaji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Hitung Gaji Pegawai");

        System.out.print("Masukkan nama pegawai: ");
        String nama_pegawai = scanner.next();

        System.out.print("Masukkan gaji pokok: ");
        int gaji_pokok = scanner.nextInt();
        
        System.out.print("Masukkan tunjangan: ");
        int tunjangan = scanner.nextInt();
        
        int gaji_total = gaji_pokok + tunjangan;

        System.out.println("");
        System.out.println("===== Hasil Perhitungan Gaji =====");
        System.out.println("Nama Karyawan: " + nama_pegawai);
        System.out.println("Gaji Pokok: " + gaji_pokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji Total: " + gaji_total);
    }
}
