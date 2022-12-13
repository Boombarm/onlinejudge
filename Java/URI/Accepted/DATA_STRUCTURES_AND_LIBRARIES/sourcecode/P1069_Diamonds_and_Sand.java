package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong solution: push pop stack algorithm
 */
//URI Online Judge | 1069 Diamonds and Sand https://www.urionlinejudge.com.br/judge/en/problems/view/1069
//Accepted 16/10/2015 - 05:53:32 Runtime:0.088s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1069_Diamonds_and_Sand {

    static int top, diamond;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            diamond = 0;
            top = -1;
            for (int j = 0; j < line.length(); j++) {
                char now = line.charAt(j);
                if (now == '<') {
                    push();
                } else if (now == '>') {
                    if (top != -1) {
                        pop();
                    }
                }
            }

            System.out.println(diamond);
        }
    }

    static void push() {
        top++;
    }

    static void pop() {
        top--;
        diamond++;
    }

}
