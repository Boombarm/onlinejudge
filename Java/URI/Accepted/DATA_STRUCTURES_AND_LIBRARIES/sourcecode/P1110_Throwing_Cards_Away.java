/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1110 Throwing Cards Away
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1110
 * @Timelimit: 1 sec
 * @Status: Accepted 22/11/2015 - 09:33:52 Runtime:0.260s
 * @Solution: Queue Structure ,Dequeue Enqueue
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P1110_Throwing_Cards_Away {

    static LinkedList<Integer> deck;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            deck = new LinkedList<Integer>();
            for (int i = 1; i <= n; i++) {
                deck.add(i);
            }
            bw.append("Discarded cards:");
            while (deck.size() != 1) {
                bw.append(" " + deck.removeFirst());
                deck.add(deck.removeFirst());
                if (deck.size() != 1) {
                    bw.append(",");
                }
            }
            bw.append("\nRemaining card: " + deck.getFirst() + "\n");
        }
        bw.flush();
    }

}
