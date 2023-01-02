package ZOJ;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1048 Financial Management
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=48
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2013-07-22 19:32:31
 * @Runtime: 30 ms
 * @Solution:
 * @Note:
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1048_Financial_Management {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            double m = sc.nextDouble();
            sum += m;
        }
        System.out.println("$" + df.format(sum / 12));
    }


}
