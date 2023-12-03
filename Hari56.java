public class BelajarArray2Dimensi {
    public static void main(String[] args) {
        int[][] array2D = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = i + j;
            }
        }

        System.out.println("Isi Array 2D:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
