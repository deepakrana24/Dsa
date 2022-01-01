import java.util.Scanner;

/**
 * firstindex
 */
public class firstindex {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int [n];
        insertintoarray(arr ,scn);   
        int target = scn.nextInt() ;
        System.out.println();
        printfirstIndex(arr , target ,0) ; 
        scn.close(); 


        
    }

    private static void printfirstIndex(int[] arr, int target ,int idx ) {

        if( idx == arr.length - 1) return ;

        if ( arr[idx] == target ){
            System.out.println(idx);
            return ;
        }
        printfirstIndex(arr, target, idx+1);
        
    }

    private static void insertintoarray(int[] arr, Scanner scn) {

        for (int i = 0 ; i < arr.length ; i++){
             arr[i]= scn.nextInt();
        }



    }
}