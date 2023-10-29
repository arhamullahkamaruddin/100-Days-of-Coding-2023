import java.util.Scanner;
public class BelajarArraJava {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("MMasukkan jumlah nama: ");
        int n = input.nextInt();
        
        String nama[] = new String[n];
        
        for (int i = 0; i < n; i++){
            System.out.print("Nama ke-"+(i+1)+": ");
            nama[i] = input.next();
        }
        System.out.println("");
        
        System.out.println("Nama yang telah dimasukkan: ");
        for (int i = 0; i < n; i++){
            System.out.println((i+1)+". "+nama[i]);
        }
    }
    
}
