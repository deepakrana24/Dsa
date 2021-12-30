import java.util.Scanner;

/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        {
            Scanner  scn = new Scanner(System.in);
            int n = scn.nextInt();
            int fac = printfactorial(n);
            System.out.println(fac);
            scn.close();

        }
    }

    private static int printfactorial(int n) {

        if(n == 0){
             return 1;
        }


         int pfac =printfactorial(n-1);
         int fac = n * pfac ;
         return fac;
    }
}