import java.util.Scanner;
public class VolumeAir {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan laju air (dalam liter/detik): ");
        double laju_air = input.nextDouble();

        System.out.print("Masukkan waktu (dalam detik): ");
        double waktu = input.nextDouble();

        double volume_air = laju_air * waktu;

        System.out.println("Volume air adalah: "+volume_air+" liter");
    }
}
