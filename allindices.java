import java.util.Scanner;

/**
  * allindices
  */
 public class allindices {
 
     public static void main(String[] args) {
         Scanner scn =new Scanner(System.in);
         int n = scn.nextInt();
         int [] arr1 = new int [n];
         insertintoarray(arr1 ,scn);
         int target = scn.nextInt();
         int [] arr2 = getallindices(arr1 , target, 0 ,0);
         displayArray(arr2);
         scn.close();
         

     }

    private static void displayArray(int[] arr2) {
        System.out.println();
        for(int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }

    private static int [] getallindices(int[] arr1, int target ,int idx , int fsf ) {

        if (idx == arr1.length -1 ) {
            return  new int[fsf];

        } ; 
        
        if (arr1[ idx ] == target  ) {
            int [] arr2 = getallindices(arr1, target, idx+1 ,fsf+1);
            arr2[fsf]= idx ;
            return arr2 ;
            
        }
        else{
            int [] arr2 = getallindices(arr1, target, idx+1 ,fsf);
            return arr2;
        }
    
    }

    private static void insertintoarray(int[] arr1, Scanner scn) {

        for(int i = 0 ; i< arr1.length ;i++){
            arr1[i]= scn.nextInt();
        }

    }
 }