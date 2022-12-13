package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1192 Paula's Mathematic Game https://www.urionlinejudge.com.br/judge/en/problems/view/1192
//Accepted 05/10/2015 - 01:24:40 Runtime:0.256s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1192_Paula_Mathematic_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String sequence = br.readLine();
            int a = sequence.charAt(0) - '0';
            char operation = sequence.charAt(1);
            int b = sequence.charAt(2) - '0';
            if (a == b) {
                System.out.println(a * b);
            } else if (operation >= 65 && operation <= 90) {//Uppercase
                System.out.println(b - a);
            } else if (operation >= 97 && operation <= 122) {//lowercase
                System.out.println(a + b);
            }

        }
    }
}
