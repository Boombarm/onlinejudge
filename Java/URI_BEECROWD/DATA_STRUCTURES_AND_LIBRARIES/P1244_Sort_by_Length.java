package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong Solution: bubble sort
 */
//URI Online Judge | 1244 Sort by Length https://www.urionlinejudge.com.br/judge/en/problems/view/1244
//Accepted 12/10/2015 - 02:55:19 Runtime:0.228s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1244_Sort_by_Length {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] textList = br.readLine().split(" ");
            sortByLength(textList);

            for (int j = 0; j < textList.length; j++) {
                System.out.print(j != textList.length - 1 ? textList[j] + " " : textList[j]);
            }
            System.out.println();
        }
    }

    static void sortByLength(String[] textList) {
        while (true) {
            boolean found = false;
            for (int i = 0; i < textList.length - 1; i++) {
                if (textList[i].length() < textList[i + 1].length()) {
                    String tmp = textList[i];
                    textList[i] = textList[i + 1];
                    textList[i + 1] = tmp;
                    found = true;
                }
            }
            if (!found) {
                break;
            }
        }
    }

}
