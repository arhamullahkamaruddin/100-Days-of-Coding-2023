import java.util.*;
public class RumusMenghitungJarakKecepatanWaktu {
    static void TampilMenu(){
        System.out.println("SELAMAT DATANG DI PROGRAM HITUNG JARAK, KECEPATAN DAN WAKTU");
        System.out.println("========================== MENU ===========================");
        System.out.println("[1] Menghitung Kecepatan");
        System.out.println("[2] Menghitung Jarak");
        System.out.println("[3] Menghitung Waktu");
        System.out.println("[4] Keluar");
        System.out.println("===========================================================");
        System.out.print("PILIH MENU> ");
        
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        
        switch(menu){
            case 1:
                HitungKecepatan();
                break;
            case 2:
                HitungJarak();
                break;
            case 3:
                HitungWaktu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
        System.out.println(" ");
    }
    
    static void HitungKecepatan(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung kecepatan");
        System.out.print("Masukkan jarak dalam meter: ");
        int jarak = input.nextInt();

        System.out.print("Masukkan waktu dalam detik: ");
        int waktu = input.nextInt();
        
        int kecepatan = jarak / waktu;
        
        System.out.println("Kecepatan adalah: "+kecepatan+" m/s");
    }
    
    static void HitungJarak(){
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Jarak");
        System.out.print("Masukkan kecepatan dalam m/s: ");
        int kecepatan = input.nextInt();

        System.out.print("Masukkan waktu dalam detik: ");
        int waktu = input.nextInt();
        
        int jarak = kecepatan * waktu;
        
        System.out.println("Jarak yang ditempuh sejauh: "+jarak+" meter");
    }
    
    static void HitungWaktu(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Waktu");
        System.out.print("Masukkan jarak dalam meter: ");
        int jarak = input.nextInt();

        System.out.print("Masukkan kecepatan dalam m/s: ");
        int kecepatan = input.nextInt();
        
        int waktu = jarak / kecepatan;
        
        System.out.println("Waktu adalah: "+waktu+" detik");
    }
    
    public static void main(String[] args) {
        do{   
            TampilMenu();
        }while(true);
    }
}
