public class LatihanArray{
    public static void main(String[] args) {
        String nama[] = {"Arham","Faisal","Miky","Suardi","Cipung","Futri","Aril","Mamat","Sabir","Aiman"};
        
        System.out.println("==== Nama ====");
        for(int i=0; i<nama.length; i++){
            System.out.println(nama[i]);
        }
        
        System.out.println("\nIndeks ke-3: "+nama[3]);
        System.out.println("Indeks ke-6: "+nama[6]);
    }
}
