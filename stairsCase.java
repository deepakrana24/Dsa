import java.util.ArrayList;
import java.util.Scanner;

/**
 * stairsCase
 */
public class stairsCase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
        
        scn.close();
    }
    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
             ArrayList <String> bres = new ArrayList <>();
             bres.add("");
              return bres ; 
        }
        
        
          if(n < 0){
             ArrayList <String> bres = new ArrayList <>();
          
              return bres ; 
        }
               ArrayList <String> allPathWays =  new ArrayList<>();
               ArrayList <String> smallPathWay_1 = getStairPaths(n-1);
               for (String str : smallPathWay_1){
                   allPathWays.add("1"+str);
               }
               ArrayList <String> smallPathWay_2 = getStairPaths(n-2);    
               ArrayList <String> smallPathWay_3 = getStairPaths(n-3);
               
                for (String str : smallPathWay_2){
                    allPathWays.add("2"+str);
                }
                for (String str : smallPathWay_3){
                    allPathWays.add("3"+str);
                }
              
        return allPathWays;
    }

}



