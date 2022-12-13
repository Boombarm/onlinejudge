/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1304 Average Speed
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1304
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 2/19/16, 2:57:32 PM 
 * @Runtime: 0.344s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1304_Average_Speed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        double km = 0;
        double speed = 0;
        double lh = 0, lm = 0, ls = 0;
        while ((input = br.readLine()) != null) {
            String[] st = input.split("[ +]");
            String[] time = st[0].split(":");
            double nh = Double.parseDouble(time[0]);
            double nm = Double.parseDouble(time[1]);
            double ns = Double.parseDouble(time[2]);
            double h = nh - lh;
            double m = nm - lm;
            double s = ns - ls;
            double t = h + (m / 60) + (s / 60 / 60);//h
            km += speed * t;
            if (st.length == 2) {
                speed = Double.parseDouble(st[1]);//new speed in km/h
            } else {
                bw.write(st[0] + " " + String.format("%.2f", km) + " km\n");
            }
            lh = nh;
            lm = nm;
            ls = ns;
        }
        bw.flush();
    }
}
