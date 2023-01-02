package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong Solution: Bubble Sort
 */
//URI Online Judge | 1162 Train Swapping https://www.urionlinejudge.com.br/judge/problems/view/1162/rate:1162/rating:1
//Accepted 14/10/2015 - 10:17:49 Runtime:0.332s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1162_Train_Swapping {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] number = new int[m];
            for (int j = 0; j < m; j++) {
                number[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println("Optimal train swapping takes " + bubbleSort(number) + " swaps.");
        }
    }

    static int bubbleSort(int[] number) {
        int swapped = 0;
        while (true) {
            boolean found = false;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i + 1] < number[i]) {
                    int tmp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = tmp;
                    swapped++;
                    found = true;
                }
            }
            if (!found) {
                break;
            }
        }
        return swapped;
    }

}
