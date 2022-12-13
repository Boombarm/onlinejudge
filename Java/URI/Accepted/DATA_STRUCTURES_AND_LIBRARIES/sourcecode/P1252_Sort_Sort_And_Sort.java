/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRUCTURES
 * @Problem: 1252 - Sort! Sort!! And Sort!!!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1252
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/23/17, 10:22:04 PM
 * @Runtime: 0.344s 
 * @Solution: Sort and Map by (number mod m)
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class P1252_Sort_Sort_And_Sort {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int n, m;
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);
            bw.append(n + " " + m + "\n");
            TreeMap<Long, LinkedList<Long>> allSet = new TreeMap<Long, LinkedList<Long>>();
            while (n-- > 0) {
                long number = Long.parseLong(br.readLine());
                long i = number % m;

                LinkedList list = allSet.get(i);
                if (list == null) {
                    list = new LinkedList();
                }
                list.add(number);
                allSet.put(i, list);
            }
            for (Map.Entry<Long, LinkedList<Long>> entry : allSet.entrySet()) {
                LinkedList<Long> list = entry.getValue();
                Collections.sort(list);
                LinkedList<Long> list1 = new LinkedList<Long>(), list2 = new LinkedList<Long>();
                for (Long num : list) {
                    if (num % 2 == 0) {
                        list1.addLast(num);
                    } else {
                        list2.addFirst(num);
                    }
                }
                for (Long num : list2) {
                    bw.append(num + "\n");
                }
                for (Long num : list1) {
                    bw.append(num + "\n");
                }
            }

        }
        bw.append("0 0\n");
        bw.flush();
    }

}
