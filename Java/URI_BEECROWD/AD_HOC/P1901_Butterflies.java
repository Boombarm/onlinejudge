package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 *
 */
//URI Online Judge | 1901 Butterflies https://www.urionlinejudge.com.br/judge/en/problems/view/1901
//Accepted 09/10/2015 - 12:16:15 Runtime:0.124s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1901_Butterflies {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] species = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] butterflies = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                species[i][j] = Integer.parseInt(butterflies[j]);
            }
        }

        ArrayList<Integer> collection = new ArrayList<Integer>();
        for (int i = 0; i < n * 2; i++) {
            String[] searcePlace = br.readLine().split(" ");
            int x = Integer.parseInt(searcePlace[0]);
            int y = Integer.parseInt(searcePlace[1]);
            if (collection.size() == 0) {
                collection.add(species[x - 1][y - 1]);
            } else {
                if (!collection.contains(species[x - 1][y - 1])) {
                    collection.add(species[x - 1][y - 1]);
                }
            }
        }
        System.out.println(collection.size());

    }

}
