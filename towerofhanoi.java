import java.util.Scanner;

/**
 * towerofhanoi
 */
public class towerofhanoi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int q = scn.nextInt();
        int r = scn.nextInt();

        printTowerOfhanoi( n , p, q, r) ;
        scn.close();
    }

    private static void printTowerOfhanoi(int n, int t1, int t2, int t3) {

        // tower o f hanoai  is all about the palcing of dices

        if(n == 0){
            return ;
        }

        printTowerOfhanoi(n-1, t1 ,t3, t2 );
        
        System.out.println(n+"["+t1+"->"+t2+"]");
        printTowerOfhanoi(n-1,t3 , t1 , t2 ); 


    }

}