import java.util.Scanner;
public class MenghitungTeganganArusHambatan {
    static void TampilkanMenu(){
        System.out.println("SELAMAT DATANG DI PROGRAM HITUNG TEGANGAN, ARUS, & HAMBATAN");
        System.out.println("=========================== MENU ==========================");
        System.out.println("[1] Menghitung Tegangan");
        System.out.println("[2] Menghitung Arus");
        System.out.println("[3] Menghitung Hambatan");
        System.out.println("[4] Exit");
        System.out.print("PILIH MENU > ");
        
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("");
        switch(n){
            case 1:
                HitungTegangan();
                break;
            case 2:
                HitungArus();
                break;
            case 3:
                HitungHambatan();
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
    
    static void HitungTegangan(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai arus (I): ");
        double arus = input.nextDouble();

        System.out.print("Masukkan nilai hambatan (R): ");
        double hambatan = input.nextDouble();

        double tegangan = arus * hambatan;

        System.out.println("Nilai tegangan (V) adalah: "+tegangan+" Volt");
    }
    
    static void HitungArus(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tegangan (V): ");
        double tegangan = input.nextDouble();

        System.out.print("Masukkan nilai hambatan (R): ");
        double hambatan = input.nextDouble();

        double arus = tegangan / hambatan;

        System.out.println("Nilai arus (I) adalah: " + arus + " Ampere");
    }
    
    static void HitungHambatan(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tegangan (V): ");
        double tegangan = input.nextDouble();

        System.out.print("Masukkan arus (I): ");
        double arus = input.nextDouble();

        double hambatan = tegangan / arus;

        System.out.println("Hambatan (R): "+hambatan+" Ohm");
    }
    
    public static void main(String[] args) {
        do{
            TampilkanMenu();
        }while(true);
    }
}
