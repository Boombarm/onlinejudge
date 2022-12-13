package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong solution: shell Sort
 */
//URI Online Judge | 1088 Bubbles and Buckets https://www.urionlinejudge.com.br/judge/en/problems/view/1088
//Accepted 15/10/2015 - 14:33:50 Runtime:0.616s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1088_Bubbles_and_Buckets {

    static int counting;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("0")) {
                break;
            }
            int n = Integer.parseInt(s[0]);
            int[] number = new int[n];
            for (int i = 1; i <= n; i++) {
                number[i - 1] = Integer.parseInt(s[i]);
            }
            counting = 0;
            shellSort(number);

            if (counting % 2 == 0) {
                System.out.println("Carlos");
            } else {
                System.out.println("Marcelo");
            }
        }
    }

    static void shellSort(int[] arr) {
        int i, j;
        int temp;
        int k = 1;
        while (k <= arr.length / 3) {
            k = k * 3 + 1;
        }

        while (k > 0) {
            for (i = k; i < arr.length; i++) {
                temp = arr[i];
                j = i;
                while (j > k - 1 && arr[j - k] >= temp) {
                    arr[j] = arr[j - k];
                    j -= k;
                    counting++;
                }
                arr[j] = temp;
            }
            k = (k - 1) / 3;
        }
    }

}
