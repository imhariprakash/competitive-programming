import java.util.Scanner;
 
class PascalTriangle{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int[][] array = new int[n][];

        for(int i = 1; i <= n; i++){
            array[i - 1] = new int[i];
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    array[i - 1][j - 1] = 1;
                }
                else{
                    array[i - 1][j - 1] = array[i - 2][j - 2] + array[i - 2][j - 1];
                }
            }
        }

        printPascalTriangle(array);
    }

    public static void printPascalTriangle(int[][] array){
        for(int i = 1; i <= array.length; i++){
            for(int j = 1; j <= array[i - 1].length; j++){
                System.out.print(array[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}