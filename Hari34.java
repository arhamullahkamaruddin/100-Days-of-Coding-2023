import java.util.Scanner;
public class MenghitungJarak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kecepatan dalam m/s: ");
        int kecepatan = input.nextInt();

        System.out.print("Masukkan waktu dalam detik: ");
        int waktu = input.nextInt();
        
        int jarak = kecepatan * waktu;
        
        System.out.println("Jarak yang ditempuh sejauh: "+jarak+" meter");
    }
}
