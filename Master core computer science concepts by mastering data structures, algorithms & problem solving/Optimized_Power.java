import java.util.Scanner;
 
class Optimized_Power{ // doing for +ve exponent only -> add if negative exponent and change to float
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        System.out.println("Result: " + optimizedPower(base, exponent));
    }

    public static int optimizedPower(int base, int exponent){
        if(exponent == 1){
            return base;
        }
        // if(exponent == -1){
        //     return 1/base;  
        // }
        if(exponent == 0){
            return 1;
        }
        int subproblem = optimizedPower(base, exponent/2); // 2^n -> 2^(n/2)
        if(exponent % 2 == 0){
            return subproblem * subproblem;
        }
        else{
            return base * subproblem * subproblem;
        }
    }
}