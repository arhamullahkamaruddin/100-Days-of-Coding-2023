import java.util.Scanner;
public class Hambatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tegangan (V): ");
        double tegangan = input.nextDouble();

        System.out.print("Masukkan arus (I): ");
        double arus = input.nextDouble();

        double hambatan = tegangan / arus;

        System.out.println("Hambatan (R): "+hambatan+" ohm");
    }
}
