import java.util.Scanner;
public class Durian {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan berat durian (kg): ");
        int beratDurian = input.nextInt();
        
        int hargaPerKg = 20;
        
        int totalHarga = beratDurian*hargaPerKg;

        System.out.println("Total harga durian: Rp "+totalHarga);
    }
}
