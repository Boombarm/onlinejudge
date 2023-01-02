package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1261 Hay Points https://www.urionlinejudge.com.br/judge/en/problems/view/1261
//Accepted 02/10/2015 - 00:26:19 Runtime:0.224s
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1261_Hay_Points {

    static Map<String, Integer> wordPoint = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordAmout = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 0; i < wordAmout; i++) {
            String word = sc.next();
            int point = sc.nextInt();
            wordPoint.put(word, point);
        }

        for (int i = 0; i < t; i++) {
            long answer = 0;
            while (true) {
                String text = sc.next();
                if (text.equals(".")) {
                    break;
                }
                if (wordPoint.get(text) != null) {
                    answer += wordPoint.get(text);
                }
            }
            System.out.println(answer);
        }
    }

}
