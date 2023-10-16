import java.util.Scanner;
public class Latihan_IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        if(nilai >= 90){
            System.out.println("Anda Mendapatkan nilai A");
        }else if(nilai >= 80){
            System.out.println("Anda Mendapatkan nilai B+");
        }else if(nilai >= 70){
            System.out.println("Anda Mendapatkan nilai B");
        }else if(nilai >= 60){
            System.out.println("Anda Mendapatkan nilai C+");
        }else if(nilai >= 50){
            System.out.println("Anda Mendapatkan nilai C");
        }else if(nilai >= 40){
            System.out.println("Anda Mendapatkan nilai D");
        }else{
            System.out.println("Anda Mendapatkan nilai E");
        }
    }
}
