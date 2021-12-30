import java.util.Scanner;

/**
 * powerlogmethod
 */
public class powerlogmethod {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int res = printPower(x,n);
        System.out.println(res);
        scn.close();

    }

    private static int printPower(int x, int n) {
        if(n==0){
            return 1;

        }

        int pres =  printPower(x, n/2);

        int res =  pres* pres ;
        if(n % 2 == 1 ){
            res*=x;
        }


        return res;
    }
}