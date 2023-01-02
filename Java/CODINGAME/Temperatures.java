import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if(n == 0){ 
            System.out.println(0); 
            return;
        }
        
        int minPos = Integer.MAX_VALUE;
        int minNeg = Integer.MIN_VALUE;
        int cpos = 0;
        int cneg = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if(x >= 0){
                cpos++;
                if(minPos > x){
                    minPos = x;
                }
            }
            else{
                cneg++;
                if(minNeg < x){
                    minNeg = x;
                }
            }
             // a temperature expressed as an integer ranging from -273 to 5526
        }
        
        if(cpos > cneg){
            System.out.println(minPos);
            
        }
        else if(cneg > cpos){
            System.out.println(minNeg);
        }
        else{
            System.out.println(minPos);
        }
        
    }
}