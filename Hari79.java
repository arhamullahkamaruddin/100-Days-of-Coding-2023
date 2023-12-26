import java.util.Scanner;
public class Angka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            for (int i = 0; i < angka; i+=2){
                System.out.print(i+" ");
            }
        } else {
            for (int i = 1; i < angka; i+=2){
                System.out.print(i+" ");
            }
        }
    }
}
