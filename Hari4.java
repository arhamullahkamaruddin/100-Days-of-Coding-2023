import java.util.Scanner;
public class HitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;
        
        System.out.println("Selamat Datang di Program Hitung Luas Persegi Panjang");
        
        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = input.nextInt();
        
        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = input.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas dari persegi panjang tersebut adalah : "+luas);
        
    }
}
