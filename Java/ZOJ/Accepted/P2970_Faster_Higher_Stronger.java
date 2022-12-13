package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 2970 Faster, Higher, Stronger
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=1969
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-06-08 03:30:14
 * @Runtime: 146 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;

public class P2970_Faster_Higher_Stronger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            String check = "";
            check = sc.next();
            int answer = 0;
            int ntest = sc.nextInt();	
            if (check.equalsIgnoreCase("Faster")) {		
                for (int j = 0; j < ntest; j++) {
                    int faster = sc.nextInt();
                    if(j==0) answer = faster;
                    if(faster<=answer) answer = faster;
                }			
                System.out.println(answer);
            }else if ( check.equalsIgnoreCase("higher")||check.equalsIgnoreCase("Stronger") ) {
                for (int j = 0; j < ntest; j++) {
                    int HigherAndStronger = sc.nextInt();
                    if(j==0)answer = HigherAndStronger;
                    if(HigherAndStronger>=answer) answer = HigherAndStronger;
                }
                System.out.println(answer);
            }
        }
    }

}
