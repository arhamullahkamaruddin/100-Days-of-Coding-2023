import java.util.Scanner;
public class segitiga{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();
        
        System.out.println("Segitiga Terbalik:");
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
