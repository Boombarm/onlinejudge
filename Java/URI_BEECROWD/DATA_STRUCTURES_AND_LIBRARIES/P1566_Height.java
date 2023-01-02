package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong solution: Counting sort
 */
//URI Online Judge | 1566 Height https://www.urionlinejudge.com.br/judge/en/problems/view/1566
//Accepted 15/10/2015 - 11:26:35 Runtime:1.660s
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1566_Height {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            String st[] = br.readLine().split(" ");
            int[] numberList = new int[m];
            for (int j = 0; j < m; j++) {
                numberList[j] = Integer.parseInt(st[j]);
            }

            numberList = countingSort(numberList);

            for (int j = 0; j < numberList.length; j++) {
                bw.write(j != numberList.length - 1 ? numberList[j] + " " : numberList[j] + "");
            }
            bw.newLine();
            bw.flush();
        }
    }

    static int[] countingSort(int[] values) {
        int[] counts = new int[231];
        for (int i = 0; i < values.length; i++) {
            counts[values[i]]++;
        }

        int total = 0;
        for (int i = 0; i <= 230; i++) {
            int count = counts[i];
            counts[i] = total;
            total += count;
        }

        int[] sortedValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            sortedValues[counts[values[i]]] = values[i];
            counts[values[i]]++;
        }
        return sortedValues;
    }

}
