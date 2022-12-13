package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1078 Palindrom Numbers
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=78
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-06-04 02:36:25
 * @Runtime: 17 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;


public class P1078_Palindrom_Numbers {

    public static void main(String[] agrs) {  
        Scanner s = new Scanner(System.in);  
        int input = s.nextInt();  
        while (input != 0) {  
            String base = "";
            boolean foundPalindrom = false;  
            for (int i = 2; i <= 16; i++) {  
                if (checkEqualsReverse(changeBase(input, i)) == true) {  
                    base+= " " + i;
                    foundPalindrom = true;  
                }  
            }  
            if (foundPalindrom == false) {  
                System.out.println("Number " + input + " is not a palindrom");  
            } else {  
                System.out.println("Number " + input + " is palindrom in basis"+base);   
            }  
            input = s.nextInt();  
        }  
    }
    
    static boolean checkEqualsReverse(String regex) {  
        StringBuffer sbuff = new StringBuffer(regex);  
        sbuff = sbuff.reverse();  
        return regex.equals(sbuff.toString());  
    }

    static String changeBase(int base10, int newBase) {  
        return Integer.toString(base10, newBase); 
    }


}
