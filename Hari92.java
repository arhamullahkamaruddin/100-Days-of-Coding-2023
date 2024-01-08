import java.util.Scanner;
public class Langsat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan berat langsat (kg): ");
        int beratLangsat = input.nextInt();
        
        int hargaPerKg = 5000;
        
        int totalHarga = beratLangsat*hargaPerKg;

        System.out.println("Total harga langsat: Rp "+totalHarga);
    }
}
