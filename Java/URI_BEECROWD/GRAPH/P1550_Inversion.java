package URI.Accepted.GRAPH.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1550 - Inversion
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1550
 * @Level: 6
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/10/19, 7:45:33 PM
 * @Runtime: 1.360s
 * @Solution: BFS + memoization
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.LinkedList;
import java.util.TreeSet;

public class P1550_Inversion {

    private static class Process {
        int number;
        int round;

        public Process(int number, int round) {
            this.number = number;
            this.round = round;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {

            String[] st = br.readLine().split(" ");
            int init = Integer.parseInt(st[0]);
            int finalNumber = Integer.parseInt(st[1]);

            TreeSet<Integer> memory = new TreeSet<>();
            LinkedList<Process> Q = new LinkedList<>();
            Process process = new Process(init, 0);
            Q.add(process);

            int minimum = 0;
            while (!Q.isEmpty()) {
                Process p = Q.pollFirst();
                if (p.number == finalNumber) {
                    minimum = p.round;
                    break;
                }

                if (!memory.contains(p.number + 1)) {
                    memory.add(p.number + 1);
                    Q.add(new Process(p.number + 1, p.round + 1));
                }

                //reverse
                int reverse = reverse(p.number);
                if (!memory.contains(reverse)) {
                    memory.add(reverse);
                    Q.add(new Process(reverse, p.round + 1));
                }
            }

            bw.append(minimum + "\n");
        }
        bw.flush();
    }

    static int reverse(int number) {
        String n = number + "";
        int size = n.length();
        String result = "";
        for (int i = size - 1; i >= 0; i--) {
            result += n.charAt(i);
        }
        return Integer.parseInt(result);
    }

}
