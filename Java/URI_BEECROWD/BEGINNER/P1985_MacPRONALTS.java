/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: MacPRONALTS    
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1985
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 06:31:49 Runtime:0.056s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1985_MacPRONALTS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            String seria = st[0];
            int amount = Integer.parseInt(st[1]);
            if(seria.equals("1001")){
                sum += (1.5*amount);
            }
            else if(seria.equals("1002")){
                sum += (2.5*amount);
            }
            else if(seria.equals("1003")){
                sum += (3.5*amount);
            }
            else if(seria.equals("1004")){
                sum += (4.5*amount);
            }
            else if(seria.equals("1005")){
                sum += (5.5*amount);
            }
        }
        System.out.printf("%.2f\n", sum);
    }
}
