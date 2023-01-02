package ZOJ;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 2736 Daffodil number
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=1736
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2012-07-05 20:06:26
 * @Runtime: 90 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;


public class P2736_Daffodil_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int sum = 0;
            for (int i = 0; i < s.length(); i++){ 		
                sum += (int)(Math.pow(s.charAt(i)-'0', 3));
            }
            System.out.println(s.equals(""+sum) ? "Yes":"No");				
        }
    }

}
