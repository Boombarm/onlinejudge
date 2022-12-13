package COJ.Accepted;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Categories:
 * @Problem: 2789 - Sum Order
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=2789
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 2019-01-22 04:05:55
 * @Runtime: 1014
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2789_Sum_Order {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split("\\+");
        int size = st.length;
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = Integer.parseInt(st[i]);
        }

        quickSort(number, 0, size - 1);

        for (int i = 0; i < size; i++) {
            bw.append((i > 0 ? "+" : "") + number[i]);
        }
        bw.newLine();
        bw.flush();
    }


    static int partition(int arr[], int left, int right) {
        int pivot = arr[(left + right) / 2];
        int i = left, j = right;
        int tmp;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }


}
