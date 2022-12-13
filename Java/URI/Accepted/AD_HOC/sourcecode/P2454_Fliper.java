/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2454 Flíper
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2454
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 1:35:32 AM
 * @Runtime: 0.056s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2454_Fliper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int p = Integer.parseInt(st[0]);
        int r = Integer.parseInt(st[1]);
        if(p == 0){
            System.out.println("C");
        }
        else if(r == 0){
            System.out.println("B");
        }
        else if(r == 0){
            System.out.println("A");
        }
    }
    
}
