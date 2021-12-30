import java.util.Scanner;

/**
 * powerlinear
 */
// x raised to power to be calculated 
public class powerlinear {

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = printpower(n , x);
        System.out.println(res);
        scn.close();
    }

    private static int printpower(int n, int x) {

        if (n == 0){
            return 1;
        }

        int pres = printpower(n-1, x);

        int res = x * pres ;

        return res ;

    }
}