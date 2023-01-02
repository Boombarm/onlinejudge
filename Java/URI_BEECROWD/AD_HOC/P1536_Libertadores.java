package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1536 Libertadores https://www.urionlinejudge.com.br/judge/en/problems/view/1536
//Accepted 05/10/2015 - 08:31:10 Runtime:0.068s
import java.util.Scanner;

public class P1536_Libertadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int t1Goal = sc.nextInt();
            sc.next();
            int t1cost = sc.nextInt();
            int t1Score = t1Goal - t1cost;

            int t2Goal = sc.nextInt();
            sc.next();
            int t2cost = sc.nextInt();
            int t2Score = t2Goal - t2cost;
            if (t1Goal == t2Goal && t1cost == t2cost) {
                System.out.println("Penaltis");
                continue;
            }

            if (t1Score == t2Score) {
                if (t1Goal < t2Goal) {
                    System.out.println("Time 1");
                } else {
                    System.out.println("Time 2");
                }
                continue;
            }

            if (t1Score > t2Score) {
                System.out.println("Time 1");
            } else {
                System.out.println("Time 2");
            }

        }
    }

}
