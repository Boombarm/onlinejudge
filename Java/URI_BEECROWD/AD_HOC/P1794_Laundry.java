package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1794 | [PJ] Laundry https://www.urionlinejudge.com.br/judge/problems/view/1794/rate:1794/rating:1
//Accepted 05/10/2015 - 06:07:59 Runtime:0.092s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1794_Laundry {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int clothes = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int LA = Integer.parseInt(s1[0]);
        int LB = Integer.parseInt(s1[1]);
        int SA = Integer.parseInt(s2[0]);
        int SB = Integer.parseInt(s2[1]);
        if (clothes >= LA && clothes <= LB) {
            if (clothes >= SA && clothes <= SB) {
                System.out.println("possivel");
            } else {
                System.out.println("impossivel");
            }
        } else {
            System.out.println("impossivel");
        }
    }

}
