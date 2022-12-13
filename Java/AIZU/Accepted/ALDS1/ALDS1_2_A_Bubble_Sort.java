package AIZU.Accepted.ALDS1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Sort I
 * @Problem: ALDS1_2_A: Bubble Sort
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_2_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24536 KB
 * @Submission: 2018-03-16 11:14
 * @Runtime: 00:05 s
 * @Solution:
 * @Note: Bubble Sort
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ALDS1_2_A_Bubble_Sort {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st[i]);
        }
        Object[] obj = bubbleSort(data, n);
        data = (int[]) obj[0];
        bw.append("" + data[0]);
        for (int i = 1; i < n; i++) {
            bw.append(" " + data[i]);
        }
        bw.newLine();
        bw.append((int) obj[1] + "\n");

        bw.flush();
    }

    static Object[] bubbleSort(int[] data, int n) {
        Object[] obj = new Object[2];
        int counting = 0;
        while (true) {
            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                if (data[i] > data[i + 1]) {
                    found = true;
                    swap(data, i, i + 1);
                    counting++;
                }
            }
            if (!found) {
                break;
            }
        }
        obj[0] = data;
        obj[1] = counting;
        return obj;
    }

    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

}
