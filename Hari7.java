import java.util.Scanner;
public class LatihanIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = input.next();
        
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        
        if(nilai >= 70){
            System.out.println("Selamat " +nama+ " anda lulus");
        }else{
            System.out.println("Mohon maaf " +nama+ " anda gagal");
        }
    }
}
