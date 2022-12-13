package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Problem: 2847 : Paper Scissors I Love You
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2847
 * @Timelimit: 1 Seconds
 * @Status: Accepted
 * @Submission: 1/2/19, 1:55:46 PM
 * @Runtime: 0.076s
 * @Solution: นับจำนวนการเกิดของแต่ละตัวอักษร เมื่อครบก็รวมเป็น 1 ประโยค
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2847_Paper_Scissors_I_Love_You {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        char[] tArr = text.toCharArray();
        int tSize = text.length();
        int count = 0;
        int i = 0;
        int[] c = new int[8];// [I, l, o, v, e, y, u, !]
        loop:
        while (i < tSize) {
            switch (tArr[i++]) {
                case 'I':
                    c[0]++;
                    break;
                case 'l':
                    c[1]++;
                    break;
                case 'o':
                    c[2]++;
                    break;
                case 'v':
                    c[3]++;
                    break;
                case 'e':
                    c[4]++;
                    break;
                case 'y':
                    c[5]++;
                    break;
                case 'u':
                    c[6]++;
                    break;
                case '!':
                    c[7]++;
                    break;
                default:
                    continue;
            }
        }
        while (c[0] >= 1 && c[1] >= 1 && c[2] >= 2 && c[3] >= 1 && c[4] >= 1 && c[5] >= 1 && c[6] >= 1 && c[7] >= 1) {
            count++;
            c[0]--;
            c[1]--;
            c[2] -= 2;
            c[3]--;
            c[4]--;
            c[5]--;
            c[6]--;
            c[7]--;
        }
        System.out.println(count);
    }

}
