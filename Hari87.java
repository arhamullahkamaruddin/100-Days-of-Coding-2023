import java.util.Scanner;
public class SensorCahaya {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan nilai sensor cahaya: ");
        int cahaya = input.nextInt();

        if (cahaya < 500) {
            System.out.println("Hidupkan Lampu");
        } else {
            System.out.println("Matikan lampu");
        }
    }
}
