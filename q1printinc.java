import java.util.Scanner;

/**
 * q1printinc
 */
public class q1printinc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

      printdecreasing(n);
      scn .close();


         
    }

    private static void printdecreasing(int n) {

        if (n < 0){
            return ;
        }

        System.out.println(n);
        printdecreasing(n-1);

    }
}