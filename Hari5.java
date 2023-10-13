public class OperatorLogika {
    public static void main(String[] args) {
        int nilai1 = 30;
        int nilai2 = 20;
        int nilai3 = 30;
        
        //Logika AND = && (bernilai false jika salah satunya bernilai false)
        System.out.println("Nilainya adalah " + (nilai1 > nilai2 && nilai3 == nilai1));
        
        //Logika OR = || (bernilai true jika salah satunya bernilai true)
        System.out.println("Nilainya adalah " + (nilai1 > nilai2 || nilai3 == nilai1));
        
        //Logika NOT = ! (Digunakan untuk satu operan saja dan akan bernilai true jika hasilnya false dan sebaliknya)
        int operan = 200;
        boolean tes = (operan > 100);
        System.out.println("Nilainya adalah " + ! tes);
    }
}
