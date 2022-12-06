import java.util.Scanner;
class MatrixMultiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows in matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the no. of columns in matrix 1: ");
        int c1 = sc.nextInt();
        System.out.println("Matrix 1: ");
        int mat1[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the no. of rows in matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the no. of columns in matrix 2: ");
        int c2 = sc.nextInt();
        System.out.println("Matrix 2: ");
        int mat2[][] = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        int mat3[][] = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < r2; k++){    
                    mat3[i][j] += mat1[i][k] * mat2[k][j];;                    
                }
            }
        }

        System.out.println("Matrix 3:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mat3[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
