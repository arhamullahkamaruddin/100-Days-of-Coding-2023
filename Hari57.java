import java.util.Scanner;
public class Data_Pembeli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Pembeli : ");
        int n = input.nextInt();
        
        String nama[] = new String[n];
        int totalBeli[] = new int[n];
        
        for(int i=0; i<nama.length; i++){
            System.out.println("Masukkan nama Pembeli ke-" +(i+1));
            
            System.out.print("Nama pembeli : ");
            nama[i] = input.next();
            System.out.print("Total Pembelian : ");
            totalBeli[i] = input.nextInt();
        }
        
        System.out.println("=======================================================================");
        System.out.println("No   Nama Pembeli   Total Pembelian   Total Bayar   Ket");
        System.out.println("=======================================================================");
        
        for(int i=0; i<nama.length; i++){
            System.out.print((i+1) +"    " +nama[i] +"        " +totalBeli[i] +"        ");
            if(totalBeli[i] >= 400000){
                System.out.print(totalBeli[i] - (totalBeli[i] * 20 / 100)+"        ");
                System.out.println("Diskon 20%");
            }else if(totalBeli[i] >= 300000){
                System.out.print(totalBeli[i] - (totalBeli[i] * 10 / 100)+"        ");
                System.out.println("Diskon 10%");
            }else if(totalBeli[i] >= 100000){
                System.out.print(totalBeli[i] - (totalBeli[i] * 5 / 100)+"        ");
                System.out.println("Diskon 5%");
            }else if(totalBeli[i] <= 100000){
                System.out.print(totalBeli[i]+"        ");
                System.out.println("Tidak Dapat Diskon");
            }
            System.out.println("=======================================================================");
        }
    }
}
