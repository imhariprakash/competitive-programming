import java.util.Scanner;
 
class MangoTrees{ // O(n^2) - n (rows) and n (cols)
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[][] array = {{'.', '#', '#', '.', '.', '.'},
                         {'#', '.', '.', '#', '#', '.'},
                         {'.', '#', '.', '.', '.', '.'},
                         {'.', '#', '#', '.', '.', '#'},
                         {'#', '.', '.', '#', '#', '.'},
                         {'.', '#', '.', '.', '.', '.'}
                        };

        int[] rows = getRowCount(array);
        int[] cols = getColCount(array);
        int total = getTotalCount(rows);

        int horizontalLine = getMininumDistance(rows, total);
        int verticalLine = getMininumDistance(cols, total);

        printArray(array, horizontalLine, verticalLine);


    }

    public static void printArray(int[][] array, int row, int col){
        for(int i = 0; i < array.length; i++){
            if(i == row){
                for(int k = 0; k <= array[i].length; k++){
                    System.out.print("- ");
                }
                System.out.println();
            }
            for(int j = 0; j < array[i].length; j++){
                if(j == col){
                    System.out.print("| ");
                }
                System.out.print((char)array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getMininumDistance(int[] array, int total){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < array.length - 1; i++){
            sum += array[i];
            if(Math.abs(sum - (total - sum)) < min){
                min = Math.abs(sum - (total - sum));
                minIndex = i;
            }
        }
        return minIndex + 1;
    }

    public static int getTotalCount(int[] array){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }

    public static int[] getRowCount(int[][] array){
        int[] rows = new int[array.length];
        for(int i = 0; i < array.length; i++){
            rows[i] = 0;
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == '#'){
                    rows[i]++;
                }
            }
        }
        return rows;
    }

    public static int[] getColCount(int[][] array){
        int[] cols = new int[array[0].length];
        for(int i = 0; i < array[0].length; i++){
            cols[i] = 0;
            for(int j = 0; j < array.length; j++){
                if(array[j][i] == '#'){
                    cols[i]++;
                }
            }
        }
        return cols;
    }
}