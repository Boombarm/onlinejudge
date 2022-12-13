package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 2417 Lowest Bit
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=1417
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2012-07-11 19:57:04
 * @Runtime: 30 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;
public class P2417_Lowest_Bit {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (x==0) {
                break;
            }		
            String r = Integer.toBinaryString(x);
            int answer = Integer.lowestOneBit(Integer.parseInt(r));
            System.out.println(answer);
        }
    }


}
