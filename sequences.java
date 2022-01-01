import java.util.ArrayList;
import java.util.Scanner;

/**
 * sequences
 */
public class sequences {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "";             
        str = scn.next();
        ArrayList <String> res = getss(str , " " , 0);
        System.out.println(res);
        scn.close();

    }

    private static ArrayList <String> getss(String str, String output, int idx) {

        if (idx == str.length()){
            return new ArrayList<>(); 
            
        }

        char ch = str.charAt(idx);
        String subStr = str.substring(1);

         ArrayList<String> pres = getss(subStr, output + ch , idx+1); // for yes 
         ArrayList<String> ppres = getss(subStr, output , idx+1); // for no 
         ArrayList<String> mres = new ArrayList<>();


         for (String i : pres){
             mres.add(i);
         }


         for (String i : ppres){
            mres.add(i);
         }

        return mres;



    }
}