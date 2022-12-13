package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong solution: push pop stack algorithm
 */
//URI Online Judge | 1068 Parenthesis Balance I https://www.urionlinejudge.com.br/judge/en/problems/view/1068
//Accepted 16/10/2015 - 07:36:48 Runtime:0.088s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1068_Parenthesis_Balance_I {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                char now = line.charAt(i);
                if (now == '(') {
                    count++;
                } else if (now == ')') {
                    if (count == 0) {
                        count = 1;
                        break;
                    }
                    count--;
                }
            }
            if (count == 0) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }

}
