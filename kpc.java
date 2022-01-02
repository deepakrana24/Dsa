import java.util.ArrayList;
import java.util.Scanner;

public class kpc {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         String str = "";
         str = scn.next();
         
         ArrayList<String> arylst =getkpc(str , 0);
         System.out.println(arylst);
         scn.close();
         

    }
    public static String[] keys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    private static ArrayList<String> getkpc(String str,  int idx) {

        if(idx == str.length()) {
            ArrayList <String> bres = new ArrayList<>() ;
            bres.add("");
            return bres ;
        }

        char fch = str.charAt(idx);
       

        String fstr = keys[fch -'0'];//  tu are extracted now 
        /// to use  fstr convert the tu string to character array 
       

         ArrayList<String> rres = getkpc(str, idx+1) ;
         ArrayList<String> mres = new ArrayList<>();

          for (Character ch : fstr.toCharArray()){

            // now loop on  string get at idx+1 to make a new arrray list 
             for ( String  sch : rres ){
                 System.out.println("sch is :"+sch+"ch is: "+ch);
                 mres.add(ch+sch);
             }

          }


          // return myres -> mres

          return mres;
          
        
    }
}
