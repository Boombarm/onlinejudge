package th.in.devboom.uri.accepted;


/**
 * Created by Teerapat-BSD on 2/6/2018.
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2631
 * DSU - Disjoint Sets Union. (group pairs)
 * Answer : Accepted
 * Runtime : 0.572s
 * Submission : 2/7/18, 11:16:17 AM
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;

public class P2631_Making_Pairs {

    static int N, M, Q;
    static int X, Y;
    static int A, B;
    static HashMap<Integer, Integer> group = new HashMap<Integer, Integer>();
    static int lastGroupId = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in = br.readLine();
        while (in != null) {
            if (in.isEmpty()) {
                in = br.readLine();
                continue;
            }
            String[] st = in.split(" ");
            N = Integer.parseInt(st[0]);
            M = Integer.parseInt(st[1]);
            Q = Integer.parseInt(st[2]);

            //mapping Relationship
            for (int i = 0; i < M; ) {
                in = br.readLine();
                if (in.isEmpty()) continue;
                st = in.split(" ");
                X = Integer.parseInt(st[0]);
                Y = Integer.parseInt(st[1]);
                if (group.isEmpty()) {
                    group.put(Y, lastGroupId);
                    group.put(X, lastGroupId);
                    lastGroupId++;
                } else {
                    Integer groupIdA = group.get(X);
                    Integer groupIdB = group.get(Y);
                    if (groupIdA == null && groupIdB == null) {
                        group.put(Y, lastGroupId);
                        group.put(X, lastGroupId);
                        lastGroupId++;
                    } else {
                        if (groupIdA == null) {
                            group.put(X, groupIdB);
                        } else {
                            group.put(Y, groupIdA);
                        }
                    }
                }
                i++;
            }


            for (int i = 0; i < Q; ) {
                in = br.readLine();
                if (in.isEmpty()) continue;
                st = in.split(" ");
                A = Integer.parseInt(st[0]);
                B = Integer.parseInt(st[1]);
                Integer groupA = group.get(A);
                Integer groupB = group.get(B);
                boolean isPair = false;
                if (groupA != null && groupB != null) {
                    isPair = group.get(A).equals(group.get(B));
                }

                bw.append(isPair ? "S\n" : "N\n");
                i++;
            }
            group.clear();
            lastGroupId = 1;
            in = br.readLine();
            if (in != null) {
                bw.newLine();
            } else {
                break;
            }
        }
        bw.flush();
    }

}
