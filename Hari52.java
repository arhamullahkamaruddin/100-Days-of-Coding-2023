import java.util.Scanner;
public class MenghitungJumlahBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlah = 0;
        
        System.out.print("Masukkan batas suatu bilangan: ");
        int batas = input.nextInt();
        
        for (int i = 1; i <= batas; i++) {
            System.out.print(i+" ");
            jumlah += i;
        }
        
        System.out.println("Jumlah dari total bilangan di atas adalah: "+jumlah);
    }
}
