/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2090 - I Went to Market And Bought...
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2090
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/24/18, 7:45:45 PM
 * @Runtime: 2.376s
 * @Solution: Generate Sequence
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class P2090_I_Went_to_Market_And_Bought {

    InputStreamReader ir;
    BufferedReader br;
    OutputStreamWriter ow;
    BufferedWriter bw;

    public P2090_I_Went_to_Market_And_Bought() throws IOException {
        ir = new InputStreamReader(System.in);
        br = new BufferedReader(ir);
        ow = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(ow);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            st = br.readLine().split(" ");
            bw.append(getProduct(st, n, k) + "\n");
        }
        bw.flush();
    }


    //Generate Sequence
    String getProduct(String[] productList, int n, int k) {
        String lastProduct;
        ArrayList<String> Sequence = new ArrayList<>();
        int p = 0;
        int orderIndex = 0;
        loop:
        while (true) {
            Sequence.add(productList[p]);
            int size = Sequence.size();
            for (int i = 0; i < size; i++) {
                lastProduct = Sequence.get(i);
                if (++orderIndex == k) {
                    break loop;
                }
            }
            p++;
            if (p == n) {
                p %= n;
            }
        }
        return lastProduct;
    }

}
