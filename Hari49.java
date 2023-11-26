import java.util.Scanner;
public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi: ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar persegi: ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;

        System.out.println("Luas persegi: " + luas);
    }
