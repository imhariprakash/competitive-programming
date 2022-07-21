import java.util.ArrayList;

// [0000, 0001, 0010, 0100, 0101, 1000, 1001, 1010] : 4 bits n = 4 : 2^4 = 16

public class binaryString {


    ArrayList<String> v;

    void helper(StringBuilder str, int n,int i){
        if(i==n){
            v.add(str.toString());
            return;
        }
        StringBuilder s1=  new StringBuilder(str.toString());
        s1.append('0');
        helper(s1,n,i+1);

        if((i>0 && str.charAt(i-1)=='0') || (i == 0)){
            str.append('1');
            helper(str,n,i+1);
        }
    }

    ArrayList<String> binaryStrings(int n){
        v = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        helper(str,n,0);
        return v;

    }

    public static void main(String[] args) {
        binaryString b = new binaryString();
        System.out.println(b.binaryStrings(4));
    }
}