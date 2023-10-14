import java.util.Scanner;
public class LatihanIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai : ");
        int nilai = input.nextInt();
        
        if(nilai >= 70){
            System.out.println("Selamat anda lulus!");
        }
    }
}
