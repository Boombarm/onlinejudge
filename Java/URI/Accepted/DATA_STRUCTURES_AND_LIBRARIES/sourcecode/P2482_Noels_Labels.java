/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 2482 - Noel's Labels
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2482
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 2:08:17 PM
 * @Runtime: 0.032s
 * @Solution: Map
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class P2482_Noels_Labels {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number_of_word = Integer.parseInt(br.readLine());
        Map<String, String> word = new HashMap<String, String>();
        for (int i = 0; i < number_of_word; i++) {
            String key = br.readLine();
            String value = br.readLine();
            word.put(key, value);
        }
        int number_of_children = Integer.parseInt(br.readLine());
        for (int i = 0; i < number_of_children; i++) {
            String children_Name = br.readLine();
            String value = br.readLine();
            bw.append(children_Name + "\n");
            bw.append(word.get(value) + "\n");
            bw.newLine();
        }
        bw.flush();
    }
}
