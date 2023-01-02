/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2312 - Medal Table
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2312
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/23/17, 5:00:48 PM
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2312_Medal_Table {

    static class Country {

        String name;
        int gold, silver, bronze;

        public Country(String name, int gold, int silver, int bronze) {
            this.name = name;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Country[] country = new Country[n];
        int count = 0;
        while (count < n) {
            String[] st = br.readLine().split(" ");
            String name = st[0];
            int gold = Integer.parseInt(st[1]);
            int silver = Integer.parseInt(st[2]);
            int bronze = Integer.parseInt(st[3]);
            country[count] = new Country(name, gold, silver, bronze);
            count++;
        }

        boolean swap;
        while (true) {
            swap = false;
            for (int i = 0; i < n; i++) {
                Country c1 = country[i];
                for (int j = i + 1; j < n; j++) {
                    Country c2 = country[j];
                    if (c1.gold < c2.gold) {
                        Country tmp = c1;
                        country[i] = c2;
                        country[j] = tmp;
                        swap = true;
                        break;
                    } else if (c1.gold == c2.gold && c1.silver < c2.silver) {
                        Country tmp = c1;
                        country[i] = c2;
                        country[j] = tmp;
                        swap = true;
                        break;
                    } else if (c1.gold == c2.gold && c1.silver == c2.silver && c1.bronze < c2.bronze) {
                        Country tmp = c1;
                        country[i] = c2;
                        country[j] = tmp;
                        swap = true;
                        break;
                    } else if (c1.gold == c2.gold && c1.silver == c2.silver && c1.bronze == c2.bronze && c1.name.compareTo(c2.name) > 0) {
                        Country tmp = c1;
                        country[i] = c2;
                        country[j] = tmp;
                        swap = true;
                        break;
                    }
                }
            }
            if (!swap) {
                break;
            }
        }

        for (Country c : country) {
            bw.append(c.name + " " + c.gold + " " + c.silver + " " + c.bronze + "\n");
        }
        bw.flush();
    }

}
