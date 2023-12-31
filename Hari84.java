import java.util.Scanner;
public class Lampu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Lampu Hidup ");
        } else {
            System.out.println("Lampu Mati");
        }
    }
}
