package URI.Accepted.AD_HOC.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2455 - Gangorra
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2455
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/4/19, 1:44:06 AM
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2455_Gangorra {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int P1 = Integer.parseInt(st[0]);
        int C1 = Integer.parseInt(st[1]);
        int P2 = Integer.parseInt(st[2]);
        int C2 = Integer.parseInt(st[3]);
        int A1 = P1 * C1;
        int A2 = P2 * C2;
        System.out.println(A1 == A2 ? "0" : A1 > A2 ? "-1" : "1");
    }
}
