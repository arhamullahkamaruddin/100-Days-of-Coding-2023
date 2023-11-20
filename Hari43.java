import java.util.Scanner;
public class VolumeBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Selamat Datang di Program Hitung Volume Balok");
        
        System.out.print("Masukkan panjang balok: ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar balok: ");
        int lebar = input.nextInt();
        
        System.out.print("Masukkan tinggi balok: ");
        int tinggi = input.nextInt();
        
        int volume = panjang * lebar * tinggi;
        
        System.out.println("");
        System.out.println("Volume dari balok tersebut adalah "+volume);
    }
}
