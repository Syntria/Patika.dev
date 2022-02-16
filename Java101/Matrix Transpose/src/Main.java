public class Main {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},{4, 5, 6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
                
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose Matrix:");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "   ");

                
            }
            System.out.println();
            
        }
    }
}
