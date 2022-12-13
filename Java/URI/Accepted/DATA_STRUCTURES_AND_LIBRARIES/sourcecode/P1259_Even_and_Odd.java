package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1259 Even and Odd https://www.urionlinejudge.com.br/judge/problems/view/1259/rate:1259/rating:1
//Accepted 09/10/2015 - 20:19:13 Runtime:0.312s
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class P1259_Even_and_Odd {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
        br.close();
        Collections.sort(even);
        Collections.sort(odd);

        for (int i = 0; i < even.size(); i++) {
            bw.write(even.get(i) + "");
            bw.newLine();
            bw.flush();
        }
        for (int i = odd.size() - 1; i >= 0; i--) {
            bw.write(odd.get(i) + "");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

}
