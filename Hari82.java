import java.util.Scanner;
public class Waktu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan volume air (dalam liter): ");
        double volume_air = input.nextDouble();

        System.out.print("Masukkan laju air (dalam liter/detik): ");
        double laju_air = input.nextDouble();

        double waktu = volume_air / laju_air;

        System.out.println("Waktu yang dibutuhkan adalah: "+waktu+" detik");
    }
}
