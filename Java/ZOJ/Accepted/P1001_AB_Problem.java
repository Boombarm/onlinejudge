package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1001 - A + B Problem
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=1
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2014-07-22 23:07:45
 * @Runtime: 14 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;
public class P1001_AB_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
