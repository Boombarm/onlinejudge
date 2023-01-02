/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2313 Which Triangle
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2313
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/16/16, 6:49:46 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2313_Which_Triangle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]), b = Integer.parseInt(st[1]), c = Integer.parseInt(st[2]);
        int max = Math.max(a, b);
        if (max < c) {
            max = c;
        }
        if (max + max < a + b + c) {
            if (a == b && b == c) {
                System.out.println("Valido-Equilatero");
            } else if (a == b || a == c || c == b) {
                System.out.println("Valido-Isoceles");
            } else {
                System.out.println("Valido-Escaleno");
            }
            boolean isRactagle
                    = ((a * a) + (b * b)) == (c * c)
                    || ((c * c) + (b * b)) == (a * a)
                    || ((a * a) + (c * c)) == (b * b);
            System.out.println("Retangulo: " + (isRactagle ? 'S' : 'N'));
        } else {
            System.out.println("Invalido");
        }

    }

}
