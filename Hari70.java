import java.util.Scanner;
public class Bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan "+bilangan+" adalah bilangan genap");
        } else {
            System.out.println("Bilangan "+bilangan+" adalah bilangan ganjil");
        }
    }
}
