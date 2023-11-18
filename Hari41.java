import java.util.Scanner;
public class KonversiMataUang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Konversi mata uang dollar ke rupiah");
        System.out.println("");
      
        System.out.print("Masukkan jumlah uang dalam bentuk dollar: $");
        int dollar = input.nextInt();
      
        int rupiah = dollar * 15000;
      
        System.out.println("$"+dollar+" jika dikonversi ke rupiah adalah Rp."+rupiah);
    }
}
