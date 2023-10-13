import java.util.Scanner;
public class Hari3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Aritmatika");
        
        System.out.print("Angka pertama : ");
        int angka1 = input.nextInt();
        
        System.out.print("Angka kedua : ");
        int angka2 = input.nextInt();
        
        System.out.println(angka1 +" + " +angka2 +" = " +(angka1 + angka2));
        System.out.println(angka1 +" - " +angka2 +" = " +(angka1 - angka2));
        System.out.println(angka1 +" x " +angka2 +" = " +(angka1 * angka2));
        System.out.println(angka1 +" : " +angka2 +" = " +(angka1 / angka2));
        System.out.println(angka1 +" % " +angka2 +" = " +(angka1 % angka2));
    }
}
