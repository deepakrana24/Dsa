import java.util.Scanner;

/**
 * displayAarry
 */
public class displayAarry {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in );
         int  n = scn.nextInt();
         int[] arr = new int [ n ];
         insertarray(arr, scn);
         System.out.println();
         displayArray(arr,0);
         scn.close();
    }

    private static void displayArray(int[] arr, int idx) {
         if (idx == arr.length){
            return ;
         }
          
         System.out.println(arr[idx]);
         displayArray( arr , idx + 1);

    }

    private static void insertarray(int[] arr, Scanner scn) {
          for(int i=0 ; i < arr.length; i++){
              arr[i]= scn.nextInt();
          }
    }
}