package AIZU.Accepted.ALDS1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ALDS1_2_B: Selection Sort
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_2_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24376 KB
 * @Submission: 2018-03-17 00:11
 * @Runtime:
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ALDS1_2_B_Selection_Sort {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st[i]);
        }

        Object[] obj = selectionSort(data, n);
        data = (int[]) obj[0];
        bw.append("" + data[0]);
        for (int i = 1; i < n; i++) {
            bw.append(" " + data[i]);
        }
        bw.append("\n" + obj[1] + "\n");
        bw.flush();
    }

    static Object[] selectionSort(int[] data, int n) {
        Object[] obj = new Object[2];
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            boolean chk = false;
            for (int j = i; j < n; j++) {
                if (data[j] < data[min]) {
                    chk = true;
                    min = j;
                }
            }
            if (chk) {
                swap(data, i, min);
                count++;
            }
        }

        obj[0] = data;
        obj[1] = count;
        return obj;
    }

    static void swap(int[] data, int a, int b) {
        int tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }


}
