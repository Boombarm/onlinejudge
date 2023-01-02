/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1607 Advancing Letters
 * @Timelimit: 1 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1607
 * @Status: Accepted 09/10/2015 - 06:36:24 Runtime:0.072s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1607_Advancing_Letters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (true) {
            String line = br.readLine();
            if (!line.isEmpty()) {
                count++;
                String[] letters = line.split(" ");
                if (letters[0].equals(letters[1])) {
                    System.out.println("0");
                } else {
                    int length;
                    if (letters[0].length() <= letters[1].length()) {
                        length = letters[0].length();
                    } else {
                        length = letters[0].length() - letters[1].length();
                    }

                    int answer = 0;
                    for (int j = 0; j < length; j++) {
                        if (letters[0].charAt(j) <= letters[1].charAt(j)) {
                            answer += (letters[1].charAt(j) - letters[0].charAt(j));
                        } else {
                            answer += (26 - (letters[0].charAt(j) - letters[1].charAt(j)));
                        }
                    }

                    System.out.println(answer);
                }
            }
            if (count == n) {
                break;
            }
        }

    }

}
