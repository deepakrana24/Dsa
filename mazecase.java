import java.util.*;

public class mazecase {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
    
        
        ArrayList <String> res = getMazePaths( 0 , 0 , m - 1 , n - 1 );
        System.out.println(res);
        
        scn.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // two moves available h and v only 
         
         // positive base case
         
         if (sr == dr && sc == dc){
             ArrayList <String> bres = new ArrayList<>();
             bres.add("");
             return bres ; 
              
         }
        // negitive base 

        if( sc < 0 || sr < 0 || sc > dr || sr > dc ){
            ArrayList <String> bres = new ArrayList<>();
            return bres ; 
        }



         // our resultant array list 
         ArrayList <String> mres = new ArrayList<>();
         
         // movements  horizontals 
        //  if(sr < dr || sc < dc || sr >= 0 || sc >= 0){
             // smart calls to avoid negitive base case 
             
             ArrayList<String> hres = getMazePaths( sr, sc+1 ,dr,dc);
             
             for (String str : hres){
                 mres.add("h" + str );
             }
             
        //  }
         // vertical movements 
         
        //  if(sr < dr || sc < dc || sr >= 0 || sc >= 0){
            // smart calls to avoid negitive base case 
            
            ArrayList<String> vres = getMazePaths( sr+1, sc ,dr,dc);
            
            for (String str : vres){
                mres.add("v" + str );
            }
            
        // }
        return mres;
    }

}