package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1893 Moon Phases https://www.urionlinejudge.com.br/judge/problems/view/1893/rate:1893/rating:1
//Accepted 05/10/2015 - 04:31:21 Runtime:0.076s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1893_Moon_Phases {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int s = Integer.parseInt(line[0]);
        int e = Integer.parseInt(line[1]);
        if (s < e) {
            if (e <= 2) {
                System.out.println("nova");
            } else if (e > 2 && e < 97) {
                System.out.println("crescente");
            } else {
                System.out.println("cheia");
            }
        } else if (s > e) {
            if (e <= 2) {
                System.out.println("nova");
            } else if (e > 2 && e < 97) {
                System.out.println("minguante");
            } else if (e >= 97 && e <= 100) {
                System.out.println("cheia");
            }
        } else {
            if (s <= 2) {
                System.out.println("nova");
            } else if (s > 2 && s < 97) {
                System.out.println("minguante");
            } else {
                System.out.println("cheia");
            }
        }

    }
}
