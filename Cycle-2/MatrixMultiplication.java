import java.util.Scanner;
public class MatrixMultiplication {
    void defineMatrix(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. of rows of the matrix: ");
            int row = sc.nextInt();
            System.out.print("Enter the no. of columns of the matrix: ");
            int col = sc.nextInt();
            System.out.println("Enter the elements of the matrix: ");
            int[][] matrix = new int[row][col];
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Matrix 1");

        }
    }
}
