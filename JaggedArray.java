
public class JaggedArray {

    public static void main(String[] args) {

        int[][] matrix = new int[2][];

        matrix[0] = new int[2];
        matrix[1] = new int[3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;

        matrix[1][0] = 1;
        matrix[1][1] = 30;
        matrix[1][2] = 50;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
