/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories:Ad-HOC
 * @Problem: 2478 - Hit the Gift
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2478
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/13/17, 1:55:12 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class P2478_Hit_the_Gift {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String[]> gifts = new HashMap();
        String[] st;
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            String name = st[0];
            String[] options = {st[1], st[2], st[3]};
            gifts.put(name, options);
        }
        String input;
        while ((input = br.readLine()) != null) {
            st = input.split(" ");
            String name = st[0];
            String option = st[1];
            String[] options = gifts.get(name);
            boolean check = options != null ? (option.equals(options[0]) || option.equals(options[1]) || option.equals(options[2])) : false;
            bw.append(check ? "Uhul! Seu amigo secreto vai adorar o/\n" : "Tente Novamente!\n");
        }
        bw.flush();
    }

}
