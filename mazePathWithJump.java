import java.util.ArrayList;
import java.util.Scanner;

/**
 * mazePathWithJump
 */
public class mazePathWithJump {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList <String> res =  getMazePathsWithJumps(0 , 0 , n -1 , m - 1);
        System.out.println(res);
        scn.close();
    }

    private static ArrayList<String> getMazePathsWithJumps(int sc, int sr, int dc, int dr) {
        
        // +ve base case 

        if (sc == dc || sr == dr ){
            ArrayList <String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        //  our resultant
        ArrayList <String>  mres = new ArrayList<>();
        

        // here all three movements allowed  v,h , d 
        int jump = 1 ; 
        // horizontal
        while (sc+jump <= dc) {

            ArrayList <String>  hres = getMazePathsWithJumps(sc + jump, sr, dc, dr);

            for (String str : hres){
                mres.add("h"+ jump + str);
            }

            jump++;
            
        }


         jump = 1 ; 
        // vertical
        while (sc+jump <= dc) {

            ArrayList <String>  vres = getMazePathsWithJumps(sc , sr+jump, dc, dr);

            for (String str : vres){
                mres.add("v"+ jump + str);
            }

            jump++;
            
        }



         jump = 1 ; 
        // diagonal 
        while (sc+jump <= dc) {

            ArrayList <String>  dres = getMazePathsWithJumps(sc + jump, sr + jump, dc, dr);

            for (String str : dres){
                mres.add("d"+ jump + str);
            }

            jump++;
            
        }





        return mres;
    }
}