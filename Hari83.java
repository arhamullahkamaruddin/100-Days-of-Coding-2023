import java.util.Scanner;
public class MenghitungLajuAirVolumeAirWaktuPengisian {
    static void TampilkanMenu(){
        System.out.println("SELAMAT DATANG DI PROGRAM HITUNG LAJU AIR, VOLUME AIR, DAN WAKTU PENGISIAN");
        System.out.println("=================================== MENU =================================");
        System.out.println("[1] Menghitung Laju Air");
        System.out.println("[2] Menghitung Volume Air");
        System.out.println("[3] Menghitung Waktu Pengisian");
        System.out.println("[4] Exit");
        System.out.print("PILIH MENU > ");

        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("");
        switch(n){
            case 1:
                HitungLajuAir();
                break;
            case 2:
                HitungVolumeAir();
                break;
            case 3:
                HitungWaktuPengisian();
                break;
            case 4:
                System.out.println("Terima Kasih Telah Menggunakan Program Ini");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
        }
        System.out.println("");
    }

    static void HitungLajuAir(){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan volume air (dalam liter): ");
        double volume_air = input.nextDouble();

        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = input.nextDouble();

        double laju_air = volume_air / waktu;

        System.out.println("Laju air adalah: "+laju_air+" liter/detik");
    }

    static void HitungVolumeAir(){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan laju air (dalam liter/detik): ");
        double laju_air = input.nextDouble();

        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = input.nextDouble();

        double volume_air = laju_air * waktu;

        System.out.println("Volume air adalah: "+volume_air+" liter");
    }

    static void HitungWaktuPengisian(){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan volume air (dalam liter): ");
        double volume_air = input.nextDouble();

        System.out.print("Masukkan laju air (dalam liter/detik): ");
        double laju_air = input.nextDouble();

        double waktu = volume_air / laju_air;

        System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" detik");
    }

    public static void main(String[] args) {
        do{
            TampilkanMenu();
        }while(true);
    }
}
