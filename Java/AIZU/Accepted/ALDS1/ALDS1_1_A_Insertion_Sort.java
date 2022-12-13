package AIZU.Accepted.ALDS1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Getting Started
 * @Problem: ALDS1_1_A: Insertion Sort
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_1_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 26592 KB
 * @Submission: 2018-03-17 15:19
 * @Runtime: 00:06 s
 * @Solution:
 * @Note: Insertion Sort
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ALDS1_1_A_Insertion_Sort {

    static int n;
    static int[] data;
    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st[i]);
        }

        for (int i = 1; i < n; i++) {
            printData();
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        printData();
        bw.flush();
    }

    static void printData() throws IOException {
        bw.append("" + data[0]);
        for (int j = 1; j < n; j++) {
            bw.append(" " + data[j]);
        }
        bw.newLine();
    }

}
