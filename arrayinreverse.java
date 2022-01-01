import java.util.Scanner;

/**
 * arrayinreverse
 */
public class arrayinreverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int[] arr = new int[n] ;
        insertintoarray(arr ,scn);
        printinreverse (arr);
        scn.close();
    }

    private static void insertintoarray(int[] arr, Scanner scn) {
        for (int i = 0  ; i < arr.length ;i++){
            arr[i]=scn.nextInt();
        }

    }

    private static void printinreverse(int[] arr) {
        int i = arr.length - 1 ;
        while (i >= 0){
            System.out.println(arr[i]);
            i--;
        }
    }
}