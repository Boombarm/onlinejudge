/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1025 Where is the Marble
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1025
 * @Timelimit: 2 sec
 * @Status: Accepted 27/11/2015 - 03:40:33 Runtime:0.180s
 * @Solution: Quick sort & binary search
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1025_Where_is_the_Marble {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        int t = 1;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int q = Integer.parseInt(st[1]);
            int[] number = new int[n];
            for (int i = 0; i < n; i++) {
                number[i] = Integer.parseInt(br.readLine());
            }
            quickSort(number, 0, number.length - 1);

            bw.append("CASE# " + t + ":\n");
            for (int i = 0; i < q; i++) {
                int find = Integer.parseInt(br.readLine());
                int position = binarySearch(number, find);
                bw.append(find + " " + (position < 0 ? "not found" : "found at " + position) + "\n");
            }
            t++;

        }
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

    static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else if (low != mid) { //Equal but range is not fully scanned
                high = mid; //Set upper bound to current number and rescan
            } else {
                return mid + 1;
            }
        }
        return -1;  // key not found.
    }

}
