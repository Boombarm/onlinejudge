package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1221 Fast Prime Number https://www.urionlinejudge.com.br/judge/problems/view/1221/rate:1221/rating:1
//Accepted 12/10/2015 - 12:24:02 Runtime:0.092s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1221_Fast_Prime_Number {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(isPrime(num) ? "Prime" : "Not Prime");
        }
    }

    static boolean isPrime(int target) {
        for (int i = 2; i <= Math.sqrt(target); i++) {
            if ((target % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
