/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1609 Counting Sheep
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1609
 * @Timelimit: 1 sec
 * @Status: Accepted 29/10/2015 - 10:48:45 Runtime:0.168s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class P1609_Counting_Sheep {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");
            TreeMap<Integer, Integer> numberList = new TreeMap<Integer, Integer>();
            for (int j = 0; j < t; j++) {
                int number = Integer.parseInt(st[j]);
                if (numberList.get(number) == null) {
                    numberList.put(number, 0);
                }
            }
            System.out.println(numberList.size());
        }
    }

}
