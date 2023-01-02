
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1983 The Chosen
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1983
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 06:50:43 Runtime:0.044s
 * @Solution: 
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1983_The_Chosen {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double max = 7.9;
        String id = "";
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            double score = Double.valueOf(st[1]);
            if(score > max){
                id = st[0];
                max = score;
            }
        }
        System.out.println(id.isEmpty() ? "Minimum note not reached" : id );
    }
}
