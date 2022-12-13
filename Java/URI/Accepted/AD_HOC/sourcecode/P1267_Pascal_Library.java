package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong solution: yes
 */
//URI Online Judge | 1267 Pascal Library https://www.urionlinejudge.com.br/judge/en/problems/view/1267
//Accepted 14/10/2015 - 07:15:28 Runtime:0.784s
import java.util.Scanner;

public class P1267_Pascal_Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            if (n == 0 && d == 0) {
                break;
            }

            int[][] table = new int[d][n];
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < n; j++) {
                    table[i][j] = sc.nextInt();
                }
            }

            //check
            boolean check = false;
            int line = 0;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < d; j++) {
                    sum += table[j][i];
                }
                if (sum == d) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }

}
