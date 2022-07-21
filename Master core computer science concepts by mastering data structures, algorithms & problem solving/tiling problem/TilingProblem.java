import java.util.Scanner;
 
class TilingProblem{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the m: ");
        int m = sc.nextInt();
        System.out.print(tiles(n, m));
    }

    public static int tiles(int n, int m){
        if(n < m){
            return 1;
        }
        int opt1 = tiles(n -1, m);
        int opt2 = tiles(n - m, m);
        return opt1 + opt2;
    }
}