import java.util.Scanner;

/*
    problem : Find displacement - given a long route having n,s,e,w directions 
    find the shortest route to reach the destination.

    input : snnnewe
    output : nne

    explanation : sn -> initial point
                  nn -> n direction
                  ew -> where started from nn
                  e -> e direction
                  solution : nne
 */
 
class Shortest_path{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        int north = 0, east = 0;

        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'n':
                    north++;
                    break;
                case 's':
                    north--;
                    break;
                case 'e':
                    east++;
                    break;
                case 'w':
                    east--;
                    break;
            }
        }

        if(north == 0  && east == 0){
            System.out.println("No displacement");
            return;
        }

        if(north > 0){
            for(int i = 0; i < north; i++){
                System.out.print("n");
            }
        }
        else if(north < 0){
            for(int i = 0; i < -north; i++){
                System.out.print("s");
            }
        }

        if(east > 0){
            for(int i = 0; i < east; i++){
                System.out.print("e");
            }
        }
        else if(east < 0){
            for(int i = 0; i < -east; i++){
                System.out.print("w");
            }
        }            
    }
}



/*  wrong answer : nnnnssss -> op: no need to move -> this approach -> nnnnsss -> wrong
    for(i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'n' && str.charAt(i + 1) == 's'){
                i++;
            }
            else if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'w'){
                i++;
            }
            else if(str.charAt(i) == 's' && str.charAt(i + 1) == 'n'){
                i++;
            }
            else if(str.charAt(i) == 'w' && str.charAt(i + 1) == 'e'){
                i++;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
        if(i == str.length() - 1){
            System.out.println(str.charAt(i));
        }
 */