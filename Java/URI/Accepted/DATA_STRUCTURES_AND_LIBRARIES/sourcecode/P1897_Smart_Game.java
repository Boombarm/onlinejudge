/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1897 Smart Game
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1897
 * @Timelimit: 2 sec
 * @Status: Accepted 2/1/16, 10:21:54 PM Runtime:0.656s
 * @Solution: Queue and memory Executed task
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class P1897_Smart_Game {

    static LinkedList<Integer> task = new LinkedList<Integer>(), next = new LinkedList<Integer>();
    static HashMap<Integer, Integer> memory = new HashMap<Integer, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        if (n == m) {
            System.out.println(0);
            System.exit(0);
        }

        boolean changed = false;
        int round = 0;
        task.add(n * 2);
        task.add(n * 3);
        task.add(n / 3);
        task.add(n / 2);
        task.add(n + 7);
        task.add(n - 7);

        memory.put(n * 2, 0);
        memory.put(n * 3, 0);
        memory.put(n / 2, 0);
        memory.put(n / 3, 0);
        memory.put(n + 7, 0);
        memory.put(n - 7, 0);
        while (!changed) {
            while (task.size() != 0) {
                int sum = task.remove();
                if (sum == m) {
                    changed = true;
                    break;
                }
                if (memory.get(sum * 2) == null) {
                    next.add(sum * 2);
                    memory.put(sum * 2, 0);
                }

                if (memory.get(sum * 3) == null) {
                    next.add(sum * 3);
                    memory.put(sum * 3, 0);
                }

                if (memory.get(sum / 2) == null) {
                    next.add(sum / 2);
                    memory.put(sum / 2, 0);
                }

                if (memory.get(sum / 3) == null) {
                    next.add(sum / 3);
                    memory.put(sum / 3, 0);
                }

                if (memory.get(sum + 7) == null) {
                    next.add(sum + 7);
                    memory.put(sum + 7, 0);
                }

                if (memory.get(sum - 7) == null) {
                    next.add(sum - 7);
                    memory.put(sum - 7, 0);
                }

            }
            task.addAll(next);
            next = new LinkedList<Integer>();
            round++;
        }
        System.out.println(round);
    }

}
