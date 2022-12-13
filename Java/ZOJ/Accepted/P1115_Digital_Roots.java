package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1115 Digital Roots
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=115
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2012-06-27 20:31:21
 * @Runtime: 30 ms
 * @Solution:
 * @Note:
 */

import java.util.Scanner;

public class P1115_Digital_Roots {

    static String SumDigit(String a) {
        int SumDigit = 0;
        for (int i = 0; i < a.length(); i++) {
            SumDigit += (a.charAt(i) - '0');
        }
        return SumDigit + "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = "";
            a = sc.next();
            if (a.equals("0")) {
                break;
            }
            while (a.length() > 1) {
                a = SumDigit(a);
            }
            System.out.println(a);
        }
    }


}
