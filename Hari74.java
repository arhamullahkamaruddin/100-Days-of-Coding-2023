import java.util.Scanner;
public class Tegangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai arus (I): ");
        double arus = input.nextDouble();

        System.out.print("Masukkan nilai hambatan (R): ");
        double hambatan = input.nextDouble();
        
        double tegangan = arus * hambatan;
        
        System.out.println("Nilai tegangan (V) adalah: "+tegangan+" Volt");
    }
}
