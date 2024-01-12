import java.util.Scanner;
public class HukumNewton {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Program Hukum Newton untuk Gerakan Lurus");

        System.out.print("\nMasukkan massa benda (kg): ");
        double massa = input.nextDouble();

        System.out.print("Masukkan percepatan benda (m/s^2): ");
        double percepatan = input.nextDouble();

        double gaya = massa * percepatan;

        System.out.println("\nGaya yang bekerja pada benda: "+gaya+" N");
    }
}
