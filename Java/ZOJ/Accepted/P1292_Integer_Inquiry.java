package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1292 Integer Inquiry
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=292
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2012-07-04 20:46:35
 * @Runtime: 150 ms
 * @Solution:
 * @Note:
 */
//ZOJ 1292 Integer Inquiry http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=292
//Accepted 2012-07-04 20:46:35 Run Time(ms) = 150 Run Memory(KB) = 633
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1292 Integer Inquiry
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=292
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2012-07-04 20:46:35
 * @Runtime: 150 ms
 * @Solution:
 * @Note:
 */

import java.math.BigInteger;
import java.util.Scanner;

public class P1292_Integer_Inquiry {

    public static void main(String[] argn) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        BigInteger result;
        for (int i = 0; i < x; i++) {
            result = BigInteger.ZERO;
            while (true) {
                String x2 = sc.next();
                if (x2.equals("0")) {
                    break;
                }
                BigInteger big = new BigInteger(x2);
                result = result.add(big);
            }
            System.out.println(result);
            if (i < x - 1) {
                System.out.println();
            }
        }
    }

}
