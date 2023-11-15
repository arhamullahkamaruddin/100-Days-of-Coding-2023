import java.util.Scanner;
public class HitungKelilingBangunDatar {
    static void TampilMenu(){
        System.out.println("SELAMAT DATANG DI PROGRAM HITUNG KELILING BANGUN DATAR");
        System.out.println("======================== MENU ========================");
        System.out.println("[1] Segitiga");
        System.out.println("[2] Persegi Panjang");
        System.out.println("[3] Persegi");
        System.out.println("[4] Lingkaran");
        System.out.println("[5] Trapesium");
        System.out.println("[6] Belah Ketupat");
        System.out.println("[7] Jajargenjang");
        System.out.println("[8] Layang-layang");
        System.out.println("[9] Exit");
        System.out.println("======================================================");
        System.out.print("PILIH MENU > ");
        
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        
        switch(menu){
            case 1:
                Segitiga();
                break;
            case 2:
                PersegiPanjang();
                break;
            case 3:
                Persegi();
                break;
            case 4:
                Lingkaran();
                break;
            case 5:
                Trapesium();
                break;
            case 6:
                BelahKetupat();
                break;
            case 7:
                Jajargenjang();
                break;
            case 8:
                LayangLayang();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
        System.out.println(" ");
    }
    
    static void Segitiga(){
        Scanner input = new Scanner(System.in);
        
        int a, b, c;
        System.out.print("Masukkan panjang sisi pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan panjang sisi kedua: ");
        b = input.nextInt();
        System.out.print("Masukkan panjang sisi ketiga: ");
        c = input.nextInt();

        int kelilingSegitiga = a + b + c;
        System.out.println("Keliling segitiga: " + kelilingSegitiga);
    }
    
    static void PersegiPanjang(){
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar;
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        int kelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);
    }
    
    static void Persegi(){
        Scanner input = new Scanner(System.in);
        
        int sisi;
        System.out.print("Masukkan panjang sisi: ");
        sisi = input.nextInt();

        int kelilingPersegi = 4 * sisi;
        System.out.println("Keliling persegi: " + kelilingPersegi);
    }
    
    static void Lingkaran(){
        Scanner input = new Scanner(System.in);
        
        int jariJari;
        System.out.print("Masukkan panjang jari-jari: ");
        jariJari = input.nextInt();

        int kelilingLingkaran = (int) (2 * Math.PI * jariJari);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
    
    static void Trapesium(){
        Scanner input = new Scanner(System.in);
        
        int atas, bawah, sisiKiri, sisiKanan;
        System.out.print("Masukkan panjang sisi atas: ");
        atas = input.nextInt();
        System.out.print("Masukkan panjang sisi bawah: ");
        bawah = input.nextInt();
        System.out.print("Masukkan panjang sisi kiri: ");
        sisiKiri = input.nextInt();
        System.out.print("Masukkan panjang sisi kanan: ");
        sisiKanan = input.nextInt();

        int kelilingTrapesium = atas + bawah + sisiKiri + sisiKanan;
        System.out.println("Keliling trapesium: " + kelilingTrapesium);
    }
    
    static void BelahKetupat(){
        Scanner input = new Scanner(System.in);
        
        int sisiBelahKetupat;
        System.out.print("Masukkan panjang sisi: ");
        sisiBelahKetupat = input.nextInt();

        int kelilingBelahKetupat = 4 * sisiBelahKetupat;
        System.out.println("Keliling belah ketupat: " + kelilingBelahKetupat);
    }
    
    static void Jajargenjang(){
        Scanner input = new Scanner(System.in);
        
        int alas, miring;
        System.out.print("Masukkan panjang sisi alas: ");
        alas = input.nextInt();
        System.out.print("Masukkan panjang sisi miring: ");
        miring = input.nextInt();

        int kelilingJajargenjang = 2 * (alas + miring);
        System.out.println("Keliling jajargenjang: " + kelilingJajargenjang);
    }
    
    static void LayangLayang(){
        Scanner input = new Scanner(System.in);
        
        int diagonal1, diagonal2;
        System.out.print("Masukkan panjang diagonal 1: ");
        diagonal1 = input.nextInt();
        System.out.print("Masukkan panjang diagonal 2: ");
        diagonal2 = input.nextInt();

        int kelilingLayangLayang = 2 * (diagonal1 + diagonal2);
        System.out.println("Keliling layang-layang: " + kelilingLayangLayang);
    }
    
    public static void main(String[] args) {
        do{   
            TampilMenu();
        }while(true);
    }
}
