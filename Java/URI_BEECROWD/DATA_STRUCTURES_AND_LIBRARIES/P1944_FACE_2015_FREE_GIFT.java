/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1944 FACE 2015 FREE GIFT
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1944
 * @Timelimit: 1 sec
 * @Status: Accepted 26/10/2015 - 15:16:29 Runtime:0.040s
 * @Solution:
 */

package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1944_FACE_2015_FREE_GIFT {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.exit(0);
        }
        String st = "";
        int gifts = 0;
        int count = 0;
        while (count != n) {
            String block = br.readLine().replace(" ", "");
            if (st.length() == 0) {
                st += "FACE";
            }
            String now = new StringBuilder(block).reverse().toString();
            if (!st.substring(st.length() - 4).equals(now)) {
                st += block;
            } else {
                st = st.substring(0, st.length() - 4);
                gifts++;
            }
            count++;
        }
        System.out.println(gifts);
    }

}
