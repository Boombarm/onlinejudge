package URI.Accepted.STRINGS.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRING
 * @Problem: 2535 - Adoption Fair
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2535
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/18, 12:36:18 AM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class P2535_Adoption_Fair {

    public P2535_Adoption_Fair() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int count = 0;
            newCase:
            while (n-- > 0) {
                String species = br.readLine();
                String breed = br.readLine();
                String name = br.readLine();
                br.readLine();
                if (species.equals("cachorro")) {
                    String[] st = name.split(" ");
                    if (st.length > 1) {
                        for (String s : st) {
                            if (s.charAt(0) == breed.charAt(0)) {
                                count++;
                                continue newCase;
                            }
                        }
                    }
                }
            }
            bw.append(count + "\n");
        }
        bw.flush();
    }

}
