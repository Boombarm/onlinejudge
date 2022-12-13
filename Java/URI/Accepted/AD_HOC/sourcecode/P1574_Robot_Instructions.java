package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1574 Robot Instructions https://www.urionlinejudge.com.br/judge/en/problems/view/1574
//Accepted 06/10/2015 - 11:01:42 Runtime:0.056s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1574_Robot_Instructions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int p = 0;
            int n = Integer.parseInt(br.readLine());
            ArrayList<String> history = new ArrayList<String>();
            for (int j = 0; j < n; j++) {
                String instructions = br.readLine();
                if (instructions.startsWith("SAME AS")) {
                    int index = Integer.parseInt(instructions.substring(7).trim());
                    if (index <= j) {
                        instructions = history.get(index - 1);
                        if (instructions.equals("RIGHT")) {
                            p++;
                        } else {
                            p--;
                        }
                        history.add(instructions);
                    }
                } else {
                    if (instructions.equals("RIGHT")) {
                        p++;
                    } else {
                        p--;
                    }
                    history.add(instructions);
                }
            }
            System.out.println(p);
        }
    }

}
