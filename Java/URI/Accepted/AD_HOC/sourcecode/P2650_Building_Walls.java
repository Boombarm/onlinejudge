
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2650 Building Walls
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2650
 * @Timelimit: 1 sec
 * @Status: Accepted 1/27/18, 4:10:18 PM
 * @Runtime: 0.036s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P2650_Building_Walls {

    static int n, m;
    static LinkedList<String> titanList = new LinkedList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] st = input.split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        while (n-- > 0) {
            st = br.readLine().split(" ");
            int size = st.length;
            int height = Integer.parseInt(st[size - 1]);
            if(height > m) {
                String titanName = st[0];
                for (int i = 1 ; i < size-1;i++) {
                     titanName += " "+st[i];
                }
                titanList.add(titanName);
            }
        }

        for (String titan : titanList) {
            bw.append(titan + "\n");
        }
        bw.flush();
    }

}
