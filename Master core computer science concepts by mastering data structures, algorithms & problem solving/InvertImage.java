import java.util.Scanner;
 
class InvertImage{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] matrix = getMatrix();

        invertImage(matrix);

        printMatrix(matrix);
    }

    public static void invertImage(int[][] matrix){
        int start = 0;
        int end = matrix.length - 1;

        while(end > start){
            for(int i = 0; i < (end - start); i++){
                swap(matrix, start, start + i, start + i, end);
                swap(matrix, start, start + i, end, end - i);
                swap(matrix, start, start + i, end - i, start);
            }
            start++;
            end--;
        }
    }

    public static void swap(int[][] matrix, int i, int j, int m, int n){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[m][n];
        matrix[m][n] = temp;
    }

    public static int[][] getMatrix(){
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for(int i=0;i<rows;++i){
            for(int j=0;j<columns;++j){
                System.out.print("Enter the value of element ["+i+"]["+j+"]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[i].length;++j){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}