/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1318 Fake Tickets
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1318
 * @Timelimit: 1 sec
 * @Status: Accepted 07/11/2015 - 10:34:33 Runtime:0.084s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P1318_Fake_Tickets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String line = "";
        while (!(line = br.readLine()).equals("0 0")) {
            String[] st = line.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            StringTokenizer stk = new StringTokenizer(br.readLine());
            Map<Integer, Boolean> tickets = new TreeMap<Integer, Boolean>();
            int fakeTickets = 0;
            while (stk.hasMoreTokens()) {
                int ticket = Integer.parseInt(stk.nextToken());
                if (tickets.get(ticket) != null) {
                    if (tickets.get(ticket)) {
                        fakeTickets++;
                        tickets.put(ticket, false);
                    }
                } else {
                    tickets.put(ticket, true);
                }
            }
            out.write((fakeTickets + "\n").getBytes());
        }
        out.flush();
    }

}
