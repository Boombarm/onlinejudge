package COJ.Accepted;

import java.util.Scanner;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1049 - Sum
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1049
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2015-09-28 07:50:15
 * @Runtime: 995
 * @Solution:
 * @Note:
 */
public class P1049_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 10000){
            int sum = 0;
            if(n < 0){
                for (int i = 1; i >= n; i--) {
                    sum+=i;
                }
            }
            else{
                for (int i = 1; i <= n; i++) {
                    sum+=i;
                }
            }
            System.out.println(sum);
        }

    }

}
