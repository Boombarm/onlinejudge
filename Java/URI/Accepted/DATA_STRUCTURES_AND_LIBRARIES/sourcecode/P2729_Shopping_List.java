package URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURE AND LIBRARIES
 * @Problem: 2729 - Shopping List
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2729
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/18, 1:00:33 AM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

class P2729_Shopping_List {

    public P2729_Shopping_List() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>();
        while (true) {
            String[] st = br.readLine().split(" ");
            for (String s : st) {
                if (!set.contains(s)) {
                    set.add(s);
                }
            }
            Iterator iterator = set.iterator();
            bw.append("" + iterator.next());
            while (iterator.hasNext()) {
                bw.append(" " + iterator.next());
            }
            bw.newLine();
            if (--n == 0) {
                break;
            }
            set.clear();
        }
        bw.flush();
    }

}
