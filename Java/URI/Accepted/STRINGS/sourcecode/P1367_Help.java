/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1367 Help
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1367
 * @Timelimit: 1 sec
 * @Status: Accepted 29/10/2015 - 14:53:07 Runtime:0.120s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Map;
import java.util.TreeMap;

public class P1367_Help {

    static class Team {

        int point = 0;
        int incorrect = 0;
        boolean correct = false;
    }

    static TreeMap<String, Team> team;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);
            team = new TreeMap<String, Team>();
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                if (!team.containsKey(st[0])) {
                    team.put(st[0], new Team());
                }
                if (!team.get(st[0]).correct) {
                    Team t = team.get(st[0]);
                    if (st[2].equals("correct")) {
                        int point = Integer.parseInt(st[1]);
                        t.correct = true;
                        t.point += point;
                    } else {
                        t.point += 20;
                    }
                    team.put(st[0], t);
                }
            }
            int count = 0, sum = 0;
            for (Map.Entry<String, Team> entrySet : team.entrySet()) {
                Team t = entrySet.getValue();
                if (t.correct) {
                    sum += t.point;
                    count++;
                }
            }
            out.write((count + " " + sum + "\n").getBytes());
        }
        out.flush();
    }

}
