
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1984 The Pronalância Puzzle
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1984
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 06:14:14 Runtime:0.048s
 * @Solution: 
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1984_The_Pronalancia_Puzzle {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new StringBuilder(br.readLine()).reverse());
    }
    
}
