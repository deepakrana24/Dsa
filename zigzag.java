import java.util.Scanner;

/**
 * zigzag
 */
public class zigzag {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printzigzag(n);
        scn.close();
    }

    private static void printzigzag(int n) {
        if(n==0){
            return ;
        }
        // pre of node 
        System.out.print(n+ " ");
        printzigzag(n-1);
        System.out.print(n+ " ");
        printzigzag(n-1);
        System.out.print(n+ " ");
    }
}