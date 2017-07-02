import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /**
    * Method to calculate funny string.
    * String is funny if for String S and reversed of S R
    * |S[i] - S[i-1]| = |R[i] - R[i-1]|
    * for i = 1 to length of S - 1
    */
    static String funnyString(String s){
        
        //Set default result to Funny
        String result = "Funny";
        
        //Reverse the String
        String reversed = new StringBuilder(s).reverse().toString();
        
        for(int i = 1 ; i < s.length(); i++){
            //Calculate absolute value of original and reversed
            int originalCount = Math.abs(s.charAt(i) - s.charAt(i-1));
            int reversedCount = Math.abs(reversed.charAt(i) - reversed.charAt(i-1));
            
            //if the count is not equal, string is not funny
            if(originalCount != reversedCount){
                result = "Not Funny";
                break;
            }
        }
        
        return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
