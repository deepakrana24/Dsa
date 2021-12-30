import java.util.Scanner;

/**
 * printdecInc
 */
public class printdecInc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printdecIncfunc(n);
        scn.close();
    }

    private static void printdecIncfunc(int n) {
        if (n == 0 ){
            return ; 
        }
        System.out.println(n);
        printdecIncfunc(n-1);
        System.out.println(n);

    }
}