import java.util.Scanner;

/**
 * incercreasingOrder
 */
public class incercreasingOrder {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         printIncreasing(n);
         scn.close();
    }

    private static void printIncreasing(int n) {
        if (n == 0){
            return ;
        }
    
        printIncreasing(n-1);
        System.out.println(n);
    }
}