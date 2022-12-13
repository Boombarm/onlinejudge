package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2724 - Help Patatatitu
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2724
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/22/18, 11:10:14 AM
 * @Runtime: 0.048s
 * @Solution:
 * @Note: sub String search
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class P2724_Help_Patatatitu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int compoundsAmount = Integer.parseInt(br.readLine());
            LinkedList<String> compounds = new LinkedList<String>();
            for (int i = 0; i < compoundsAmount; i++) {
                compounds.add(br.readLine());
            }

            int experimentsAmount = Integer.parseInt(br.readLine());
            while (experimentsAmount-- > 0) {
                String experiment = br.readLine();
                boolean process = true;
                loop:
                for (String s : compounds) {
                    int i = experiment.indexOf(s);
                    int size = experiment.length();
                    if (i > -1) {
                        i += s.length();
                        if (i == size) {
                            process = false;
                            break loop;
                        } else {
                            String s2 = experiment.substring(i);
                            for (String s3 : compounds) {
                                int j = s2.indexOf(s3);
                                if (j == 0) {
                                    process = false;
                                    break loop;
                                }
                            }

                        }
                    }
                }
                bw.append(process ? "Prossiga" : "Abortar");
                bw.newLine();
            }
            if (t > 0) {
                bw.newLine();
            }
        }
        bw.flush();
    }
}
