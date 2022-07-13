import java.util.Scanner;
 
class LastOccurrence_Of_a_number_in_an_array{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] array= {1,2,3,4,1,7,2,3,4,1,2};
        System.out.println(getLastOccurence(array, 0, -1, 7));
    }

    public static int getLastOccurence(int[] array, int start, int index, int key){ 
        if(start == array.length){
            return index;
        }
        if(array[start] == key){
            index = start;
        }
        return getLastOccurence(array, start+1, index, key);
    }
}