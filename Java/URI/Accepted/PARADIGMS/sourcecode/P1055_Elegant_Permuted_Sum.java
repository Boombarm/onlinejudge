/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: PARADIGMS
 * @Problem: 1055 - Elegant Permuted Sum
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1055
 * @Level: 9
 * @LANGUAGE: Java 8 (OpenJDK 1.8.0) [+2s]
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/18/19, 4:29:01 PM
 * @Runtime: 0.132s
 * @Solution: Sort แล้วหาการต่อ pattern ให้ได้ผลรวม มากที่สุด
 * @Note:
 */

package URI.Accepted.PARADIGMS.sourcecode;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1055_Elegant_Permuted_Sum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int c = 1; c <= t; c++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int[] number = new int[n];
            for (int i = 0; i < n; i++) {
                number[i] = Integer.parseInt(st[i + 1]);
            }
            mergeSort(number, 0, n - 1);

            int i = 0, j = n - 1;
            int L = number[i++];
            int R = number[j--];
            int maxSum = L - R;
            while (i <= j) {
                int IL = Math.abs(L - number[i]);//ใส่ ซ้าย
                int IR = Math.abs(R - number[i]);//ใส่ ขวา
                int LJ = Math.abs(L - number[j]);//ใส่ ซ้าย
                int RJ = Math.abs(R - number[j]);//ใส่ขวา

                if (IL >= IR && IL >= LJ && IL >= RJ) {//เอา I ใส่ซ้าย ได้ค่ามากสุด
                    maxSum += Math.abs(L - number[i]);
                    L = number[i++];
                } else if (IR >= IL && IR >= LJ && IR >= RJ) {//เอา I ใส่ขวา ได้ค่ามากสุด
                    maxSum += Math.abs(R - number[i]);
                    R = number[i++];
                } else if (LJ >= IL && LJ >= IR && LJ >= RJ) {//เอา J ใส่ซ้าย ได้ค่ามากสุด
                    maxSum += Math.abs(L - number[j]);
                    L = number[j--];
                } else if (RJ >= IL && RJ >= IR && RJ >= LJ) {//เอา J ใส่ขวา ได้ค่ามากสุด
                    maxSum += Math.abs(R - number[j]);
                    R = number[j--];
                }
            }
            bw.append("Case " + c + ": " + maxSum + "\n");
        }
        bw.flush();
    }


    static void mergeSort(int[] data, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(data, left, mid);
        mergeSort(data, mid + 1, right);
        merge(data, left, mid, right);
    }

    static void merge(int[] data, int left, int mid, int right) {
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1], R = new int[n2];
        for (i = 0; i < n1; i++) L[i] = data[left + i];
        for (j = 0; j < n2; j++) R[j] = data[mid + 1 + j];

        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            //compare
            if (L[i] >= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }

}