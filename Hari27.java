import java.util.Scanner;
public class Tabel_Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tabel Perkalian");
        
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        
        System.out.println("Berikut adalah tabel perkalian " +angka);
        
        for(int i=0; i<10; i++){
            System.out.println(angka +" x "+ (i+1) +" = "+ angka*(i+1));
        }
    }
}
