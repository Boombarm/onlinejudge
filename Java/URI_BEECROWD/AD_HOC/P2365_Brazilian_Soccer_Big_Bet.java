/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2365 - Brazilian Soccer' Big Bet
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2365
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/20/17, 8:49:52 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class P2365_Brazilian_Soccer_Big_Bet {

    static class Player {

        String name;
        int score = 0;
        Match[] match;
    }

    static class Match {

        int goal1 = 0;
        int goal2 = 0;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int p = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            Player[] players = new Player[p];
            for (int i = 0; i < p; i++) {
                players[i] = new Player();
                players[i].name = br.readLine();
                players[i].match = new Match[n];
                for (int j = 0; j < n; j++) {
                    st = br.readLine().split(" ");
                    int goal1 = Integer.parseInt(st[1]);
                    int goal2 = Integer.parseInt(st[3]);
                    players[i].match[j] = new Match();
                    players[i].match[j].goal1 = goal1;
                    players[i].match[j].goal2 = goal2;
                }
            }
            for (int i = 0; i < n; ++i) {
                st = br.readLine().split(" ");
                int goal1 = Integer.parseInt(st[1]);
                int goal2 = Integer.parseInt(st[3]);
                int winner1 = goal1 == goal2 ? 0 : (goal1 > goal2) ? 1 : 2;
                for (int j = 0; j < p; j++) {
                    Match m = players[j].match[i];
                    int winner2 = m.goal1 == m.goal2 ? 0 : (m.goal1 > m.goal2) ? 1 : 2;
                    int result = 0;
                    if (winner1 == winner2) {
                        if (m.goal1 == goal1 && m.goal2 == goal2) {
                            result = 10;
                        } else if (m.goal1 == goal1 || m.goal2 == goal2) {
                            result = 7;
                        } else {
                            result = 5;
                        }
                    } else if (goal1 == m.goal1 || goal2 == m.goal2) {
                        result = 2;
                    }
                    players[j].score += result;
                }

            }
            Map<String, Integer> player = new TreeMap();
            for (Player pl : players) {
                player.put(pl.name, pl.score);
            }
            for (Map.Entry<String, Integer> entry : entriesSortedByValues(player)) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                bw.append(key + " " + value + "\n");
            }
        }
        bw.flush();
    }

    static <K, V extends Comparable<? super V>>
            SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                int res = e2.getValue().compareTo(e1.getValue());
                return res != 0 ? res : 1;
            }
        }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

}
