/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2016 D as in Daedalus
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2016
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/21/17, 5:43:03 PM
 * @Runtime: 0.088s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.util.Scanner;

public class P2016_D_as_in_Daedalus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Players
        int m = sc.nextInt();//Rounds
        int[] b = new int[m];//Bank budget
        int[] otherSum = new int[m];
        int extraPoint = 0;
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            int daedalusPoint = sc.nextInt();
            for (int j = 1; j < n; j++) {
                otherSum[i] += sc.nextInt();
            }
            if ((daedalusPoint + otherSum[i]) <= b[i]) {//Success
                extraPoint += daedalusPoint;
            }
        }
        int maximumExtraPoint = 0;
        for (int i = 0; i < m; i++) {
            int remain = (b[i] - otherSum[i]);
            if (remain >= 10000) {
                maximumExtraPoint += 10000;
            } else if (remain >= 1000) {
                maximumExtraPoint += 1000;
            } else if (remain >= 100) {
                maximumExtraPoint += 100;
            } else if (remain >= 10) {
                maximumExtraPoint += 10;
            } else if (remain >= 1) {
                maximumExtraPoint += 1;
            }
        }
        System.out.println(maximumExtraPoint - extraPoint);
    }

}
