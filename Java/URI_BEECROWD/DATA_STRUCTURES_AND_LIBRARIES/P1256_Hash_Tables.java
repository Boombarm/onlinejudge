/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1256 Hash Tables
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1256
 * @Timelimit: 1 sec
 * @Status: Accepted 22/11/2015 - 12:00:07 Runtime:0.200s
 * @Solution:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1256_Hash_Tables {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        do {
            String[] st = br.readLine().split(" ");
            int m = Integer.parseInt(st[0]);
            int c = Integer.parseInt(st[1]);
            ArrayList<Integer>[] dataList = new ArrayList[m];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                int data = Integer.parseInt(stk.nextToken());
                int key = data % m;
                if (dataList[key] == null) {
                    dataList[key] = new ArrayList<Integer>();
                }
                dataList[key].add(data);
            }
            for (int j = 0; j < m; j++) {
                out.write((j + " -> ").getBytes());
                if (dataList[j] != null) {
                    int k = dataList[j].size();
                    int x = 0;
                    while (x < k) {
                        out.write((dataList[j].get(x) + " -> ").getBytes());
                        x++;
                    }
                }
                out.write("\\\n".getBytes());
            }
            if (--n > 0) {
                out.write("\n".getBytes());
            }
        } while (n != 0);
        out.flush();
    }

}
