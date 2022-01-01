import java.util.Scanner;

/**
 * lastindex
 */
public class lastindex {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn .nextInt();
        int[] arr = new int [n];
        insertintoarray(arr , scn);
        int target = scn.nextInt() ;
        System.out.println();
        int lastindex =findLastIndex(arr , target , 0);
        System.out.println(lastindex);
        
        scn.close();
    }

    private static int findLastIndex(int[] arr, int target, int idx) {
        
        if (idx == arr.length) return -1;
        if ( idx == arr.length - 1  ){
            if(arr[idx]== target){
                return idx ;
            }
            else{
                return  -1;
            }
        }; 
        

        
       int indexFromLast = findLastIndex(arr, target, idx+1);
        if( indexFromLast == -1){
            if(arr[idx]==target){
                return idx;
            }else{
                return - 1 ;
            }

        } else {
            return indexFromLast ;
        }
        
    }

    private static void insertintoarray(int[] arr, Scanner scn) {
        
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt() ;

        }


    }
}