package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/22/2018.
 * Answer: Accepted
 * Submission : 1/23/18, 11:45:27 AM
 * Runtime : 1.348s
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2549_Usernames {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map;
        String in;
        while ((in = br.readLine()) != null) {
            if (in.isEmpty()) continue;

            map = new HashMap<String, Integer>();
            String[] st = in.split(" ");
            int n = Integer.parseInt(st[0]);
            for (int i = 0; i < n; i++) {
                String input = br.readLine().trim();
                st = input.split(" +");
                int size = st.length;
                String p = "";
                for (int j = 0; j < size; j++) {
                    p += st[j].charAt(0);
                }
                if (map.get(p) == null) {
                    map.put(p, 1);
                } else {
                    int x = map.get(p);
                    map.put(p, x + 1);
                }
            }
            int answer = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int x = entry.getValue();
                if (x > 1) {
                    answer += (x - 1);
                }
            }
            System.out.println(answer);
        }
    }
}
