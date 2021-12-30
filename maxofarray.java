import java.util.Scanner;

/**
 * maxofarray
 */
public class maxofarray {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n =  scn.nextInt();
         int [] arr = new int [n];
         insertIntoArray(arr, scn);
         int max = findmaxofArray(arr ,0);
         System.out.println(max);
         scn.close();
    }

    private static int findmaxofArray(int[] arr , int idx ) {
        if (idx == arr.length - 1 ){
             
            return arr[idx];
        }
          
      
        int pmax =  findmaxofArray(arr, idx+1);
        int max = 0 ; 
         if ( arr [idx] > pmax){
             max = arr[idx];
               
         } else{
             max = pmax ;
         }
        return max;
    }

    private static void insertIntoArray(int[] arr , Scanner scn) {

        for ( int  i = 0 ; i < arr.length ;i++){
             arr[i]=scn.nextInt();
        }
    }
}