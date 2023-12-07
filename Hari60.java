import java.util.Scanner;
public class PertukaranBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();
        
        System.out.print("Masukkan nilai y: ");
        int y = input.nextInt();
        
        System.out.print("Masukkan nilai z: ");
        int z = input.nextInt();
        
        System.out.println("");
        System.out.println("Keadaan awal");
        System.out.println("Nilai x adalah: "+x);
        System.out.println("Nilai y adalah: "+y);
        System.out.println("Nilai z adalah: "+z);
        
        x = y;
        y = z;
        z = x;
        
        System.out.println("");
        System.out.println("Keadaan setelah ditukar");
        System.out.println("Nilai x adalah: "+x);
        System.out.println("Nilai y adalah: "+y);
        System.out.println("Nilai z adalah: "+z);
    }
}
