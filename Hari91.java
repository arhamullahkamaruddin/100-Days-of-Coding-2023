import java.util.Scanner;
public class Rambutan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan berat rambutan (kg): ");
        int beratRambutan = input.nextInt();
        
        int hargaPerKg = 10000;
        
        int totalHarga = beratRambutan*hargaPerKg;

        System.out.println("Total harga rambutan: Rp "+totalHarga);
    }
}
