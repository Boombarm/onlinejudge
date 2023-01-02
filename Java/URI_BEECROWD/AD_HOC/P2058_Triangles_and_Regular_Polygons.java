/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2058 Triangles and Regular Polygons
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2058
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission:  1/20/17, 1:44:20 AM
 * @Runtime: 0.040s
 * @Solution: 
 * @Note: 
 */

package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P2058_Triangles_and_Regular_Polygons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n-2);
    }

}
