package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1591 Grandma's Day https://www.urionlinejudge.com.br/judge/en/problems/view/1591
//Accepted 06/10/2015 - 08:17:30 Runtime:0.100s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1591_Grandma_Day {

    static int h, w;
    static char[][] wordTable;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] wh = br.readLine().split(" ");
            h = Integer.parseInt(wh[0]);
            w = Integer.parseInt(wh[1]);
            wordTable = new char[h][w];
            for (int r = 0; r < h; r++) {
                String s = br.readLine();
                for (int c = 0; c < w; c++) {
                    wordTable[r][c] = s.charAt(c);
                }
            }

            int findAmount = Integer.parseInt(br.readLine());
            for (int j = 0; j < findAmount; j++) {
                String word = br.readLine();
                int wordSize = word.length();
                int found = 0;
                if (wordSize == 1) {
                    for (int r = 0; r < h; r++) {
                        for (int c = 0; c < w; c++) {
                            if (wordTable[r][c] == word.charAt(0)) {
                                found++;
                            }
                        }
                    }
                } else {
                    for (int r = 0; r < h; r++) {
                        for (int c = 0; c < w; c++) {
                            if (wordTable[r][c] == word.charAt(0)) {
                                //find Right
                                if (c <= w - wordSize) {
                                    found += findRight(word, r, c);
                                }

                                //find Bottom
                                if (r <= h - wordSize) {
                                    found += findBottom(word, r, c);
                                }
                            }
                        }
                    }
                }

                System.out.println(found);
            }

        }
    }

    static int findRight(String word, int r, int c) {
        int same = 0;
        for (int i = 0; i < word.length(); i++) {
            if (wordTable[r][c] == word.charAt(i)) {
                same++;
            }
            c++;
        }
        if (same == word.length()) {
            return 1;
        }

        return 0;
    }

    static int findBottom(String word, int r, int c) {
        int same = 0;
        for (int i = 0; i < word.length(); i++) {
            if (wordTable[r][c] == word.charAt(i)) {
                same++;
            }
            r++;
        }
        if (same == word.length()) {
            return 1;
        }

        return 0;
    }

}
