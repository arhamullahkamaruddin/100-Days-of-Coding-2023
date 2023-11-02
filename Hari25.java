package Ngoding100Hari;
import java.util.Scanner;
public class BelajarArrayJava {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("MMasukkan jumlah barang: ");
        int n = input.nextInt();
        
        String barang[] = new String[n];
        int harga_barang[] = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.print("Barang ke-"+(i+1)+": ");
            barang[i] = input.next();
            System.out.print("Harga barang: Rp.");
            harga_barang[i] = input.nextInt();
        }
        System.out.println("");
        
        System.out.println("Barang yang telah dimasukkan: ");
        for (int i = 0; i < n; i++){
            System.out.println((i+1)+". "+barang[i]);
            System.out.println("   Harga: Rp."+harga_barang[i]);
        }
    }
    
}
