import java.util.Scanner;
public class LajuAir {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan volume air (dalam liter): ");
        double volume_air = input.nextDouble();

        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = input.nextDouble();

        double laju_air = volume_air / waktu;

        System.out.println("Laju air adalah: "+laju_air+" liter/detik");
    }
}
