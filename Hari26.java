import java.util.Scanner;
public class Toko_Semua_Ada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int no;
        String nama_pembeli;
        int n;
        
        System.out.print("No. Transaksi : ");
        no = input.nextInt();
        
        System.out.print("Nama Pembeli : ");
        nama_pembeli = input.next();
        
        System.out.print("Jumlah Transaksi : ");
        n = input.nextInt();
        
        String nama_barang[] = new String[n];
        int jumlah_pembelian[] = new int[n];
        int harga_satuan[] = new int[n];
        int total_harga[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Barang ke-"+(i+1)+" :");
            System.out.print("Nama barang : ");
            nama_barang[i] = input.next();
            System.out.print("Jumlah Pembelian : ");
            jumlah_pembelian[i] = input.nextInt();
            System.out.print("Harga Satuan : ");
            harga_satuan[i] = input.nextInt();
            total_harga[i] = jumlah_pembelian[i] * harga_satuan[i];
            System.out.println("Total Harga : "+total_harga[i]);
        }
        
        int total_keseluruhan = 0;
        for (int i = 0; i < n; i++) {
            total_keseluruhan = total_keseluruhan+total_harga[i];
        }
        System.out.println("");
        System.out.println("Toko Semua Ada");
        System.out.println("No. Transaksi : "+no);
        System.out.println("Nama Pembeli : "+nama_pembeli);
        System.out.println("====================================================================");
        System.out.println("No.   Nama Barang    Jumlah Pembelian    Harga Satuan    Total Harga");
        System.out.println("====================================================================");
        
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"   " +nama_barang[i]+"      " +jumlah_pembelian[i]+"      Rp." +harga_satuan[i]+"      Rp." +total_harga[i]);
        }
        System.out.println("====================================================================");
        System.out.println("");
        System.out.println("Total Harga Keseluruhan     : Rp."+total_keseluruhan);
        System.out.print("Keterangan                  : ");
        
        if (total_keseluruhan >= 300000) {
            System.out.println("30%");
            System.out.println("Total Pembayaran            : Rp."+ (total_keseluruhan - (total_keseluruhan * 30 /100)));
        }else if (total_keseluruhan >= 200000) {
            System.out.println("20%");
            System.out.println("Total Pembayaran            : Rp."+ (total_keseluruhan - (total_keseluruhan * 20 /100)));
        }else if (total_keseluruhan >= 100000) {
            System.out.println("10%");
            System.out.println("Total Pembayaran            : Rp."+ (total_keseluruhan - (total_keseluruhan * 10 /100)));
        }else if (total_keseluruhan < 100000) {
            System.out.println("Tidak Dapat Diskon");
            System.out.println("Total Pembayaran            : Rp."+ total_keseluruhan);
        }
    }
}
